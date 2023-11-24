package ra.academy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ra.academy.dto.FormRequest;
import ra.academy.service.ProductService;
import ra.academy.validate.ProductValidate;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductValidate productValidate;
    @RequestMapping("/create")
    public String create(Model model){
        model.addAttribute("product",new FormRequest());
        return "create";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(@ModelAttribute("product") FormRequest form, BindingResult bindingResult){
        productValidate.validate(form,bindingResult);

        if(bindingResult.hasErrors()){
            return "create";
        }
        productService.addProduct(form);
        return "home";
    }
}
