package dao.reviewPage;

import java.util.Scanner;

public class reviewInput {
    protected reviewInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("제목을 입력하세요");
        reviewDto.setTitle(sc.nextLine());
        System.out.println("내용을 입력하세요");
        reviewDto.setContent(sc.nextLine());
        // 회원이 봤던 영화 메소드를 호출한다.

    }

}
