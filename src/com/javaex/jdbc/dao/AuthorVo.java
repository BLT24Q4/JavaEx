package com.javaex.jdbc.dao;

import java.util.Date;

//	DTO(VO)
//	: 자바 계층간 데이터를 주고 받기 위한 데이터 객체
//		- 로직이 없는 순수 데이터 객체
//		- 기본 생성자가 반드시 있어야 한다
//		- toString(), equals() 메서드는 만들기도 한다
public class AuthorVo {
	private Long authorId;
	private String authorName;
	private String authorDesc;
	private Date regdate;
	
	public AuthorVo() {
		
	}

	public AuthorVo(String authorName, String authorDesc) {
		super();
		this.authorName = authorName;
		this.authorDesc = authorDesc;
	}

	public AuthorVo(Long authorId, String authorName, String authorDesc, Date regdate) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorDesc = authorDesc;
		this.regdate = regdate;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorDesc() {
		return authorDesc;
	}

	public void setAuthorDesc(String authorDesc) {
		this.authorDesc = authorDesc;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "AuthorVo [authorId=" + authorId + ", authorName=" + authorName + ", authorDesc=" + authorDesc
				+ ", regdate=" + regdate + "]";
	}
	
	
}
