package service;

import dao.login.accessProcess;
import dao.movie.movieSearch;
import dao.rescan.resCanProcess;
import dao.reserve.resProcess;
import dao.reviewPage.reviewMain;
import dto.User;
import java.sql.SQLException;
import java.util.Scanner;

public class serviceMenu {

    public serviceMenu() throws SQLException, ClassNotFoundException {


        System.out.println("-------------------------------");
        if (User.getIsin()) {
            System.out.println("아이디 : " + User.getId());
            System.out.println("-------------------------------");
        } else {
            System.out.println("로그인이 필요합니다.");
            System.out.println("-------------------------------");
        }

        if (User.getIsin()) {
            System.out.println("1.로그아웃 2. 마이페이지 3. 영화검색  4. 영화예매  5. 예매취소 6. 리뷰페이지 7.종료");
        } else {
            System.out.println("1. 로그인 2. 회원가입 3. 영화검색 7. 종료");
        }
        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();
        switch (select) {
            case 1 -> new accessProcess();
            case 2 -> new PageorRegister();
            case 3 -> new movieSearch();
            case 4 -> new resProcess();
            case 5 -> new resCanProcess();
            case 6 -> reviewMain.main();
            case 7 -> System.exit(0);
            default -> {
                System.out.println("잘못된 입력");
                new serviceMenu();
            }
        }
    }


}
