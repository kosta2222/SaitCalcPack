<html>
<body>
<h2>Введите формулу</h2> </br>
 28.02.17<br>
-------- <br>
contact: muh_kosta@mail.ru<br>
---------<br>
Это программа калькулятор,в поле можно вводить математические выражения:<br>
поддерживаются
1)целые числа ex 8 90 <br>
2)дробные числа  ex 8.90 90.7 <br>
3)число e    <br>
4)операции:() + - / * ^(возведение в степень) <br>
5)дупускаются пробелы,переносы строк,табуляция <br>
---------<br>
ex:           <br>
(2+2)*3.7/6.7 +e   <br>
2+2*2 -6          <br>
e*2+4.7        <br>
<textarea id=formula  cols=60 rows=4 id="formula" >
</textarea>
<input type=button value=Отправить onclick=foo() />
<input type=button value=Очистить onclick=clear_foo() />

<div class=result>Otvet</div>
<script src="./jquery/jquery-3.0.0.min.js"></script>
<script language=javascript>
function clear_foo(){
$('#formula').val('');
}

function foo(){
var s=document.getElementById("formula").value;
var s1=s.replace(/\+/gi,"p");
$.ajax({
url: './action.jsp',
data: 'data='+ s1,
type: 'get',
success:function(data){ //veshaem svoi obrabotchik
$('.result').html(data);
}
});
}
</script>
</body>
</html>
