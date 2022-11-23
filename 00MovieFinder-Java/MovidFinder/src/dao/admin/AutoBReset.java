package dao.admin;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class AutoBReset {
    public AutoBReset(){
        String sql= "alter table `box_office` auto_increment=1";
        String sql2=  "set @count =0";
        String sql3= "update `box_office` set `box_office`.num = @count:=@count+1";
        try{
            PreparedStatement stmt = Objects.requireNonNull(MysqlDao.getConnection()).prepareStatement(sql);
            stmt.execute();
            PreparedStatement stmt2 = MysqlDao.getConnection().prepareStatement(sql2);
            stmt2.execute();
            PreparedStatement stmt3 = MysqlDao.getConnection().prepareStatement(sql3);
            stmt3.execute();
            System.out.println("자동증가 초기화가 완료되었습니다.");
            new adminMenu();
        }
        catch(SQLException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
