package com.gyu.app.console;

import java.sql.SQLException;
import java.util.List;

import com.gyu.app.entity.Notice;
import com.gyu.app.service.NoticeService;

public class NoticeConsole {

	private NoticeService service;
	
	public NoticeConsole() {
		service = new NoticeService();
	}
	
	public void printNoticeList() throws ClassNotFoundException, SQLException{
		List<Notice> list = service.getList();
		
		System.out.println("───────────────────────────────");
		System.out.printf("<공지사항> 총 %d 게시글\n",12);
		System.out.println("───────────────────────────────");
		System.out.printf("%d. %s / %s / %s\n",
							12,"안녕하세요","gyu","2021-06-29");
		System.out.println("───────────────────────────────");
		System.out.printf("            %d/%d pages\n",1,2);
	}

	public int inputNoticeMenu() {

		return 0;
	}
	
	
}
