package jp.co.okasan.core.utils.impl;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import jp.co.okasan.core.utils.FileStorageService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class S3FileStorageServiceImpl implements FileStorageService {

  //  add this to your source to configuration keys
  //  @Value("${amazonProperties.awsS3AccessKey:}") private String awsS3AccessKey;
  //
  //  @Value("${amazonProperties.secretKey:}") private String secretKey;
  //
  //  @Value("${amazonProperties.defaultS3BucketName:}") private String defaultS3BucketName;
  //
  //  @Value("${amazonProperties.awsRegion:}") private String awsRegion;

  private final AmazonS3 s3client;

  private final String bucketName;

  public S3FileStorageServiceImpl(
      String awsS3AccessKey, String secretKey, String defaultS3BucketName, String awsRegion) {
    AWSCredentials awsCredentials = new BasicAWSCredentials(awsS3AccessKey, secretKey);
    this.s3client =
        AmazonS3ClientBuilder.standard()
            .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
            .withRegion(Regions.fromName(awsRegion))
            .build();
    this.bucketName = defaultS3BucketName;
  }

  @Override
  public String store(File file) {
    if (file == null) {
      log.info("file is null");
      return null;
    }
    return store(file, file.getName());
  }

  @Override
  public String store(File file, String fileName) {
    if (file == null) {
      log.debug("file is null");
      return null;
    }
    fileName = String.format("%d-%s", System.currentTimeMillis(), fileName);
    log.debug("pushing to s3: bucketName = {}, fileName = {}", bucketName, fileName);
    PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, fileName, file);
    s3client.putObject(putObjectRequest);
    URL url = s3client.getUrl(bucketName, fileName);
    log.debug("url = {}", url);
    return url.toString();
  }

  @Override
  public String store(byte[] data, String fileName) {
    return store(new ByteArrayInputStream(data), fileName);
  }

  @Override
  public String store(InputStream data, String fileName) {
    fileName = String.format("%d-%s", System.currentTimeMillis(), fileName);
    ObjectMetadata metadata = new ObjectMetadata();
    PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, fileName, data, metadata);
    s3client.putObject(putObjectRequest);
    URL url = s3client.getUrl(bucketName, fileName);
    log.debug("url = {}", url);
    return url.toString();
  }
}
