package com.javaex.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthorDaoImpl implements AuthorDao {
	static final String dburl = "jdbc:mysql://localhost:3306/test_db";
	static final String dbuser = "test_user";
	static final String dbpass = "test";
	
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl,
												dbuser, 
												dbpass);
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		}
		return conn;
	}
	
	@Override
	public List<AuthorVo> getList() {
		List<AuthorVo> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			
			String sql = "SELECT author_id, author_name, author_desc, regdate " +
					" FROM author";
			rs = stmt.executeQuery(sql);
			
			//	각 레코드를 List<AuthorVo>로 변환
			while (rs.next()) {
				Long authorId = rs.getLong(1);
				String authorName = rs.getString(2);
				String authorDesc = rs.getString(3);
				Date regdate = rs.getDate(4);
				
				AuthorVo vo = new AuthorVo(authorId, authorName, authorDesc, regdate);
				
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AuthorVo> search(String keyword) {
		// TODO 검색어를 입력받아 author_name 필드를 LIKE 검색하여 목록을 돌려주는 메서드 구현
		return null;
	}

	@Override
	public AuthorVo get(Long id) {
		// TODO PK 정보를 입력받아 해당 PK를 가진 레코드를 반환하는 메서드
		return null;
	}

	@Override
	public boolean insert(AuthorVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;
		
		try {
			conn = getConnection();
			
			String sql = "INSERT INTO author (author_name, author_desc) " +
					" VALUES(?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getAuthorName());
			pstmt.setString(2, vo.getAuthorDesc());
			
			insertedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {}
		}
		
		return 1 == insertedCount;
	}

	@Override
	public boolean update(AuthorVo vo) {
		// TODO AuthorVO를 매개변수로 입력받아 업데이트 하는 메서드
		return false;
	}

	@Override
	public boolean delete(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "DELETE FROM author " +
					" WHERE author_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			
			deletedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {}
		}
		return 1 == deletedCount;
	}

}
