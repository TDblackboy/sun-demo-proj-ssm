package rain.service.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import rain.pojo.Account;
import rain.service.AccountService;

/**
 * kouch
 *  
 *  功能：测试SSM后台服务是否可以服务 及 相关配置是否成功
 *    
 *  注：配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 *  
 */

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration({ "classpath:/config/applicationContext.xml"})//告诉junit spring配置文件
public class ServiceTest1 {
	
	@Autowired
	public AccountService accountService;
	
	
	@Test
	public void getAccountsFromDataBase() {
		List<Account> ac=accountService.findAllAccount();
		System.out.println("返回："+ac.get(0).getAccount());
	}
	
//	public void main(String[] args) {
//		ApplicationContext application=new ClassPathXmlApplicationContext("applicationContext.xml");
//		AccountService accountService=(AccountService)application.getBean("accountService");
//		List<Account> ac=accountService.findAllAccount();
//		System.out.println("返回："+ac.get(0));
//	}
	
}
