package lecture.c03core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		String path = "lecture/c04core/context.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(); // dependancy injection 역할
		
	}
}
