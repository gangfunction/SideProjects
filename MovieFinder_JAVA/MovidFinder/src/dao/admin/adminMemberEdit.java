package dao.admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;
//안녕하세욤
public class adminMemberEdit {
    protected adminMemberEdit() {
        try{
            String sql = "select * from member ";
            PreparedStatement stmt = Objects.requireNonNull(MysqlDao.getConnection()).prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getString("id") + " " + rs.getString("pwd") + " " + rs.getString("admin"));
            }// 업데이트 할 이름의 아이디를 입력받는다.
            System.out.println("수정할 행의 아이디를 입력하세요.");
            Scanner sc = new Scanner(System.in);
            String id = sc.nextLine();
            //어떤 것을 수정하시겠습니까?
            System.out.println("수정할 항목을 선택하세요.");
            System.out.println("1. 비밀번호");
            System.out.println("2. 어드민 여부");
            String select = sc.nextLine();
            switch (select) {
                case "1" -> {
                    System.out.println("변경할 비밀번호를 입력하세요.");
                    String pwd = sc.nextLine();
                    String sql2 = "update member set pwd=? where id=?";
                    PreparedStatement stmt2 = MysqlDao.getConnection().prepareStatement(sql2);
                    stmt2.setString(1, pwd);
                    stmt2.setString(2, id);
                    stmt2.executeUpdate();
                    System.out.println("비밀번호가 변경되었습니다.");
                }
                case "2" -> {
                    System.out.println("변경할 어드민 여부를 입력하세요.");
                    boolean admin = sc.nextBoolean();
                    String sql3 = "update member set admin=? where id=?";
                    PreparedStatement stmt3 = MysqlDao.getConnection().prepareStatement(sql3);
                    stmt3.setBoolean(1, admin);
                    stmt3.setString(2, id);
                    stmt3.executeUpdate();
                    System.out.println("어드민 여부가 변경되었습니다.");
                }
                default -> System.out.println("잘못 입력하셨습니다.");
            }
            new adminMenu();
            } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
