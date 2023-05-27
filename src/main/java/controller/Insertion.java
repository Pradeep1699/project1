package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentDao.StudentDao;
import studentDto.StudentDto;

@WebServlet("/insert")
public class Insertion extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		String sid=	req.getParameter("sid");
		int id=Integer.parseInt(sid);
		
		String Name=req.getParameter("name");
		String Gender=req.getParameter("gender");
		
		String phno=req.getParameter("phno");
		long phno1=Long.parseLong(phno);
		
		StudentDto dto=new StudentDto();
		dto.setID(id);
		dto.setName(Name);
		dto.setGender(Gender);
		dto.setPh_no(phno1);
		
		StudentDao dao=new StudentDao();
		String str=dao.insert(dto);
		
		resp.getWriter().print(str);

	}

}
