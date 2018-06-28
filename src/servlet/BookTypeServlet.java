package servlet;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.BookType;
import bean.ConfBookType;
import service.BookTypeService;
import service.ConfBookTypeService;
import service.ServiceFactory;

public class BookTypeServlet extends HttpServlet{	
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
		String booktype_n= req.getParameter("booktype_n");
		String booktype_w=req.getParameter("booktype_w");
		Double booktype_p=Double.valueOf(req.getParameter("booktype_p"));
		String booktype_d=req.getParameter("booktype_d");		
		String booktype_c=req.getParameter("booktype_c");
		Integer id=Integer.valueOf(req.getParameter("booktypeup_i"));

		BookType bookType=new BookType();
		bookType.setName(booktype_n);
		bookType.setWriter(booktype_w);
		bookType.setPrice(booktype_p);
		bookType.setDescroption(booktype_d);
		bookType.setClassification(booktype_c);
		bookType.setId(id);
		
		BookTypeService bookTypeService=ServiceFactory.getBookTypeService();
		bookTypeService.updateBookType(bookType);
		resp.sendRedirect("books.jsp");//最后再返回跳转主页
	}
	
	//根据返回的id值查找一个记录
	private void find(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id=Integer.valueOf(req.getParameter("id")) ;
		BookTypeService bookTypeService=ServiceFactory.getBookTypeService();
		BookType bookType= bookTypeService.selectBookType(id);
		req.setAttribute("hh", bookType);
		req.getRequestDispatcher("book_up.jsp").forward(req, resp);
	}
	//根据返回的id删除一条记录
	private void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id=Integer.valueOf(req.getParameter("id")) ;

		BookTypeService bookTypeService=ServiceFactory.getBookTypeService();
		bookTypeService.deleteBookType(id);
		resp.sendRedirect("books.jsp");
	}
	
	//添加图书的方法
	private void add(HttpServletRequest req, HttpServletResponse resp) throws IOException {	
		String booktype_n= req.getParameter("booktype_n");
		String booktype_w=req.getParameter("booktype_w");
		Double booktype_p=Double.valueOf(req.getParameter("booktype_p"));
		String booktype_d=req.getParameter("booktype_d");		
		String booktype_c=req.getParameter("booktype_c");
		String booktype_i=req.getParameter("booktype_i");
	/*	//转换成file格式
		File filename=new File(booktype_i);
		//将文件的长度读出来，并转换成Long型
		Long l1=filename.length();
		int li2=new Long(l1).intValue();
		//以流的格式赋值
		FileInputStream fis=new FileInputStream(filename);
		PreparedStatment p=new PreparedStatment();
		*/
		
		BookType bookType=new BookType();
		bookType.setName(booktype_n);
		bookType.setWriter(booktype_w);
		bookType.setPrice(booktype_p);
		bookType.setDescroption(booktype_d);
		bookType.setClassification(booktype_c);
		BookTypeService bookTypeService=ServiceFactory.getBookTypeService();
		bookTypeService.inserBookType(bookType);	
		
		System.out.println(booktype_c);
		resp.sendRedirect("books.jsp");
	}
	
	//查看所有图书的方法
	private void listAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BookTypeService bookTypeService=ServiceFactory.getBookTypeService();
		List<BookType> BookTypeList =bookTypeService.selectBookTypes();
		req.setAttribute("bookType", BookTypeList);
		req.getRequestDispatcher("book.jsp").forward(req,resp);
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
}
