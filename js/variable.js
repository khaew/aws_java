
window.onload = () => {
  main();
}

function main(){
  var a = 10;
  let b = 20;    //변수
  const c = 30;  //상수임. 변할수x

  console.log(a);
  console.log(b);
  console.log(c);

  var a = 40;
  console.log(a);
  b = 50;
  console.log(b);
  // c = 60;
  // console.log(c);

  let name = "김ㅇㅇ";
  let age = 30;
  let score = 80.5;
  let status = true;

  console.log("이름" + name + " - type(" + typeof(name) + ")");
  console.log("나이" + age + " - type(" + typeof(age) + ")");
  console.log("성적" + score + " - type(" + typeof(score) + ")");
  console.log("상태" + status + " - type(" + typeof(status) + ")");
  
  console.log("10" == 10); //값만비교
  console.log("10" === 10); //값 + 자료형 비교
  console.log("10" != 10); 
  console.log("10" !== 10); 

  let count;
  console.log(count);
  //변수가 선언이 되었지만 초기화 되지 않아 형태를 알수없음=undefied
  let count2 = null;
  console.log(count2);

  if(count === undefined || count === null || count === 0 || count ===""){
    console.log(true);
  }
 
  //자바스크립트는 값이 undefined, null, 0, ""이면 false의 결과를 반환한다.




  count = "";  

  if(!count){
    console.log("값이없음");
  }

  if(!!count){
    console.log("값이있음");
  }
}