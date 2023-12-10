package jp.co.okasan.domain.response;

import com.univocity.parsers.annotations.Parsed;
import lombok.Data;

@Data
public class Product {
    @Parsed(field = "product_no")
    private String productNumber;

    @Parsed
    private String description;

    @Parsed(field = "unit_price")
    private float unitPrice;
}
