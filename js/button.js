const plus = () =>{
  const resultObj= document.querySelector(".result"); //.result = css
  let oldNumber = parseInt(resultObj.innerHTML);

  resultObj.innerHTML = oldNumber + 1; 
}
const minus = () =>{
  const resultObj= document.querySelector(".result");
  let  oldNumber = parseInt(resultObj.innerHTML);  
  //parseInt 숫자로 바꿔서 대입

  resultObj.innerHTML = oldNumber - 1; 
}