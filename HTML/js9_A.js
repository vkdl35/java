/**
 * 
 */
 
 var ok2 = ['Y','N','Y','Y','Y'];
 var tel2 = ['01012345678','01055994411','01035370132','01078015457','01031374882'];
 var email2 = ['hong@naver.com','park@nate.com','kim_001@gmail.com','jang_go@gmail.com','lee09@naver.com'];
 var msg;
 function b2(num2){
    
    
       if(ok2[num2]=="N"){
          msg = "탈퇴 회원입니다."
       }
       else{
          msg = [tel2[num2],email2[num2]];
          
       }
          
          user(msg);
          
    
 }