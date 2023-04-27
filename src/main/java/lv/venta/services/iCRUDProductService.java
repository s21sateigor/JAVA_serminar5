package lv.venta.services;

import lv.venta.model.*;
import java.util.ArrayList;

public interface iCRUDProductService {
	//CRUD
	//C - create
	void addNewProduct(String title, String description, float price, int quantity) throws Exception;
	
	//R - retrieve - all
	ArrayList<Product> retrieveAllproducts();
	
	//R - retrieve - by id
	Product retrieveProductsById(long id) throws Exception;
			
	//U - update 
	void updateProductById(long id, String title, String description, float price, int quantity) throws Exception;
			
	//D - delete
	void deleteById(long id) throws Exception;
}
