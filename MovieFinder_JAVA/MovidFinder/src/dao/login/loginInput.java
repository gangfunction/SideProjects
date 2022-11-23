package dao.login;

import dto.User;

import java.util.Scanner;

public class loginInput {
    protected loginInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("로그인 정보를 입력하세요");
        System.out.println("아이디 : ");
        User.setId(sc.next());
        System.out.println("비밀번호 : ");
        User.setPwd(sc.next());
    }
}
