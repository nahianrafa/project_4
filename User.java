
package com.mycompany.prblm_4;

// User.java
public class User {
    private String userId;
    private String name;
    private String email;
    private Account account;
    private Address address;

    public User(String userId, String name, String email, Address address) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getAddress() {
        return address;
    }
}
