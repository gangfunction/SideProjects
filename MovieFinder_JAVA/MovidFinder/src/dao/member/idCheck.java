package dao.member;

import dao.register.regProcess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class idCheck {
    public static void action(String id) {
        String sql = "select * from member where id = '" + id + "'";
        try {
            Connection conn = MysqlDao.getConnection();
            Statement stmt = Objects.requireNonNull(conn).createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                System.out.println("아이디 중복 다시입력하세요");
                new regProcess();
            }
            else {
                System.out.println("사용가능한 아이디입니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
