package service;

import java.util.List;

import bean.BookType;

public interface BookTypeService {
public BookType selectBookType(Integer id);
	
	public List<BookType> selectBookTypes();
	
	public void inserBookType(BookType bookType);
	
	public void deleteBookType(Integer id);
	
	public void updateBookType(BookType bookType);
}
