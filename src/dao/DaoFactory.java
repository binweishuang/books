package dao;

public class DaoFactory {
	static ConfBookTypeDao confBookTypeDao =new ConfBookTypeDaoImpl();
	public static ConfBookTypeDao getConfBookTypeDao(){		
		return confBookTypeDao;	
	}
	
	static BookTypeDao bookTypeDao=new BookTypeDaoImpl();
	public static BookTypeDao getBookTypeDao(){
		return bookTypeDao;
	}
}
