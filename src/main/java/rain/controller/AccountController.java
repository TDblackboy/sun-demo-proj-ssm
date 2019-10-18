package rain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rain.pojo.Account;
import rain.service.AccountService;


/*
 *  kouch
 *  
 *  接受前端对account的请求
 *  调用后台提供的对account的服务
 */

@Controller
public class AccountController {

	//通过注释的方式  绑定  服务类，然后供本类中的方法使用
	@Autowired
	private AccountService accountService;

	//@RequestMapping?
	//请求 - 初始化加载所有数据 - 返回index界面 - model容器传参
	@RequestMapping(value="/showdata", method=RequestMethod.GET)
	public String index(Model model){

		//System.out.println("可不可以直接访问index.jsp是将参数”index“传到controller？：jsp可以传值到AccountController.java");
		List<Account> accounts = null;
		accounts =	 accountService.findAllAccount();

		System.out.println("find:"+accounts.get(0).getAccount());

		model.addAttribute("accounts",accounts);
		return "showdata";//无法发访问index.jsp ；配置文件的路径问题
						  //原因：spring-mvc中设置的视图解释器返回的页面地址/WEB_INF/view/**

	}

}
