package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Data Access Object
public class AccountDAO {
    private Connection connection;

    public AccountDAO(Connection connection) {
        this.connection = connection;
    }

    // account List
    public List<Account> getAcoountList(){
        // 0 .collection
        List<Account> accountList = new ArrayList<>();

        // 1. sql
        String query = "select * from account_tb";

        // 2. buffer
        try {
            // 2. buffer
            PreparedStatement statement = connection.prepareStatement(query);

            // 3. send
            ResultSet rs = statement.executeQuery();

            // 4. cursor while
            while (rs.next()){
                // 5. mapping (db result -> model)
                Account account = new Account(
                        rs.getInt("account_number"),
                        rs.getString("account_password"),
                        rs.getInt("account_balance"),
                        rs.getTimestamp("account_created_at")
                );
                // 6. collect
                accountList.add(account);
            }
            return accountList; // size = 3
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accountList; // size = 0
    }

    // account one
    public Account getAccountNumber(int accountNumber){
        // 1. sql
        String query = "select * from account_tb where account_number = ?";

        // 2. buffer
        try {
            // 2. buffer
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, accountNumber);

            // 3. send
            ResultSet rs = statement.executeQuery();

            // 4. mapping (db result -> model)
            if(rs.next()){
                Account account = new Account(
                        rs.getInt("account_number"),
                        rs.getString("account_password"),
                        rs.getInt("account_balance"),
                        rs.getTimestamp("account_created_at")
                );
                return account;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void createAccount(int accountNumber, String accountPassword){
        // 1. sql
        String query = "insert into account_tb values(?, ?, 1000, now())";

        try {
            // 2. buffer
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(2, accountPassword);
            statement.setInt(1, accountNumber);

            // 3. send
            int result = statement.executeUpdate();
            System.out.println("result : "+result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // account balance update
    public void updateAccount(int accountBalance, int accountNumber){
        // 1. sql
        String query = "update account_tb set account_balance = ? where account_number = ?";

        try {
            // 2. buffer
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, accountBalance);
            statement.setInt(2, accountNumber);

            // 3. send
            int result = statement.executeUpdate();
            System.out.println("result : "+result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteAccount(int accountNumber){
        // 1. sql
        String query = "DELETE FROM account_tb WHERE account_number = ?";

        try {
            // 2. buffer
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, accountNumber);

            // 3. send
            int result = statement.executeUpdate();
            System.out.println("result : "+ result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}