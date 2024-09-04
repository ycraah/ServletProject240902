package ycraah.web.servletproject240902.member;

import lombok.NoArgsConstructor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class MemberDAO {
  // JDBC 연결 객체
  private Connection connection = null;
  private PreparedStatement pstmt = null;
  private ResultSet rs = null;

  // MySQL 연결 정보
  private String url = "jdbc:mysql://localhost:3306/javaweb";
  private String username = "root";
  private String password = "root";

  public List<MemberVO> showMembers(){
    List<MemberVO> members = new ArrayList<MemberVO>();
    try{
      connDB();
      String query = "select * from t_member";
      System.out.println(query);
      pstmt = connection.prepareStatement(query);
      rs = pstmt.executeQuery();

      while (rs.next()) {
        String id = rs.getString("id");
        String pwd = rs.getString("pwd");
        String name = rs.getString("name");
        String email = rs.getString("email");
        Date joinDate = rs.getDate("joinDate");
        members.add(new MemberVO(id, pwd, name, email, joinDate));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return members;
  }

  private void connDB() {
    try {
      // 1. JDBC 드라이버 로드 (필수는 아님, 최신 JDBC 드라이버에서는 자동으로 로드됨)
      Class.forName("com.mysql.cj.jdbc.Driver");
      // 2. 데이터베이스 연결
      connection = DriverManager.getConnection(url, username, password);
      System.out.println("연결 성공");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}