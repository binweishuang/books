package service;

public class ServiceFactory {
	static ConfBookTypeService confBookTypeServiceDao=new ConfBookTypeServiceImpl();
	public static ConfBookTypeService getConfBookTypeServiceDao(){
		return confBookTypeServiceDao;
	}
	
	static BookTypeService bookTypeService =new BookTypeServiceImpl();
	public static BookTypeService getBookTypeService(){
		return bookTypeService;
	}
}
