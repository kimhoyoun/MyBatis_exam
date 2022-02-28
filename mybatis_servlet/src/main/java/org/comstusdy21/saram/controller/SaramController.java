package org.comstusdy21.saram.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstusdy21.saram.model.SaramDao;
import org.comstusdy21.saram.model.SaramDto;

@WebServlet("/saram/*")
public class SaramController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private SaramDao saramDao = new SaramDao();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		saramDao.insert(new SaramDto(0, "Lee","gildong",40));
		List<SaramDto> saramList = saramDao.selectAll();
		
		// 내장객체에 setAttribute한 것은 jstl에서 바로 가져다 쓸 수 있음.
		request.setAttribute("title", "Saram List");
		request.setAttribute("saramList", saramList);
		
		String viewName = "/WEB-INF/views/saram/list.jsp";
				
		RequestDispatcher view = request.getRequestDispatcher(viewName);
		view.forward(request, response);
	}

}
