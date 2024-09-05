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
    rq.view("loginPage");
  }

  public void showTryLogin(Rq rq) throws ServletException, IOException {
    rq.view("tryLogin");
  }

  public void userConfirm(Rq rq) throws ServletException, IOException {
      MemberService.INSTANCE.doConfirm(rq);
    }
  }

