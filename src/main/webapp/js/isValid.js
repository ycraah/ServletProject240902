function isValid(){
    const frmLogin = document.frmLogin;
    const user_id = frmLogin.user_id.value;
    const user_pw = frmLogin.user_pw.value;

    if(user_id.length > 0 && user_pw.length > 0){
        frmLogin.method = "post";
        frmLogin.action = "/login/confirm";
        frmLogin.submit();
    } else{
        alert("아이디와 비밀번호는 필수입니다");
    }
}