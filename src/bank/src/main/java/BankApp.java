import db.DBConnection;
import model.Account;
import model.AccountDAO;

import java.sql.Connection;
import java.util.List;

public class BankApp {
    public static void main(String[] args) {
        Connection connection = DBConnection.getInstaned();

        AccountDAO accountDAO = new AccountDAO(connection);
        // accountDAO.createAccount(, "4567");
        // accountDAO.updateAccount(1000, 1111);
        accountDAO.deleteAccount(2222);
        // Account account = accountDAO.getAccountNumber(2222);
        // System.out.println(account.toString());
        // List<Account> accountList = accountDAO.getAcoountList();
        // System.out.println(accountList.toString());
    }
}
