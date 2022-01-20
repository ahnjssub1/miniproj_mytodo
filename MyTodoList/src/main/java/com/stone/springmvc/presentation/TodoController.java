package com.stone.springmvc.presentation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.stone.springmvc.common.TodoBoard;
import com.stone.springmvc.dataservice.*;
import com.stone.springmvc.service.TodoService;

@Controller
public class TodoController {
	@Autowired
	TodoService TodoService;
	
	@RequestMapping("todo")
	ModelAndView 할일목록을출력하다(    ) {
		
		ArrayList<TodoBoard> todos=TodoService.readTodo();
		
		ModelAndView  mv =new ModelAndView();
		mv.setViewName("main");
		mv.addObject("todos", todos);
		return mv;
	}
	
	
	@RequestMapping("insert")
	ModelAndView 게시물을등록하다(TodoBoard board) {
	
		TodoService.saveTodo(board);
		
		ModelAndView  mv =new ModelAndView();
		mv.setViewName("forward:/todo");
		return mv;
	}
	
	@RequestMapping("addlist")
	ModelAndView 할일등록을준비하다( ) {
		TodoService.readyTodo(); //혹시 모를 등록준비, 가능 여부 확인
		ModelAndView  mv =new ModelAndView();
		mv.setViewName("addlist");
		return mv;
	}
	
	
	
	@RequestMapping("mod")
	ModelAndView 할일상태를수정하다(TodoBoard board){
		ModelAndView  mv =new ModelAndView();
		if(board.getModi().equals("del"))
			TodoService.removeTodo(board.getNo());
		else
			TodoService.modifyTodo(board.getNo(), board.getState());
		mv.setViewName("forward:/todo");
		return mv;	
	}
	
}
	