package dao.reviewPage;

import dao.member.memberWatched;
import dao.member.memberWatchedSelect;
import service.serviceMenu;

import java.sql.SQLException;
import java.util.Scanner;

public class reviewMenu {
    protected reviewMenu() throws SQLException, ClassNotFoundException {
        //게시판 출력
        System.out.println("1. 게시판 출력 2. 게시판 입력 3. 게시판 수정 4. 게시판 삭제 5. 종료");
        Scanner sc = new Scanner(System.in);

        //입력받은 번호에 따라 처리
        int num = sc.nextInt();
        switch (num) {
            case 1 -> {
                System.out.println("게시판 출력");
                new reviewShow();
                new reviewMenu();
            }
            case 2 -> {
                System.out.println("게시판 입력");
                new memberWatched();
                new memberWatchedSelect();
                new reviewInput();
                new reviewMenu();
                new reviewInsert();
                new reviewMenu();
            }
            case 3 -> {
                System.out.println("게시판 수정");
                new reviewUpdate();
                new reviewMenu();
            }
            case 4 -> {
                System.out.println("게시판 삭제");
                new reviewDelete();
                new reviewMenu();
            }
            case 5 -> {
                System.out.println("종료");
                new serviceMenu();
            }
            default -> System.out.println("잘못 입력하셨습니다.");
        }
    }



}

