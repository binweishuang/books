package dao;

import bean.BookType;
import bean.ConfBookType;

public class test {

	public static void main(String[] args) {
		test10();

	}
	
	static void test1(){
		ConfBookTypeDao conf=DaoFactory.getConfBookTypeDao();
		conf.selectConfBookTypes();	
	}
	
	static void test5(){
		ConfBookTypeDao conf=DaoFactory.getConfBookTypeDao();
		conf.selectConfBookType(5);	
		
	}
	static void test2(){
		ConfBookTypeDao conf=DaoFactory.getConfBookTypeDao();
		ConfBookType confBookType=new ConfBookType(6,"”ÔŒƒ","Œƒ—ß¿‡");
		conf.inserConfBookType(confBookType);
	}
	
	static void test3(){
		ConfBookTypeDao conf=DaoFactory.getConfBookTypeDao();
		conf.deleteConfBookType(7);
	}
	static void test4(){
		ConfBookTypeDao conf=DaoFactory.getConfBookTypeDao();
		ConfBookType confBookType=new ConfBookType(6," ˝—ß"," π—ß¿‡");
		conf.updateConfBookType(confBookType);
	}
	static void test6(){
		BookTypeDao bookt=DaoFactory.getBookTypeDao();
		bookt.selectBookTypes();
	}
	static void test7(){
		BookTypeDao bookt=DaoFactory.getBookTypeDao();
		bookt.selectBookType(1);
	}
	static void test8(){
		BookTypeDao bookt=DaoFactory.getBookTypeDao();
		BookType bookType=new BookType(5,"≤‚ ‘1","≤‚ ‘1",88.22,"≤‚ ‘1","≤‚ ‘1");
		bookt.inserBookType(bookType);
	}
	static void test9(){
		BookTypeDao bookt=DaoFactory.getBookTypeDao();
		bookt.deleteBookType(6);
	}
	static void test10(){
		BookTypeDao bookt=DaoFactory.getBookTypeDao();
		BookType bookType=new BookType(5,"≤‚ ‘2","≤‚ ‘2",88.22,"≤‚ ‘2","≤‚ ‘2");
		bookt.updateBookType(bookType);
	}
}
