package dao.register;

import dao.member.idCheck;
import dto.User;

import java.util.Scanner;

import static dto.User.id;

public class memberInput {
    memberInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("회원가입");
        System.out.println("아이디 입력");
        User.setId(sc.nextLine()) ;
        idCheck.action(id);
        System.out.println("비밀번호 입력");
        User.setPwd(sc.nextLine());
    }
}
