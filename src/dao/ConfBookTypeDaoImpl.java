package dao;

import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import bean.ConfBookType;
import util.JdbcUtils;

public class ConfBookTypeDaoImpl implements ConfBookTypeDao {

	@Override
	public List<ConfBookType> selectConfBookTypes() {
		String sql="select *from book.conf_book_type";
		//当创建QueryRunner对象时，构造器的参数指定为javax.sql.DataSource的接口对象。
		//在QueryRunner对象在CRUD时会自动从连接池获取连接，用完自动释放到连接池
		QueryRunner qr=new QueryRunner(JdbcUtils.pool);
		
		
		List<ConfBookType> confBookTypes=null;
		try {
			confBookTypes = qr.query(sql, new BeanListHandler<ConfBookType>(ConfBookType.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		for (ConfBookType confBookType2 : confBookTypes) {
			System.out.println(confBookType2.getName());
			System.out.println(confBookType2.getDescroption());
		}
		
		
		return confBookTypes;
	}

	@Override
	public ConfBookType selectConfBookType(Integer id) {
		String sql="select *from book.conf_book_type where id=?";
		QueryRunner qr=new QueryRunner(JdbcUtils.pool);	
		ConfBookType confBookType=null;
		try {
			confBookType = qr.query(sql, new BeanHandler<>(ConfBookType.class),id);
			System.out.println(confBookType.getId());
			System.out.println(confBookType.getName());
			System.out.println(confBookType.getDescroption());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return confBookType;
	}
	
	@Override
	public void inserConfBookType(ConfBookType confBookType) {
		String sql="insert into book.conf_book_type(id,name, descroption)value(?,?,?)";
		QueryRunner qr=new QueryRunner(JdbcUtils.pool);
		try {
			/*Object params[]={confBookType.getId(),confBookType.getName(),confBookType.getDescroption()};*/
			qr.update(sql,confBookType.getId(),confBookType.getName(),confBookType.getDescroption());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public void deleteConfBookType(Integer id) {
		String sql="delete from book.conf_book_type where id=?";
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
	public void updateConfBookType(ConfBookType confBookType) {
		String sql="update book.conf_book_type set name=?,descroption=? where id=?";
		QueryRunner qr=new QueryRunner(JdbcUtils.pool);
		try {
			qr.update(sql,confBookType.getName(),confBookType.getDescroption(),confBookType.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	

}
