package kodlamaio.northwind.dataAccess.abstracts;

import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
//JPARepository ile aslında hangi tabloya hangi ID veri tipi ile sorguların hazırlanmazını
    //söylemiş oluyoruz.


}
