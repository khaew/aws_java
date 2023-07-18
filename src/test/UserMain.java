package test;


		class User{
			private String username;
			private String password;
			private String name;
			private String email;

			public User(String username, String password, String name, String email) {

			super();
			this.username = username;
			this.password = password;
			this.name = name;
			this.email = email;

			}

			void info() {

			System.out.println("uersname:"+username);
			System.out.println("password:"+1234);
			System.out.println("name:"+name);
			System.out.println("email:"+email);
			}

			}



			public class UserMain {

			public static void main(String[] args) {
			User user = new User("junil", "1234", "김준일", "junijl@gamil.com");
			System.out.println("[사용자정보]");
			user.info();

			}
	
	}


