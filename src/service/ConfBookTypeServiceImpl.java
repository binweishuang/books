package service;

import java.util.List;

import bean.ConfBookType;
import dao.ConfBookTypeDao;
import dao.DaoFactory;

public class ConfBookTypeServiceImpl implements ConfBookTypeService{
	ConfBookTypeDao confBookTypeDao=DaoFactory.getConfBookTypeDao();
	
	@Override
	public ConfBookType selectConfBookType(Integer id) {

		return confBookTypeDao.selectConfBookType(id);
	}
	
	@Override
	public List<ConfBookType> selectConfBookTypes() {
		List<ConfBookType> list=confBookTypeDao.selectConfBookTypes();
		return list;
	}

	@Override
	public void inserConfBookType(ConfBookType confBookType) {
		confBookTypeDao.inserConfBookType(confBookType);
		
	}

	@Override
	public void deleteConfBookType(Integer id) {
		confBookTypeDao.deleteConfBookType(id);
		
	}

	@Override
	public void updateConfBookType(ConfBookType confBookType) {
		confBookTypeDao.updateConfBookType(confBookType);
		
	}

	
	
}
