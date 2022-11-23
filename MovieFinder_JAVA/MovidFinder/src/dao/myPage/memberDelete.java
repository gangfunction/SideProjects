package dao.myPage;


import dao.admin.AutoMReset;
import dto.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class memberDelete {
    memberDelete(){
        super();
        String sql = "delete from member where id=?";
        try{
            Connection conn = MysqlDao.getConnection();
            PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement(sql);
            stmt.setString(1, User.getId());
            stmt.executeUpdate();
            System.out.println("회원탈퇴가 완료되었습니다.");
            new AutoMReset();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
