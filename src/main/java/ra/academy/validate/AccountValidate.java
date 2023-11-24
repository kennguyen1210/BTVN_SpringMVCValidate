package ra.academy.validate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ra.academy.dto.FormRegister;
import ra.academy.service.AccountService;

import javax.xml.ws.Action;
import java.time.LocalDate;
import java.util.Date;

@Component
public class AccountValidate implements Validator {
    public static final String REGEX = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    public static final String PASSWORD = "^[A-Z]\\w{5,}$";
    public static final String PHONE = "^0[0-9]{9,10}$";
    @Autowired
    private AccountService accountService;
    @Override
    public boolean supports(Class<?> clazz) {
        return FormRegister.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        FormRegister form = (FormRegister) target;
        if(form.getUserName().isEmpty()){
            errors.rejectValue("userName","mess.err.empty","Khong de trong truong nay");
        } else if (accountService.checkExistByUserName(form.getUserName())) {
            errors.rejectValue("userName","mess.err.exist","User da ton tai");
        }
        if(form.getPassword().isEmpty()){
            errors.rejectValue("password","mess.err.empty","Khong de trong truong nay");
        } else if (!form.getPassword().matches(PASSWORD)) {
            errors.rejectValue("password","mess.err.min","Password phai co it nhat 6 ky tu, va viet hoa ky tu dau");
        }
        if(!form.getRePassword().equals(form.getPassword())){
            errors.rejectValue("rePassword","mess.err.not-match","Mat khau xac nhan chua dung");
        }
        if(form.getEmail().isEmpty()){
            errors.rejectValue("email","mess.err.empty","Khong de trong truong nay");
        } else if (!form.getEmail().matches(REGEX)) {
            errors.rejectValue("email","mess.err.regex","Khong dung dinh dang!");
        }
        if(form.getPhone().isEmpty()){
            errors.rejectValue("phone","mess.err.empty","Khong de trong truong nay");
        } else if (!form.getPhone().matches(PHONE)) {
            errors.rejectValue("phone","mess.err.regex","Khong dung dinh dang!");
        }
        if(form.getBirthDay().isEmpty()){
            errors.rejectValue("birthDay","mess.err.empty","Khong de trong truong nay");
        } else if (LocalDate.parse(form.getBirthDay()).isAfter(LocalDate.now())){
            errors.rejectValue("birthDay","mess.err.date","Ngay sinh phai truoc thoi gian hien tai!");
        }
        if(form.getFullName().isEmpty()){
            errors.rejectValue("fullName","mess.err.empty","Khong de trong truong nay");
        }
    }
}
