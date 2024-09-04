package ycraah.web.servletproject240902.member;

import ycraah.web.servletproject240902.Rq;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class MemberController {

  public void showLoginForm(Rq rq) throws ServletException, IOException {
    rq.view("loginPage", rq);
  }

  public void showTryLogin(Rq rq) throws ServletException, IOException {
    rq.view("tryLogin", rq);
  }

  public void userConfirm(Rq rq) throws IOException, ServletException {
    HttpServletRequest req = rq.getReq();
    HttpServletResponse resp = rq.getResp();
    String id = req.getParameter("user_id");
    String pw = req.getParameter("user_pw");
    System.out.println("아이디: " + id + " 비밀번호 : " + pw);

    //DB에서 정보 얻어오기
    MemberDAO dao = new MemberDAO();
    MemberVO confirmedMember = null;
    List<MemberVO> members = dao.showMembers();
    for (MemberVO member : members) {
      if (id.equals(member.getId())) {
        if(pw.equals(member.getPw())) {
          confirmedMember = member;
        }
      }
    }

    //회원 확인
    if(confirmedMember != null) {
      req.setAttribute("user_id", confirmedMember.getId());
      req.setAttribute("user_pw", confirmedMember.getPw());
      req.setAttribute("name", confirmedMember.getName());
      req.setAttribute("email", confirmedMember.getEmail());
      req.setAttribute("joinDate", confirmedMember.getJoinDate());
      RequestDispatcher dispatch = req.getRequestDispatcher("/jsp/logined.jsp");
      dispatch.forward(req,resp);
    } else {
      RequestDispatcher dispatch = req.getRequestDispatcher("/jsp/loginPage.jsp?cmd=notConfirmed");
      dispatch.forward(req,resp);
    }

  }

  public void showAllMemberDB() {
    MemberDAO dao = new MemberDAO();
    List<MemberVO> members = dao.showMembers();
    for(MemberVO member : members){
      System.out.println(member);
    }
  }
}
