package ycraah.web.servletproject240902.servlet;

import ycraah.web.servletproject240902.Rq;
import ycraah.web.servletproject240902.container.Container;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static ycraah.web.servletproject240902.container.Container.memberController;

@WebServlet("/login/*")
public class DispatcherServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Rq rq = new Rq(req,resp);
    String url = req.getRequestURI();
    System.out.println(url);



    switch (url) {
      case "/login" :
        Container.memberController.showTryLogin(rq);
        break; //14버전부터 '->' 가능
      case "/login/loginForm" :
        Container.memberController.showLoginForm(rq);
        break;
      default:
        Container.memberController.showTryLogin(rq);
    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Rq rq = new Rq(req,resp);
    String url = req.getRequestURI();
    System.out.println(url);

    switch (url) {
      case "login/confirm" :
        Container.memberController.userConfirm(rq);
    }
  }
}
