package service;

import dao.myPage.myPage;
import dao.register.regProcess;
import dto.User;

import java.sql.SQLException;

public class PageorRegister {
    public PageorRegister() throws SQLException, ClassNotFoundException {
        if(User.getIsin()){
            new myPage();
        }
        else{
            new regProcess();
        }
        new serviceMenu();
    }
}
