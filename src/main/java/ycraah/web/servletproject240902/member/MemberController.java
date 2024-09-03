package ycraah.web.servletproject240902.member;

import ycraah.web.servletproject240902.Rq;

import javax.servlet.ServletException;
import java.io.IOException;

public class MemberController {

  public void showLoginForm(Rq rq) throws ServletException, IOException {
    rq.view("loginPage", rq);
  }

  public void showTryLogin(Rq rq) throws ServletException, IOException {
    rq.view("tryLogin", rq);
  }

  public void userConfirm(Rq rq) {

  }
}
