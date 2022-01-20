package com.stone.springmvc.dataservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.stone.springmvc.common.TodoBoard;

@Repository
public class TodoDAO {
	
	public void insertTodo(TodoBoard newtodo) {
		Connection con = null;		 
	    try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        con=DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/mydb2?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC", // DB URL
	                    "root", "1234");  // USER_NAME과 PASSWORD
	        
	        PreparedStatement pstmt=con.prepareStatement("insert into todoboard(title,memo) values(?,?)"); 
	        pstmt.setString(1, newtodo.getTitle());
	        pstmt.setString(2, newtodo.getMemo());
	      

	        pstmt.executeUpdate();
	        
	            //DB조작
	       con.close();
	   }
	   catch(Exception ex){ ex.printStackTrace(); }		
	}
	public ArrayList<TodoBoard> selectAllTodo(){
		ArrayList<TodoBoard> todos =new ArrayList<TodoBoard>();		
		Connection con = null;		 
	    try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        con=DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/mydb2?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC", // DB URL
	                    "root", "1234");  // USER_NAME과 PASSWORD	        
	        PreparedStatement pstmt=con.prepareStatement("select * from todoboard order by no desc"); 
	        ResultSet rs =pstmt.executeQuery();
	        while(rs.next()) {
	        	int no =rs.getInt("no");        	
	        	String title=rs.getString("title");
	        	String memo=rs.getString("memo");	
	        	String state=rs.getString("state");	        	
	        	String modi=rs.getString("modi");	        	

	        	TodoBoard todo = new TodoBoard();
	        	todo.setNo(no);
	        	todo.setTitle(title);
	        	todo.setMemo(memo);
	        	todo.setState(state);
	        	todo.setModi(modi);
	        	todos.add(todo);
	        } 
	       con.close();
	   }
	   catch(Exception ex){ ex.printStackTrace(); }	
	   return todos;
	}
	
//	------------------------------------------------------------------------
	public int updateTodo(int uno, String state) {		
		int cnt=0;
	Connection con = null;		 
	    try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        con=DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/mydb2?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC", // DB URL
	                    "root", "1234");  // USER_NAME과 PASSWORD	        
	       
	        PreparedStatement pstmt=con.prepareStatement("update todoboard set state=? where no=?"); 
	        pstmt.setString(1, state); //
	        pstmt.setInt(2, uno);
	   

	        pstmt.executeUpdate();
	       con.close();
	   }
	   catch(Exception ex){ ex.printStackTrace(); }
	   return cnt;
	   }
	
	   
	   public int deleteTodo(int dno) {
		   int pea=0;
		   Connection con = null;		 
		    try{
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        con=DriverManager.getConnection(
		                    "jdbc:mysql://localhost:3306/mydb2?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC", // DB URL
		                    "root", "1234");  // USER_NAME과 PASSWORD	        
		        PreparedStatement pstmt=con.prepareStatement("delete from todoboard where no=?");
		        pstmt.setInt(1, dno);
		        
		        pea = pstmt.executeUpdate();
		       con.close();
		   }
		   catch(Exception ex){ ex.printStackTrace(); }
		   return pea;
	   }
	
}

