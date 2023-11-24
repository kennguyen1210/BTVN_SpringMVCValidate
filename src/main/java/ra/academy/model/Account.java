package ra.academy.model;

import java.time.LocalDate;

public class Account {
    private Long id;
    private String userName;
    private String password;
    private String email;
    private String phone;

    private String fullName;
    private LocalDate brithDay;

    public Account() {
    }

    public Account(Long id, String userName, String password, String email, String phone, String fullName, LocalDate brithDay) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.fullName = fullName;
        this.brithDay = brithDay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getBrithDay() {
        return brithDay;
    }

    public void setBrithDay(LocalDate brithDay) {
        this.brithDay = brithDay;
    }
}
