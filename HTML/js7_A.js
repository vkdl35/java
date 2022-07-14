function callback() {
    var a = 1;
    var sum = 0;
    while(a < 10){
        sum += a*5;
        a++;
    }
    var result = re(sum);
    console.log(result);
}