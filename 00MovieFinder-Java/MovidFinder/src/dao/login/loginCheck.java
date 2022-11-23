package dao.login;

import dto.User;
import service.serviceMenu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;


public class loginCheck  {
    protected loginCheck() {
        try{
        //member 테이블에서 아이디와 비밀번호가 일치하는지 확인
        String sql = "select * from member where id=? and pwd=?";
        Connection conn = MysqlDao.getConnection();
        PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement(sql);
        stmt.setString(1, User.getId());
        stmt.setString(2, User.getPwd());
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
            new serviceMenu();
        }
    }
    catch (SQLException | ClassNotFoundException e) {
        throw new RuntimeException(e);
    }
    }
}
