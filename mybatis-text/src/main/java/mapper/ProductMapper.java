package mapper;

import java.util.List;

import pojo.Product;

public interface ProductMapper {
	public int insertProduct(Product product);
	public int deleteProduct(int id);
	public int updateProduct(Product product);
	public Product getProduct(int id);
	public List<Product> listProduct(String productName);
	
}
