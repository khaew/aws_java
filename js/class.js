const user = {
  username: null,
  password: null,
  name: null,
  email : null,
  toString:() => {
    return "user(" + user.username + "," + user.password + "," + user.name + "," + user.email + ")";
  },
}
user.username = "aaa";
user.password = "1234";
user.name = "김 ㅇㅇ";
user.email = "aaa@gmail.com";
console.log(user.toString);
console.log(user);

class User{
  username;
  password;


  //생성자
  constructor(username, password){
    this.usernmae = username;
    this.password = password;
  }

  usernameAndPasswordCheck(username, password){
    console.log("입력한 아이디: "+username);
    console.log("입력한 비밀번호:" + password);
    if(username !== this.username || password !== this.password){
      alert("로그인실패");
      return;
    }
    alert("로그인성공");
  }

}
const bbb = new User("bbb", "1234");
bbb.usernameAndPasswordCheck("bbb","1234");
