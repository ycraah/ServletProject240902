package ycraah.web.servletproject240902.container;

import ycraah.web.servletproject240902.member.MemberController;
import ycraah.web.servletproject240902.member.MemberRepository;
import ycraah.web.servletproject240902.member.MemberService;

public class Container {
 public static MemberController memberController;
 public static MemberService memberService;
 public static MemberRepository memberRepository;

  static {
    memberController = new MemberController();
    memberService = new MemberService();
    memberRepository = new MemberRepository();
  }
}
