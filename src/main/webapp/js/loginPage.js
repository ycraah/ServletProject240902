function isValid(){
    const frmLogin = document.frmLogin;
    const user_id = frmLogin.user_id.value;
    const user_pw = frmLogin.user_pw.value;
    const tryAgainIdScript = document.querySelector('.tryAgainIdScript');
    const tryAgainPwScript = document.querySelector('.tryAgainPwScript');

    //함수 시작할 시 초기화
    tryAgainIdScript.classList.remove('active');
    tryAgainPwScript.classList.remove('active');

    //아이디 유효성 검사
    if(user_id.length > 0){
        //비밀번호 유효성 검사
        if(user_pw.length>0){
            frmLogin.method = "post";
            frmLogin.action = "/login/confirm";
            frmLogin.submit();
            tryAgainPwScript.classList.remove('active');
        } else {
            tryAgainPwScript.classList.add('active');
        }
    } else{
        tryAgainIdScript.classList.add('active');
    }
}