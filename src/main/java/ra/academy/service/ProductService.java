package ra.academy.service;

import org.springframework.stereotype.Service;
import ra.academy.dto.FormRequest;
import ra.academy.model.Product;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    private static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1L,"Quan au nam","Hang viet nam chat luong cao",150000.0,20, true));
        products.add(new Product(2L,"Quan dui nam","Hang viet nam chat luong trung binh",80000.0,10, true));
        products.add(new Product(3L,"Ao so mi nam","Hang viet nam chat luong cao",100000.0,30, true));

    }
    public void addProduct(FormRequest form){
        products.add(new Product(getNewId(), form.getName(), form.getDes(), form.getPrice(), form.getStock(), true));
    }
    public Long getNewId(){
        return products.stream().map(Product::getId).max(Long::compareTo).orElse(0L)+1;
    }
    public boolean checkExistByName(String name){
        return products.stream().anyMatch(pro->pro.getName().equals(name));
    }

}
