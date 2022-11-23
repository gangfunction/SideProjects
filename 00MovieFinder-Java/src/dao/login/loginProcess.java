package dao.login;

import dao.admin.adminMenu;
import dto.User;
import service.serviceMenu;

import java.sql.SQLException;


public class loginProcess {
    //로그인 처리 db
    protected loginProcess() throws SQLException, ClassNotFoundException {
        new loginInput();
        new adCheck();
        new loginCheck();
        User.setIsin(true);
        if (User.getAdmin()) {
            System.out.println("관리자 로그인 성공");
            new loginUpdate();
            new loginSave();
            new adminMenu();
        }
        else
        {
            System.out.println("일반 회원 로그인");
            new serviceMenu();
        }
    }

}// 로그인 처리



