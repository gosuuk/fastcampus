package src.chat3.ch13.domain.userinfo.deo.mysql;

import src.chat3.ch13.domain.userinfo.UserInfo;
import src.chat3.ch13.domain.userinfo.deo.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao{

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into MYSQL DB userId =" + userInfo.getUserId() );
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MYSQL DB userId = " + userInfo.getPasswd());
    }

    @Override
    public void deleteUserInf(UserInfo userInfo) {
        System.out.println("delete from MYSQL DB userId = " + userInfo.getUserName());

    }

}


