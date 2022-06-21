package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DateResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//bu class projede servis görevi görecek şeklinde ayarlanır.Springe iletir.

public class ProductManager implements ProductService {

    private ProductDao productDao;/*soyut bir sınıf yaratıyoruz*/

    @Autowired //autowired spring'ten gelir.Projede ProductDoa ya karşılık gelen bir sınıf olup olmadığını kontrol eder
    /*@Autowired ile yukarıda olustuulan soyut interfacei kullanabiliyoruz*/
    public ProductManager(ProductDao productDao) /*constructed injection işlemi yapılmaktadır.*/ {
        this.productDao = productDao;
    }

    @Override
    public DateResult<List<Product> > getAll() {
        return new SuccessDataResult<List<Product>>
                ( this.productDao.findAll(),"Data listelendi");
/*verilen işlemi return yaptığımızda SuccessDataResult da data =this.productDao.findAll(), durumu success = true
* ve message ise "Data listelendi" şeklinde verilmiştir. */


    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);/*save metodu ile ekleme ve güncellemelri hızlı bir şekilde yapabiliriz.*/
        return new SuccessResult("Ürün eklendi");
        /*ekleme operasyonu için altyapımız hazır*/
    }
}
