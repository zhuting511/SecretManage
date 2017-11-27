package com.secret.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * 访问数据库的工具类
 * @author 朱婷
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
	 * 连接数据库
	 * @return 返回数据库连接对象
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
	 * 关闭数据库连接
	 * @param conn 连接对象
	 * @param stmt statement对象
	 * @param rs  结果集对象
	 */
	public void closeAll(Connection conn,PreparedStatement pstmt,ResultSet rs){
		try{//结果集
			if(rs!=null){ 
				rs.close();
			}//statement对象
			if(pstmt!=null){ 
				pstmt.close();
			}//连接数据库对象
			if(conn!=null){  
				conn.close();
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	/**
	 * 添加、修改、删除方法
	 * @param sql sql语句
	 * @param objParams 参数
	 * @return 1成功 0失败 
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
