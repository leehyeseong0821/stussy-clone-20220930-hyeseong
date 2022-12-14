package com.stussy.stussyclone20220930hyeseong.domain;


import com.stussy.stussyclone20220930hyeseong.dto.admin.CategoryResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductCategory {

    private int category_id;
    private int group_id;
    private String category_name;

    public CategoryResponseDto toDto() {
        return CategoryResponseDto.builder()
                .id(category_id)
                .name(category_name)
                .build();
    }

}
