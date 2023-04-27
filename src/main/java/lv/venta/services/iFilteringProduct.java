package lv.venta.services;

import java.util.ArrayList;

import lv.venta.model.Product;

public interface iFilteringProduct {
	
	//filter product: price less than X
	ArrayList<Product> filterByPriceLessThan(float priceThreshold) throws Exception;
	
	//filter product: quantity less than X
	ArrayList<Product> filterByQuantityLessThan(int quantityTreshold) throws Exception;
	
	//filter product: sorting
	//TODO asc or desc
	ArrayList<Product> sort();
	
}
