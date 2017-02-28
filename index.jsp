<html>
<head>
<title>Calc</title>
<link rel="stylesheet" type="text/css" href="../css/main.css" />
</head>
<body>
<div class=wrap>
<div class=header>
<H1>Калькуляторы </H1>
</div>
<div class=content>
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
Это программа вычисление суммы в рублях за некоторое количество дней и учитывая электроприборы<br>
lamp(лампочка) comp(компютер) refrig(холодильник) telic(телевизор) задавать именно в таком <br>
порядке,если кого-то не надо учитывать -проставить параметры в ноль (0).<br>
Использование:
svet:lamp(<количество ват прибора>,<их количество>)[<количество часов работы прибора в день> ]<br>
comp(<аналогично lamp>,<аналогично lamp>)[1<аналогично lamp>] refrig(<аналогично lamp>,<аналогично lamp>)[<аналогично lamp>]<br>
 telic(<аналогично lamp>,<аналогично lamp>)[<аналогично lamp>] rub=<сумма в рублях за Киловат/час> N=<количество дней за которое подсчитать><br>
ex:svet:lamp(60,3)[6] comp(100,1)[10] refrig(100,1)[7] telic(90,1)[10] rub=2.3 N=30<br>
svet:lamp(60,3)[6] comp(100,1)[10] refrig(100,1)[7] telic(0,0)[0] rub=2.3 N=30<br>
svet:lamp(60,3)[6] comp(100,1)[10] refrig(100,1)[6] telic(0,0)[0]<br>
rub=2.3 N=31<br>
<textarea   cols=60 rows=4 id="formula1" >
svet:lamp(,)[] comp(,)[] refrig(,)[] telic(,)[] rub=2.3 N=30
</textarea>
<input type=button value=Отправить onclick=foo1() />
<input type=button value=Очистить onclick=clear_foo("formula1") />

<div class=result1>Otvet</div>
<script src="./jquery/jquery-3.0.0.min.js"></script>
<script language=javascript>
$('#formula1').val('svet:lamp(,)[] comp(,)[] refrig(,)[] telic(,)[] rub=2.3 N=30');
function clear_foo(s){
s='#'+s;
if(s=="#formula1")
$(s).val('svet:lamp(,)[] comp(,)[] refrig(,)[] telic(,)[] rub=2.3 N=30');
else
$(s).val(' ');
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
<div class=sidebar>
</div>
</div>
</div>
</body>
</html>
