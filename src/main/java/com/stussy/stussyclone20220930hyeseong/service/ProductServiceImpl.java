package com.stussy.stussyclone20220930hyeseong.service;

import com.stussy.stussyclone20220930hyeseong.dto.CollectionListResqDto;
import com.stussy.stussyclone20220930hyeseong.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<CollectionListResqDto> getProductList(String category, int page) throws Exception {
        List<CollectionListResqDto> productList = new ArrayList<CollectionListResqDto>();

        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("category", category);
        map.put("index", (page -1)* 16);

        productRepository.getProductList(map).forEach(collectionsProduct -> {
            productList.add(collectionsProduct.toDto());
        });


        return productList;
    }

}