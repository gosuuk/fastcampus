package src.chat3.ch13.domain.userinfo.deo.oracle;

import src.chat3.ch13.domain.userinfo.UserInfo;
import src.chat3.ch13.domain.userinfo.deo.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into ORACLE DB userId =" + userInfo.getUserId() );
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into ORACLE DB userId = " + userInfo.getPasswd());
    }

    @Override
    public void deleteUserInf(UserInfo userInfo) {
        System.out.println("delete into ORACLE DB userId = " + userInfo.getUserName());

    }

}
