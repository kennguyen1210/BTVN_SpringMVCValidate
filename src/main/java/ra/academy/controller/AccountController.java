package ra.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.academy.dto.FormRegister;
import ra.academy.service.AccountService;
import ra.academy.validate.AccountValidate;

@Controller
@RequestMapping({"/account",""})
public class AccountController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private AccountValidate accountValidate;
    @RequestMapping
    public String register(Model model){
        model.addAttribute("account",new FormRegister());
        return "form";
    }
    @RequestMapping("/add")
    public String doAdd(@ModelAttribute("account") FormRegister form, BindingResult bindingResult){
        accountValidate.validate(form,bindingResult);
        if(bindingResult.hasErrors()){
            return "form";
        }
        accountService.addAccount(form);
        return "home";
    }
}
