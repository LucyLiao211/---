allChild[index].onclick = function(){
if(gamInt == true){
$("#tu").css("display","block");

clearInterval(countdownTimer);

setTimeout(function(){

removeImgFun();
$("#tu").css("display","none");
imgNum++;
if(imgNum >= 10){
imgNum = 10;
}
createImgFun();

countdownTimer = setInterval(function (){
countdownNum -= 0.01;

countdownNum = countdownNum.toFixed(2);
if (countdownNum <= 0){
clearInterval(countdownTimer);

alert("游戏结束！");

gamInt = false;
}
time.innerHTML = "倒计时:" + countdownNum + "秒";
},10);
},2000)

scores += 1;
score.innerHTML = "第" + scores + "关";
if(scores > 8){
$("#wc").css("display","block");
$("#haha").css("display","none");
$("#cj").on("click",award());
$("#sm").on("click",explain());
}
}
}
