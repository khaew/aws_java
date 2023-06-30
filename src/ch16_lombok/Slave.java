package ch16_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor   //
@ToString
@Setter
@EqualsAndHashCode
@Data     //다됨.

public class Slave {

	private String name;
	//private final String name;   (@RequiredArgsConstructor 쓸때)
	@Getter
	private int age;  //나이만 getter 자동생성하고싶을때 해당 변수 위에 @getter
	

}
