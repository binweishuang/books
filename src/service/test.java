package service;

import bean.BookType;
import bean.ConfBookType;

public class test {

	public static void main(String[] args) {
		test10();

	}
	public static void test1(){
		ConfBookTypeService confdao=ServiceFactory.getConfBookTypeServiceDao();
		confdao.selectConfBookTypes();	
	}
	
	public static void test5(){
		ConfBookTypeService confdao=ServiceFactory.getConfBookTypeServiceDao();
		confdao.selectConfBookType(5);	
	}
	public static void test2(){
		ConfBookTypeService confdao=ServiceFactory.getConfBookTypeServiceDao();
		ConfBookType confBookType=new ConfBookType("≤‚ ‘1","≤‚ ‘1¿‡");
		confdao.inserConfBookType(confBookType);
	}
	
	public static void test3(){
		ConfBookTypeService confdao=ServiceFactory.getConfBookTypeServiceDao();
		confdao.deleteConfBookType(9);
	}
	
	public static void test4(){
		ConfBookTypeService confdao=ServiceFactory.getConfBookTypeServiceDao();
		ConfBookType confBookType=new ConfBookType(8,"≤‚ ‘1","≤‚ ‘1¿‡");
		confdao.updateConfBookType(confBookType);
	}
	public static void test6(){
		BookTypeService bookt=ServiceFactory.getBookTypeService();
		bookt.selectBookTypes();	
	}
	public static void test7(){
		BookTypeService bookt=ServiceFactory.getBookTypeService();
		bookt.selectBookType(5);	
	}
	public static void test8(){
		BookTypeService bookt=ServiceFactory.getBookTypeService();
		BookType bookType=new BookType(6,"≤‚ ‘11","≤‚ ‘11",88.22,"≤‚ ‘11","≤‚ ‘11");
		bookt.inserBookType(bookType);	
	}
	public static void test9(){
		BookTypeService bookt=ServiceFactory.getBookTypeService();
		bookt.deleteBookType(6);
	}
	public static void test10(){
		BookTypeService bookt=ServiceFactory.getBookTypeService();
		BookType bookType=new BookType(5,"≤‚ ‘11","≤‚ ‘11",88.22,"≤‚ ‘11","≤‚ ‘11");
		bookt.updateBookType(bookType);
	}
}
