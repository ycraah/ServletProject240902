package ycraah.web.servletproject240902.container;

import ycraah.web.servletproject240902.member.MemberController;

public class Container {
 public static MemberController memberController;

  static {
    memberController = new MemberController();
  }
}
