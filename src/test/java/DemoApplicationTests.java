import model.BeanLifecycle;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	ClassPathXmlApplicationContext applicationcontext=null;
//	@Before
//	public void before() {
//		System.out.println("》》》Spring ApplicationContext容器开始初始化了......");
//		applicationcontext= new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
//		System.out.println("》》》Spring ApplicationContext容器初始化完毕了......");
//	}
	@Test
	public void  test() {
		System.out.println(" test 开始。。。。。。。。。。");
		ClassPathXmlApplicationContext applicationcontext= new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		BeanLifecycle beanLifecycle =applicationcontext.getBean("beanLifecycle",BeanLifecycle.class);
		//applicationcontext.close();
		applicationcontext.registerShutdownHook();
	}

}
