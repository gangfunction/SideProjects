package dao.reviewPage;

import dao.MysqlDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

public class reviewDelete{
    reviewDelete() {
        System.out.println("영화리뷰 삭제");
        System.out.println("삭제하실 리뷰의 번호를 입력하세요");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Connection conn = MysqlDao.getConnection();
        String sql = "delete from review where num = ?";
        PreparedStatement stmt;
        try {
            stmt = Objects.requireNonNull(conn).prepareStatement(sql);
            stmt.setInt(1, num);
            stmt.executeUpdate();
            System.out.println("삭제 완료");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
