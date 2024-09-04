package ycraah.web.servletproject240902.member;

import ycraah.web.servletproject240902.Rq;

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

  public void userConfirm(Rq rq) throws IOException {
    HttpServletRequest req = rq.getReq();
    HttpServletResponse resp = rq.getResp();
    String user_id = req.getParameter("user_id");
    String user_pw = req.getParameter("user_pw");
//    req.setCharacterEncoding("UTF-8"); 필터로 처리
    resp.setContentType("text/html;charset=UTF-8");

    PrintWriter out = resp.getWriter();
    out.println("<html><body>");
    out.printf("<p>입력된 아이디 : %s</p>", user_id);
    out.printf("<p>입력된 비밀번호 : %s</p>", user_pw);
    out.println("</body></html>");


  }

  public void showAllMemberDB() {
    MemberDAO dao = new MemberDAO();
    List<MemberVO> members = dao.showMembers();
    for(MemberVO member : members){
      System.out.println(member);
    }
  }
}
