package service;

import java.util.List;

import bean.ConfBookType;

public interface ConfBookTypeService {
		//获取一个列表
		public List<ConfBookType> selectConfBookTypes();
		
		//获取一个记录，用于修改
		public ConfBookType selectConfBookType(Integer id);
		
		//新增一条记录
		public void inserConfBookType(ConfBookType confBookType);
		
		//删除一个记录
		public void deleteConfBookType(Integer id);
		
		//修改一个记录
		public void updateConfBookType(ConfBookType confBookType);
}
