package ycraah.web.servletproject240902;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

@Getter
@Setter
public class Rq {
  public HttpServletRequest req;
  public HttpServletResponse resp;

  public Rq(HttpServletRequest req, HttpServletResponse resp) {
    this.req = req;
    this.resp = resp;
  }

  public void view(String urlPath) throws ServletException, IOException {
    RequestDispatcher dispatch = req.getRequestDispatcher("/jsp/" + urlPath + ".jsp");
    dispatch.forward(req, resp);
  }

  public void dispatch(String path) throws ServletException, IOException {
    RequestDispatcher dispatch = req.getRequestDispatcher(path);
    dispatch.forward(req, resp);
  }
}
