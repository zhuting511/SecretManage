package com.secret.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * �������ݿ�Ĺ�����
 * @author ����
 * 2017-11-27
 */
public class BaseDao {

	private static String driver;
	private static String url;
	private static String user;
	private static String pwd;
	
	Connection conn=null;
	ResultSet rs=null;
	
	static{
		init();
	}
	public static void init(){
		Properties params=new Properties();
		String confiles="database.properties";
		InputStream input=BaseDao.class.getClassLoader().getResourceAsStream(confiles);
		try{
			params.load(input);
			driver=params.getProperty("driver");
			url=params.getProperty("url");
			user=params.getProperty("user");
			pwd=params.getProperty("password");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	/**
	 * �������ݿ�
	 * @return �������ݿ����Ӷ���
	 */
	public Connection getConnection(){
		try{
			if(conn==null){
				Class.forName(driver);
				conn=DriverManager.getConnection(url,user,pwd);
			}else if(conn.isClosed()==true){
				Class.forName(driver);
				conn=DriverManager.getConnection(url,user,pwd);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * �ر����ݿ�����
	 * @param conn ���Ӷ���
	 * @param stmt statement����
	 * @param rs  ���������
	 */
	public void closeAll(Connection conn,PreparedStatement pstmt,ResultSet rs){
		try{//�����
			if(rs!=null){ 
				rs.close();
			}//statement����
			if(pstmt!=null){ 
				pstmt.close();
			}//�������ݿ����
			if(conn!=null){  
				conn.close();
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	/**
	 * ��ӡ��޸ġ�ɾ������
	 * @param sql sql���
	 * @param objParams ����
	 * @return 1�ɹ� 0ʧ�� 
	 */
	public int exceuteUpdate (String sql,Object[] objParams){
		int count=0;
		PreparedStatement pstmt=null;
		try{
			conn=this.getConnection();
			pstmt=conn.prepareStatement(sql);
			if(objParams!=null){
				for(int i=0;i<objParams.length;i++){
					pstmt.setObject(i+1, objParams[i]);
				}
			}
			count=pstmt.executeUpdate();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			this.closeAll(conn, pstmt, null);
		}
		return count;
	}
}
