package com.stussy.stussyclone20220930hyeseong.repository.admin;

import com.stussy.stussyclone20220930hyeseong.domain.OptionProductMst;
import com.stussy.stussyclone20220930hyeseong.domain.Product;
import com.stussy.stussyclone20220930hyeseong.domain.ProductCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductManagementRepository {
    public List<ProductCategory> getCategoryList() throws Exception;
    public int saveProductMst(Product product) throws Exception;
    public List<OptionProductMst> getProductMstList() throws Exception;
}
