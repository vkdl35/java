var da1=['hong','park','kim','jang','lee'];
var da2=['ahong','bpark','kkim123','jang1234','lee0909']
function re(m1){
   var mm1 = m1;
   var w1=0;
   var v;
   var ok=false;
   while(w1<da1.length){
      if(mm1[0]==da1[w1]){
         v=w1;
         v= re12([v,mm1[1]]);
         ok=true;
         break;
      }
      w1++;
   }
   if(ok==false){
      v="아이디가 다릅니다.";
   }
   b2(v);
   return v;
   
}
function re12(v12){
   var mid = v12;
   var mo;
   if(da2[mid[0]]==mid[1]){
      mo=mid[0];
   }
   else{
      mo="pw다름";
   }
   return mo;
}