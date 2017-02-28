<html>
<body>
<p>Введите формулу</p> <br>
<textarea id=formula  cols=60 rows=4 id=formula >
</textarea>
<input type=button value=Отправить onclick=foo() />
<div class=result>Otvet</div>
<script src="./jquery/jquery-3.0.0.min.js"></script>
<script language=javascript>

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
