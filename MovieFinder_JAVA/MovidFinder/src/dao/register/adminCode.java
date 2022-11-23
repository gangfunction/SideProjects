package dao.register;

import dto.User;

import java.sql.SQLException;
import java.util.Scanner;

public class adminCode {
    protected adminCode() throws SQLException, ClassNotFoundException {
        System.out.println("관리자 코드 입력");
        Scanner sc = new Scanner(System.in);
        int admin_code = sc.nextInt();
        if(admin_code == 1234){
            System.out.println("관리자 코드 일치합니다.");
            User.setAdmin(true);
        }
        else{
            System.out.println("관리자 코드가 일치하지 않습니다.");
            System.out.println("1. 다시 시도하시겠습니까? (0: 아니오, 1: 다시 시도)");
            int select = sc.nextInt();
            if(select == 0){
                System.out.println("일반회원으로 가입을 진행하겠습니다.");
                User.setAdmin(false);
            }
            else if(select == 1){
                System.out.println("회원가입을 다시 진행하겠습니다.");
                new regProcess();
            }
        }
    }
}
