package dao.admin;

import service.serviceMenu;

import java.sql.SQLException;
import java.util.Scanner;

public class adminMenu {
    public adminMenu() throws SQLException, ClassNotFoundException {
        System.out.println( "1. 회원 목록 조회" );
        System.out.println( "2. 회원 정보 수정" );
        System.out.println( "3. 회원 삭제" );
        System.out.println( "4. 영화 목록 조회" );
        System.out.println( "5. 영화 삭제" );
        System.out.println( "6. 종료" );
        Scanner sc = new Scanner(System.in);
        System.out.println("실행하실 기능을 선택하세요");
        int select = sc.nextInt();
        switch(select){
            case 1 -> {
                new adminMemberList();
                new adminMenu();
            }
            case 2 -> new adminMemberEdit();
            case 3 -> new adminMemberDelete();
            case 4 -> new adminMovieList();
            case 5 -> new adminMovieDelete();
            case 6 -> new serviceMenu();

        }

    }

}
