package ycraah.web.servletproject240902;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class ServletFilter implements Filter {
  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
    request.setCharacterEncoding("utf-8");
    filterChain.doFilter(request, response);
  }
}
