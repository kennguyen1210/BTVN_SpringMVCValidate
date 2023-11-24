package ra.academy.dto;

import java.time.LocalDate;
import java.util.Date;

public class FormRegister {
    private String userName;
    private String password;
    private String rePassword;
    private String email;
    private String phone;
    private String fullName;
    private String birthDay;

    public FormRegister() {
    }

    public FormRegister(String userName, String password, String rePassword, String email, String phone, String fullName, String birthDay) {
        this.userName = userName;
        this.password = password;
        this.rePassword = rePassword;
        this.email = email;
        this.phone = phone;
        this.fullName = fullName;
        this.birthDay = birthDay;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}
