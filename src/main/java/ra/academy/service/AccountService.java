package ra.academy.service;

import org.springframework.stereotype.Service;
import ra.academy.dto.FormRegister;
import ra.academy.model.Account;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {
    private static List<Account> accounts = new ArrayList<>();
    static {
        accounts.add(new Account(1L,"hunghx","123456","abc@gmail.com","0348513123","Ho Xuan Hung", LocalDate.now()));
        accounts.add(new Account(2L,"xuannv","123456","def@gmail.com","0349112123","Nguyen Van Xuan", LocalDate.now()));
        accounts.add(new Account(3L,"hueht","123456","ghj@gmail.com","0347456123","Hoang Thi Hue", LocalDate.now()));
    }
    public void addAccount(FormRegister form){
        accounts.add(new Account(getNewId(), form.getUserName(), form.getPassword(), form.getEmail(), form.getPhone(), form.getFullName(),LocalDate.parse(form.getBirthDay())));
    }
    public Long getNewId(){
        return accounts.stream().map(Account::getId).max(Long::compareTo).orElse(0L)+1;
    }
    public boolean checkExistByUserName(String userName){
        return accounts.stream().anyMatch(acc->acc.getUserName().equals(userName));
    }
    public boolean checkExistByEmail(String email){
        return accounts.stream().anyMatch(acc->acc.getEmail().equals(email));
    }
    public boolean checkExistByPhone(String phone){
        return accounts.stream().anyMatch(acc->acc.getUserName().equals(phone));
    }
}
