package ssm;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xhhy.dao.UserDao;
import com.xhhy.domain.UserBean;

public class appTest {
    @Test
	public void fun1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dao.xml");
		UserDao user = context.getBean("userDao",UserDao.class);
		List<UserBean> users = user.queryAll();
		for (UserBean userBean : users) {
			System.out.println(userBean);
		}
	}
	
	
	
	
}
