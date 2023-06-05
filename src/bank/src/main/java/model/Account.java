package model;

import lombok.Getter;

import java.sql.Timestamp;
@Getter
public class Account {
    private int accountNumber;
    private String accountPassword;
    private int acoountBalaned;
    private Timestamp accountCreatedAt;

    public Account(int accountNumber, String accountPassword, int acoountBalaned, Timestamp accountCreatedAt) {
        this.accountNumber = accountNumber;
        this.accountPassword = accountPassword;
        this.acoountBalaned = acoountBalaned;
        this.accountCreatedAt = accountCreatedAt;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountPassword='" + accountPassword + '\'' +
                ", acoountBalaned=" + acoountBalaned +
                ", accountCreatedAt=" + accountCreatedAt +
                '}';
    }
}
