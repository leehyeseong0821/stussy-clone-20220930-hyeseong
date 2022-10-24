package com.stussy.stussyclone20220930hyeseong.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CollectionListResqDto {
    private int productId;
    private String productName;
    private int productPrice;
    private String mainImg;
    private int productTotalCount;

}
