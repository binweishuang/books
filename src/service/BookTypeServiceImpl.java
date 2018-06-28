package service;

import java.util.List;

import bean.BookType;
import dao.BookTypeDao;
import dao.DaoFactory;

public class BookTypeServiceImpl implements BookTypeService{
	BookTypeDao bookTypedao=DaoFactory.getBookTypeDao();
	@Override
	public BookType selectBookType(Integer id) {
		
		return bookTypedao.selectBookType(id);
	}

	@Override
	public List<BookType> selectBookTypes() {
		List<BookType> bookTypedaos=bookTypedao.selectBookTypes();
		return bookTypedaos;
	}

	@Override
	public void inserBookType(BookType bookType) {
		bookTypedao.inserBookType(bookType);
		
	}

	@Override
	public void deleteBookType(Integer id) {
		bookTypedao.deleteBookType(id);
		
	}

	@Override
	public void updateBookType(BookType bookType) {
		bookTypedao.updateBookType(bookType);
		
	}

	
}
