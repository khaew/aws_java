 window.onload = () =>{
  const cupImg = document.querySelector(".img-border img");
  cupImg.src = "./images/cup1.jpg";
  cupImg.onclick = cupImgOnClickHandle;
  // document.onclick  = (e) => {  //도큐먼트에클릭
  //   //e=event / e.target=이벤트대상
  //     if(e.target.src.includes("cup1")) {
  //       e.target.src = ".images/cup2.jpg";
  //     } else {
  //       e.target.src = "./images/cup1.jpg";
  //     }
  //  }
 
}



 //대상에 클릭
 const cupImgOnClickHandle = (e) => {  
  //e=event / e.target=이벤트대상
    if(e.target.src.includes("cup1")) {
      e.target.src = "./images/cup2.jpg";
    } else {
      e.target.src = "./images/cup1.jpg";
    }
 }

 