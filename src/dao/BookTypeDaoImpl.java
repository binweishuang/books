package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import bean.BookType;
import bean.ConfBookType;
import util.JdbcUtils;

public class BookTypeDaoImpl implements BookTypeDao {

	@Override
	public BookType selectBookType(Integer id) {
		String sql="select *from book.book_type where id=?";
		QueryRunner qr=new QueryRunner(JdbcUtils.pool);
		BookType bookType=null;
		try {
			bookType = qr.query(sql,new BeanHandler<>(BookType.class),id);
			System.out.println(bookType.getId());
			System.out.println(bookType.getName());
			System.out.println(bookType.getWriter());
			System.out.println(bookType.getPrice());
			System.out.println(bookType.getImage());
			System.out.println(bookType.getDescroption());
			System.out.println(bookType.getClassification());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		return bookType;
	}

	@Override
	public List<BookType> selectBookTypes() {
		String sql="select *from book.book_type";
		QueryRunner qr=new QueryRunner(JdbcUtils.pool);
		List<BookType> bookTypes=null;
		try {
			bookTypes = qr.query(sql, new BeanListHandler<BookType>(BookType.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		for (BookType bookType2 : bookTypes) {
			System.out.println(bookType2.getId());
			System.out.println(bookType2.getName());
			System.out.println(bookType2.getWriter());
			System.out.println(bookType2.getPrice());
			System.out.println(bookType2.getImage());
			System.out.println(bookType2.getDescroption());
			System.out.println(bookType2.getClassification());
		}
		return bookTypes;
	}

	@Override
	public void inserBookType(BookType bookType) {
		String sql="insert into book.book_type(name, writer, price, descroption,classification)value(?,?,?,?,?)";
		QueryRunner qr=new QueryRunner(JdbcUtils.pool);
		try {
			qr.update(sql,bookType.getName(),bookType.getWriter(),bookType.getPrice(),bookType.getDescroption(),bookType.getClassification());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public void deleteBookType(Integer id) {
		String sql="delete from book.book_type where id=?";
		QueryRunner qr=new QueryRunner(JdbcUtils.pool);
		try {
			qr.update(sql,id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public void updateBookType(BookType bookType) {
		String sql="update book.book_type set name=?, writer=?, price=?, image=?, descroption=?,classification=? where id=?";
		QueryRunner qr=new QueryRunner(JdbcUtils.pool);
		try {
			qr.update(sql,bookType.getName(),bookType.getWriter(),bookType.getPrice(),bookType.getImage(),bookType.getDescroption(),bookType.getClassification(),bookType.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
