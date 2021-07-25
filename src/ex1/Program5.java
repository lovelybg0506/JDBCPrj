package ex1;

import com.gyu.app.console.NoticeConsole;

public class Program5 { // 콘솔창으로 만들기

	public static void main(String[] args) {
		NoticeConsole console = new NoticeConsole();
		console.printNoticeList(); // 출력
		console.inputNoticeMenu(); // 입력
		int menu = console.inputNoticeMenu();
		
		switch(menu) {
		case 1: // 상세조회
			break;
		case 2: // 이전
			break;
		case 3: // 다음
			break;
		case 4: // 글쓰기
			break;
		}
		
	}

}
