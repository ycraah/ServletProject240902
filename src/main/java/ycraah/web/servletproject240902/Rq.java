package ycraah.web.servletproject240902;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@AllArgsConstructor
@Getter
public class Rq {
  public HttpServletRequest req;
  public HttpServletResponse resp;

  public void view(String urlPath, Rq rq) throws ServletException, IOException {
    HttpServletRequest req = rq.getReq();
    HttpServletResponse resp = rq.getResp();
    RequestDispatcher dispatch = req.getRequestDispatcher("/jsp/" + urlPath + ".jsp");
    dispatch.forward(req, resp);
  }
}
