package solutions.javasoft.dao.repository;

import org.springframework.data.repository.CrudRepository;
import solutions.javasoft.dao.model.Product;
import java.util.List;


public interface ProductRepository extends CrudRepository<Product, String>{
    List<Product> findByCodeLike(String code);
}