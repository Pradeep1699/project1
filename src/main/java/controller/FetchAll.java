package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentDao.StudentDao;
import studentDto.StudentDto;

@WebServlet("/fetch")
public class FetchAll extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentDao dao=new StudentDao();
	List<StudentDto> l=dao.fetchAll();
		
		req.setAttribute("fetchAll", l);
		
		RequestDispatcher r=req.getRequestDispatcher("print.jsp");
		r.forward(req, resp);
				
//	resp.getWriter().print(l);
	
//		super.doGet(req, resp);
		
	}

}
