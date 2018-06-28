package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.beans.decoder.ValueObject;

import bean.ConfBookType;
import service.ConfBookTypeService;
import service.ServiceFactory;

public class ConfBookTypeServlet extends HttpServlet{	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置请求和响应时有编码方式
		req.setCharacterEncoding("UTF8");
		resp.setCharacterEncoding("UTF8");
		resp.setContentType("text/html;charset=utf8");
		//先获取页面返回的参数，根据参数判断调用具体方法
		String method=req.getParameter("method");
		if(method.equals("listAll")){
			listAll(req,resp);
		}else if(method.equals("add")){
			add(req,resp);
		}else if(method.equals("delete")){
			delete(req,resp);
		}else if(method.equals("find")){
			find(req,resp);
		}else if(method.equals("update")){
			update(req,resp);
		}else{
			req.setAttribute("message", "不支持此类操作");
			req.getRequestDispatcher("/message.jsp").forward(req, resp);
		}
	}
	//修改一条记录的信息
	private void update(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String confbooktypeup_n= req.getParameter("confbooktypeup_n");
		String confbooktypeup_d=req.getParameter("confbooktypeup_d");
		Integer id=Integer.valueOf(req.getParameter("confbooktypeup_i"));

		ConfBookType confBookType_up=new ConfBookType();
		confBookType_up.setName(confbooktypeup_n);
		confBookType_up.setDescroption(confbooktypeup_d);
		confBookType_up.setId(id);
		
		ConfBookTypeService confBookTypeService=ServiceFactory.getConfBookTypeServiceDao();
		confBookTypeService.updateConfBookType(confBookType_up);
		resp.sendRedirect("books.jsp");//最后再返回跳转主页
	}
	
	//根据返回的id值查找一个记录
	private void find(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id=Integer.valueOf(req.getParameter("id")) ;
		ConfBookTypeService confBookTypeService=ServiceFactory.getConfBookTypeServiceDao();
		ConfBookType confBookType= confBookTypeService.selectConfBookType(id);
		req.setAttribute("hh", confBookType);
		req.getRequestDispatcher("book_type_up.jsp").forward(req, resp);;
	}
	//根据返回的id删除一条记录
	private void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id=Integer.valueOf(req.getParameter("id")) ;

		ConfBookTypeService confBookTypeService=ServiceFactory.getConfBookTypeServiceDao();
		confBookTypeService.deleteConfBookType(id);
		resp.sendRedirect("books.jsp");
	}
	
	//添加图书分类的方法
	private void add(HttpServletRequest req, HttpServletResponse resp) throws IOException {	
		String confbooktype_n= req.getParameter("confbooktype_n");
		String confbooktype_d=req.getParameter("confbooktype_d");
		
		ConfBookType confBookType=new ConfBookType();
		confBookType.setName(confbooktype_n);
		confBookType.setDescroption(confbooktype_d);
		
		ConfBookTypeService confBookTypeService=ServiceFactory.getConfBookTypeServiceDao();
		confBookTypeService.inserConfBookType(confBookType);	
		resp.sendRedirect("books.jsp");
	}
	
	//查看图书分类的方法
	private void listAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ConfBookTypeService confdao=ServiceFactory.getConfBookTypeServiceDao();
		List<ConfBookType> ConfBookTypeList =confdao.selectConfBookTypes();
		req.setAttribute("confBookType", ConfBookTypeList);
		req.getRequestDispatcher("book_type.jsp").forward(req,resp);
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
}
