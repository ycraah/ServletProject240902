package ycraah.web.servletproject240902.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login/*")
public class DispatcherServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String url = req.getRequestURI();
    System.out.println(url);

    switch (url) {
      case "/login" :
        resp.sendRedirect("/jsp/index.jsp");
        break; //14버전부터 -> 가능
      case "/login/loginForm" :
        resp.sendRedirect("/jsp/loginPage.jsp");
        break;
    }
  }
}
