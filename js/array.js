window.onload =() => {
  const numbers = [1,2,3,4,5];
  
  const numbers2 = numbers.map((n) => {
    return n * 2;
  });


  console.log(numbers.join("-"))  //배열에 하이픈표시.
  console.log(numbers2)

  loadUserList();

}

// console.log("usernane:"+userList[0].username);     1.또까틈
// console.log(`username:${userList[0].username}`);   2. 또까틈

// const userList = ["user", "user2", "user3"];
const userList = new Array(); //배열임.
userList.push({username:"aaa", password:"1111"});
userList.push({username:"bbb", password:"2222"});
userList.push({username:"ccc", password:"3333"});
userList.push({username:"ddd", password:"4444"});
userList.push({username:"eee", password:"5555"});



const loadUserList = () => {  //백쿼터``썼을때만 %{} 사용가능.
  const userListTbody = document.querySelector(".user-list");

  for(let i = 0; i<userList.length; i++){
     userListTbody.innerHTML +=`
    <tr>
      <td>${userList[i].username}</td>
      <td>${userList[i].password}</td>
    </tr>
  `; 
  }  

   const mapTest = userList.map((user) => {
    return`
    <tr>
      <td>${user.username}</td>
      <td>${user.password}</td>
    </tr>
  `
  });


  userListTbody.innerHTML = mapTest.join("");

};


