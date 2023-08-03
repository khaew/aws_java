function add(x, y){
  return x+y; 
}  //자료형없음. 변수명만

console.log(add(10,20));

function sub(x,y){
  return;
}

const printInfo = function(){   //const 상수, 함수를 정의해서 변수에 넣음
  console.log("정보출력");
};

printInfo();

console.log(typeof(printInfo));

function callback(fx){
  console.log("콜백 함수");
  fx();
}

callback(printInfo);

//익명함수
const fx1 = function(a) {
  console.log("a: "+a);
}
fx1(10);

//화살표함수(람다)
const fx2 = (b)  =>{
  console.log("b: " + b);
}


fx2(20);


