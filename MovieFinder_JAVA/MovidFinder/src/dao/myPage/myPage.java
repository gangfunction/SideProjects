package dao.myPage;

import dao.rescan.resShow;
import service.serviceMenu;

import java.sql.SQLException;
import java.util.Scanner;

public class myPage {
    public myPage() throws SQLException, ClassNotFoundException {
        System.out.println("마이페이지입니다.");
        System.out.println("1. 정보 수정 2. 회원 탈퇴 3. 예매내역 4. 리뷰작성내역");
        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();
        switch (select) {
            case 1 -> new memberEdit();
            case 2 -> new memberDelete();
            case 3 -> new resShow();
            case 4 -> new memberReview();
            default -> System.out.println("잘못된 입력");
        }

        new serviceMenu();

    }
}
