package Assignment_12_Oct;

import java.util.List;
public class Main_Class 
{
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		productList.forEach(System.out::println);
	}
}
