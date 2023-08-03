
//웹 문서에서 원하는 요소를 찾아가는 것을 “접근한다(access)”고 함

const box1 = document.getElementById("box1");                 //1.
const box2Array=document.getElementsByClassName("box2");      //2.
//list, 인덱스로 일부 꺼내기 가능 [n]
const divArray = document.getElementsByTagName("div");        //3.
//list

box1.innerHTML = `<input type ="password">`;
// box2Array[1].innerHTML= `<input type = "text">`;

const box1_qs = document.querySelector("#box1");              //1.
const box2Array_qs = document.querySelectorAll(".box2");      //2.
const usernameInput = box2Array_qs[1].querySelector(".username-input");
const divArray_qs = document.querySelectorAll("div");         //3.

usernameInput.value="test";

console.log(box2Array_qs);


