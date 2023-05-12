package lv.venta.repos;

import lv.venta.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepo extends CrudRepository<Product, Long> {

    boolean existsByTitleAndDescriptionAndPrice(String inputTitle, String inputDescription, float inputPrice);

    Product findByTitleAndDescriptionAndPrice(String inputTitle, String inputDescription, float inputPrice);

}
