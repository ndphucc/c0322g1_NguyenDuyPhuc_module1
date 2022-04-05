const PI = 3.14;
function display1() {
    let a =parseFloat(document.getElementById("ly").value);
    let b =parseFloat(document.getElementById("hoa").value);
    let c =parseFloat(document.getElementById("sinh").value);
    let tb = (a+b+c)/3;
    let sum = a+b+c;
    document.getElementById('div').innerHTML ="Điểm tb = "+ tb+"<br>Tổng điểm= "+ sum ;
}
function cSangf() {
    let c = parseFloat(document.getElementById("doC").value);
    let f= c/5*9+32;
    document.getElementById('doF').innerText="F="+f;
}
function hinhtron() {
    let r = parseFloat(document.getElementById("bankinh").value);
    let c= 2*r*PI;
    let s= r*r*PI;
    document.getElementById("c_s_hinh_tron").innerHTML="Chu vi hình tron:"+c+" m"+"<br>Dien tích hình tròn:"+s+" m<sup>2</sup>";
}