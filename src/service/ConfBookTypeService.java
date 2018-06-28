package service;

import java.util.List;

import bean.ConfBookType;

public interface ConfBookTypeService {
		//��ȡһ���б�
		public List<ConfBookType> selectConfBookTypes();
		
		//��ȡһ����¼�������޸�
		public ConfBookType selectConfBookType(Integer id);
		
		//����һ����¼
		public void inserConfBookType(ConfBookType confBookType);
		
		//ɾ��һ����¼
		public void deleteConfBookType(Integer id);
		
		//�޸�һ����¼
		public void updateConfBookType(ConfBookType confBookType);
}
