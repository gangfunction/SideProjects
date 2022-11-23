package dao.reviewPage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

public class reviewUpdate{
    protected reviewUpdate() throws SQLException, ClassNotFoundException {
        System.out.println("영화리뷰 수정");
        Scanner sc = new Scanner(System.in);
        System.out.println("수정하실 리뷰의 번호를 입력하세요");
        int num = sc.nextInt();
        System.out.println("수정하실 리뷰의 제목을 입력하세요");
        String title = sc.next();
        System.out.println("수정하실 리뷰의 내용을 입력하세요");
        String content = sc.next();
        Connection conn = MysqlDao.getConnection();
        String sql = "update review set title = ?, content = ? where num = ?";
        PreparedStatement stmt;
        try {
            stmt = Objects.requireNonNull(conn).prepareStatement(sql);
            stmt.setString(1, title);
            stmt.setString(2, content);
            stmt.setInt(3, num);
            stmt.executeUpdate();
            System.out.println("수정 완료");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
