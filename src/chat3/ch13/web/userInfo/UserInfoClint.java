package src.chat3.ch13.web.userInfo;

import src.chat3.ch13.domain.userinfo.UserInfo;
import src.chat3.ch13.domain.userinfo.deo.UserInfoDao;
import src.chat3.ch13.domain.userinfo.deo.mysql.UserInfoMySqlDao;
import src.chat3.ch13.domain.userinfo.deo.oracle.UserInfoOracleDao;

import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClint {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DB-TYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("이순신");
        userInfo.setPasswd("1234");
        userInfo.setUserName("Lee");

        UserInfoDao userInfoDao = null;
        if(dbType.equals("ORACLE"))
            userInfoDao = new UserInfoOracleDao();

        else if(dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        }
        else {
            System.out.println("db error");
            return;
        }
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInf(userInfo);
    }
}
