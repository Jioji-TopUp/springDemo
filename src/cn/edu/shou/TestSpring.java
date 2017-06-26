package cn.edu.shou;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	private Person person;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		TestSpring app = new TestSpring();
		app.person = new Chinese("Beijing");
		app.person.drink();*/
		
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Chinese cn = (Chinese)ac.getBean("cn");
		Germany ge = (Germany)ac.getBean(Germany.class);
		cn.drink();
		ge.drink();
	}
}
