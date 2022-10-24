package com.stussy.stussyclone20220930hyeseong.service;

import com.stussy.stussyclone20220930hyeseong.dto.CollectionListResqDto;

import java.util.Collection;
import java.util.List;

public interface ProductService {
    public List<CollectionListResqDto> getProductList(String category, int page) throws Exception;
}
