package ra.academy.validate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ra.academy.dto.FormRequest;
import ra.academy.service.ProductService;
@Component
public class ProductValidate implements Validator {
    @Autowired
    private ProductService productService;
    @Override
    public boolean supports(Class<?> clazz) {
        return FormRequest.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        FormRequest form = (FormRequest) target;
        // bat buoc nhap
        // name phai it nhat 10 ky tu, unique
        // price, stock phai lon hon 0
        if(form.getName().isEmpty()){
            errors.rejectValue("name","mess.err.empty","Khong de trong truong nay!");
        } else if (productService.checkExistByName(form.getName())) {
            errors.rejectValue("name","mess.err.unique","Ten nay da ton tai!");
        }
        if(form.getDes().isEmpty()){
            errors.rejectValue("des","mess.err.empty","Khong de trong truong nay!");
        }
        if(Double.isNaN(form.getPrice())){
            errors.rejectValue("price","mess.err.empty","Khong de trong truong nay!");
        } else if (form.getPrice() <= 0) {
            errors.rejectValue("price","mess.err.isValid","Price phai lon hon 0!");
        }
        if(form.getStock() <= 0){
            errors.rejectValue("stock","mess.err.isValid","Stock phai lon hon 0!");
        }
    }
}
