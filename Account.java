
package com.mycompany.prblm_4;

// Account.java
public class Account {
    private String accountId;
    private User user;
    private String username;
    private String password;

    public Account(String accountId, User user, String username, String password) {
        this.accountId = accountId;
        this.user = user;
        this.username = username;
        this.password = password;
        this.user.setAccount(this);
    }

    public String getAccountId() {
        return accountId;
    }

    public User getUser() {
        return user;
    }

    public String getUsername() {
        return username;
    }

    public boolean validatePassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }
}
