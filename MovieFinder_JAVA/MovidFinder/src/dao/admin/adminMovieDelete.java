package dao.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

public class adminMovieDelete {
    protected adminMovieDelete(){
        System.out.println("영화 삭제");
        System.out.println("삭제하실 영화의 제목을 입력하세요");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String sql = "delete from box_office where movie_name like '%" + title + "%'";
        try{
            Connection conn = MysqlDao.getConnection();
            PreparedStatement stmt = Objects.requireNonNull(conn).prepareStatement(sql);
            stmt.executeUpdate();
            System.out.println("삭제가 완료되었습니다.");
            new AutoBReset();
    } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
