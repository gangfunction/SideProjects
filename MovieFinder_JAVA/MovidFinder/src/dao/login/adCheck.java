package dao.login;

import dto.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class adCheck {
    adCheck(){
        try{
            String sql= "select admin from member where id = ? and pwd=?";
            PreparedStatement stmt = Objects.requireNonNull(MysqlDao.getConnection()).prepareStatement(sql);
            stmt.setString(1, User.getId() );
            stmt.setString(2, User.getPwd() );
            ResultSet rs = stmt.executeQuery();
            if(rs.next() && rs.getInt("admin") == 1){
                System.out.println("관리자입니다.");
                User.setAdmin(true);
            }else{
                User.setAdmin(false);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
