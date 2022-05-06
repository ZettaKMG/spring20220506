package lecture.c01lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class JavaBeans2 {

	@Getter
	@Setter
	private int id;
	
	@Getter
	@Setter
	private String model;
}
