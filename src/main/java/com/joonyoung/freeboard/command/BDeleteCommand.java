package com.joonyoung.freeboard.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.joonyoung.freeboard.dao.BoardDao;
import com.joonyoung.freeboard.dao.BoardDao;

public class BDeleteCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		BoardDao dao = new BoardDao();
		String id = request.getParameter("bid");
		
		dao.delete(id);

	}

}
