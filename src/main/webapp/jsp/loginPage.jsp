<%--
  Created by IntelliJ IDEA.
  User: ktf_y
  Date: 2024-09-02
  Time: 오후 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="commonSetting.jsp" %>
<%
    String cmd = request.getParameter("cmd");
    request.setAttribute("cmd", cmd);
%>
<html>
<head>
    <title>로그인 페이지</title>


    <!--외부 css-->
    <link rel="stylesheet" href="../style/loginForm.css">

    <!--외부 js-->
    <script src="../js/loginPage.js"></script>

</head>
<body>
<div class="logoBox mx-auto">
    <a href="#"></a>
</div>
<div class="loginBox mx-auto">
    <form name="frmLogin" method="post" action="/login/confirm" enctype="UTF-8">
        <div class="loginBox__input-box">
            <div class="idInputBox">
                <label for="user_id">아이디 또는 전화번호</label>
                <input type="text" id="user_id" name="user_id">
            </div>
            <div class="pwInputBox">
                <label for="user_pw">비밀번호</label>
                <input type="password" id="user_pw" name="user_pw">
            </div>
            <div class="tryAgainIdScript">
                <p><span>아이디 또는 전화번호</span>를 입력해주세요.</p>
            </div>
            <div class="tryAgainPwScript">
                <p><span>비밀번호</span>를 입력해주세요.</p>
            </div>
            <div class="tryAgainIdOrPwScript active">
                <c:if test="${cmd eq 'notConfirmed'}">
                    <p>아이디(로그인 전화번호, 로그인 전용 아이디) 또는 비밀번호가 잘못 되었습니다. 아이디와 비밀번호를 정확히 입력해 주세요.</p>
                </c:if>
            </div>
            <div class="submitBox">
                <input type="button" onClick="isValid()" value="로그인">
            </div>
        </div>
    </form>
</div>

<ul class="goToMemberURL flex justify-center">
    <li><a href="#">아이디 찾기</a></li>
    <li><a href="#">비밀번호 찾기</a></li>
    <li><a href="#">회원가입</a></li>
</ul>
</body>
</html>
