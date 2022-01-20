package com.stone.springmvc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stone.springmvc.common.TodoBoard;
import com.stone.springmvc.dataservice.TodoDAO;

@Service
public class TodoService {
	@Autowired
	TodoDAO TodoDAO;
	public void readyTodo() {
		//(업무)
		//현재 업무 규칙 없음
		//(DB)
	}
	
	public void saveTodo(TodoBoard newtodo) {
		//(업무)
		//현재 업무 규칙 없음
		//(DB)
		TodoDAO.insertTodo(newtodo);
	}
	public ArrayList<TodoBoard> readTodo(){
		//(업무)
		//현재 업무 규칙 없음
		//(DB)
		return TodoDAO.selectAllTodo();
	}
	public void modifyTodo(int no, String state) {
		//(업무)
		//현재 업무 규칙 없음
		//(DB)
		TodoDAO.updateTodo(no, state);
	}
	public int removeTodo(int no) {
		//(업무)
		//현재 업무 규칙 없음
		//(DB)
		return TodoDAO.deleteTodo(no);
	}
}
