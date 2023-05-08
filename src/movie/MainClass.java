package movie;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String id = null, pwd = null;
	int num;
	MemberDTO dto;
	MemberService ms = new MemberService();
	
	while(true) {
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.아이디찾기");
		System.out.println("4.종료");
		System.out.print(">>> ");
		num = input.nextInt();
		
		switch(num) {
		case 1: 
			break;
		case 2: 
			System.out.print("새로운 아이디: ");
			id = input.next();
			if(ms.checkUser(id)) {
				System.out.println("중복된 아이디입니다");
				break;
			}
			System.out.print("새로운 비밀번호: ");
			pwd = input.next();
			
			dto = new MemberDTO();
			dto.setId(id); dto.setPwd(pwd);
			
			ms.save(dto);
			
			break;
		case 3: 
			break;
		case 4:
			System.out.println("프로그램 종료");
			return;
		}
	}
	
	
	
	
	
	
	
}
}
