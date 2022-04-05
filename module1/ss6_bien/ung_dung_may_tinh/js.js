function add() {
    let a = parseFloat(document.getElementById('1').value)
    let b = parseFloat(document.getElementById('2').value)
    let returnn = a+b;
    document.getElementById('result').innerText=''+returnn;
}
function sub() {
    let a = parseFloat(document.getElementById('1').value)
    let b = parseFloat(document.getElementById('2').value)
    let returnn = a-b;
    document.getElementById('result').innerText=''+returnn;
}
function mul() {
    let a = parseFloat(document.getElementById('1').value)
    let b = parseFloat(document.getElementById('2').value)
    let returnn = a*b;
    document.getElementById('result').innerText=''+returnn;
}
function divs() {
    let a = parseFloat(document.getElementById('1').value)
    let b = parseFloat(document.getElementById('2').value)
    let returnn = a/b;
    document.getElementById('result').innerText=''+returnn;
}