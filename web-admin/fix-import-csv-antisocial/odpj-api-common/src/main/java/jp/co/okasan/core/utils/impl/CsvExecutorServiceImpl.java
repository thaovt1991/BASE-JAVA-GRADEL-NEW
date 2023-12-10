package jp.co.okasan.core.utils.impl;

import com.univocity.parsers.common.processor.BeanListProcessor;
import com.univocity.parsers.common.processor.BeanWriterProcessor;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import com.univocity.parsers.csv.CsvWriter;
import com.univocity.parsers.csv.CsvWriterSettings;
import java.io.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import jp.co.okasan.core.utils.CsvExecutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class CsvExecutorServiceImpl implements CsvExecutorService {
  private static final byte[] ZERO_LENGTH_BYTES = new byte[0];

  @Override
  public byte[] toBytes(List<?> lines) throws IOException {

    if (CollectionUtils.isEmpty(lines)) {
      return ZERO_LENGTH_BYTES;
    }
    CsvWriterSettings writerSettings = new CsvWriterSettings();
    BeanWriterProcessor<?> rowProcessor = new BeanWriterProcessor<>(lines.get(0).getClass());
    writerSettings.setRowWriterProcessor(rowProcessor);
    try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
      CsvWriter writer = new CsvWriter(baos, StandardCharsets.UTF_8, writerSettings);
      writer.writeHeaders();
      lines.forEach(writer::processRecord);
      writer.close();
      baos.flush();
      return baos.toByteArray();
    }
  }

  @Override
  public <T> List<T> toListObject(Class<T> inputData, MultipartFile file) throws IOException {
    try (Reader inputReader = new InputStreamReader(file.getInputStream(), "UTF-8")) {
      BeanListProcessor<T> rowProcessor = new BeanListProcessor<>(inputData);
      CsvParserSettings settings = new CsvParserSettings();
      settings.setHeaderExtractionEnabled(true);
      settings.setProcessor(rowProcessor);
      CsvParser parser = new CsvParser(settings);
      parser.parse(inputReader);
      return rowProcessor.getBeans();
    }
  }
}
