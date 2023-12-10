package jp.co.okasan.controllers;

import jp.co.okasan.core.errorhandler.domain.ApiResponse;
import jp.co.okasan.core.errorhandler.domain.ResponseResult;
import jp.co.okasan.core.utils.CsvExecutorService;
import jp.co.okasan.domain.request.SearchUserRequest;
import jp.co.okasan.domain.response.Product;
import jp.co.okasan.entity.MUserRequestImage;
import jp.co.okasan.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final CsvExecutorService csvExecutorService;

    @PostMapping("/request-image")
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse addRequestImage(@Valid @RequestBody MUserRequestImage image) {
        return ApiResponse.builder()
                .result(
                        ResponseResult.builder().messages(List.of(userService.addRequestImage(image))).build())
                .build();
    }

    @PostMapping("/upload-csv")
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse uploadCsv(@RequestParam("file") MultipartFile file) throws IOException {
        return ApiResponse.builder()
                .build();
    }

    @GetMapping(value = "/export-csv", produces = "text/csv")
    public ResponseEntity<ByteArrayResource> getCsv() throws IOException {
        List<Product> products = new ArrayList<>();
        Product product = new Product();
        product.setProductNumber("DEMO");
        product.setDescription("DEMO");
        product.setUnitPrice(1);
        products.add(product);
        ByteArrayResource resource = new ByteArrayResource(csvExecutorService.toBytes(products));
        return ResponseEntity.ok()
                .contentLength(resource.contentLength())
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        ContentDisposition.attachment()
                                .filename("demo.csv")
                                .build()
                                .toString())
                .body(resource);
    }

    @GetMapping(value = "search-user-request", produces = {"application/json"})
    public ApiResponse searchUserRequest(@RequestBody SearchUserRequest searchUserRequest) throws ParseException {
        return userService.searchUserRequest(searchUserRequest);
    }
}
