package com.stone.springmvc.common;

//BoardVO
public class TodoBoard {
	int no;
	String title; //할일
	String memo; //참고내용
	String state; //상태(todo or done)
	String modi; 
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getModi() {
		return modi;
	}
	public void setModi(String modi) {
		this.modi = modi;
	}
	
	
}
