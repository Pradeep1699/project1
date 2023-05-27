package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentDao.StudentDao;
import studentDto.StudentDto;
@WebServlet("/update")
public class Update extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
	String sid=	req.getParameter("sid");
	int Id=Integer.parseInt(sid);
	
	String name=req.getParameter("name");
	
	String Gender=req.getParameter("gender");
	
	String phno=req.getParameter("phno");
	long phno1=	Long.parseLong(phno);

	StudentDto dto=new StudentDto();
	dto.setID(Id);
	dto.setName(name);
	dto.setGender(Gender);
	dto.setPh_no(phno1);
	
	StudentDao dao=new StudentDao();
	String str=dao.Update(Id,dto);
	
	resp.getWriter().print(str);
	}

}
