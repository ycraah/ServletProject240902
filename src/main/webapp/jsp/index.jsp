<%--
  Created by IntelliJ IDEA.
  User: ktf_y
  Date: 2024-09-02
  Time: 오후 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인 페이지로 이동</title>
    <!-- 제이쿼리 불러오기 -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

    <!-- 테일윈드 불러오기 -->
    <script src="https://cdn.tailwindcss.com"></script>

    <link rel="stylesheet" href="../style/style.css">
</head>
<body>
<div class="goToLoginPage__click-box mx-auto">
    <p class="script">네이버를 더 안전하고 편리하게 이용하세요</p>
    <a class="goToLoginURL" href="http://localhost:8080/login/loginForm"><span class="naver">NAVER</span> 로그인</a>
    <ul class="goToMemberURL flex justify-center">
        <li><a href="findUserId.jsp">아이디 찾기</a></li>
        <li><a href="findUserPw.jsp">비밀번호 찾기</a></li>
        <li><a href="registerForm.jsp">회원가입</a></li>
    </ul>
</div>
</body>
</html>
