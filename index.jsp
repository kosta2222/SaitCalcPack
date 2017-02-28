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
<textarea   cols=60 rows=4 id="formula" > 
</textarea>
<input type=button value=Отправить onclick=foo() />
<input type=button value=Очистить onclick=clear_foo("formula") />

<div class=result>Otvet</div>
<br>
<h2>Свет:</h2>
svet:lamp(60,3)[6] comp(100,1)[10] refrig(0,0)[6] telic(0,0)[0]
rub=2.3 N=31<br>
<textarea   cols=60 rows=4 id="formula1" >
</textarea>
<input type=button value=Отправить onclick=foo1() />
<input type=button value=Очистить onclick=clear_foo("formula1") />

<div class=result1>Otvet</div>

<script src="./jquery/jquery-3.0.0.min.js"></script>
<script language=javascript>
function clear_foo(s){
s='#'+s;
$(s).val('');
}

function foo(){
var s=document.getElementById("formula").value;
var s1=s.replace(/\+/gi,"p");
$.ajax({
url: './rest/action.jsp',
data: 'data='+ s1,
type: 'get',
success:function(data){ //veshaem svoi obrabotchik
$('.result').html(data);
}
});
}
function foo1(){
var s=document.getElementById("formula1").value;
//var s1=s.replace(/\+/gi,"p");
$.ajax({
url: './rest/action1.jsp',
data: 'data='+ s,
type: 'get',
success:function(data){ //veshaem svoi obrabotchik
$('.result1').html(data);
}
});
}
</script>
</body>
</html>
