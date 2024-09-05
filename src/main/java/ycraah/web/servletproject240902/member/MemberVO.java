package ycraah.web.servletproject240902.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.sql.Date;

@AllArgsConstructor
@Getter
@ToString
public class MemberVO {
  private String id;
  private String pw;
  private String name;
  private String email;
  private Date joinDate;
}
