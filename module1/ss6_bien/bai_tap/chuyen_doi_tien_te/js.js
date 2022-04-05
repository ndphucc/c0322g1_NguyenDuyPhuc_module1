const A = 22.8250
function cd() {
    let fr = document.getElementById('from').value;
    let to = document.getElementById('to').value;
    let inPt = parseInt(document.getElementById('ipt').value);
    if(fr=='a'&&to== 'b') {
        let ouPt = inPt / A;
        document.getElementById('in').innerHTML ='<p style="color: blue"> Result:'+ouPt + '</p>';
    }
    if(fr=='b'&&to== 'a') {
        let ouPt = inPt * A;
        document.getElementById('in').innerHTML ='<p style="color: blue"> Result:'+ouPt + '</p>';
    }



}