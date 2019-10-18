package rain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rain.service.TestService;

/*
 * kouch
 * 
 * 测试 SSM controller配置成功
 *      success：跳转到test.jsp
 */

@Controller
public class TestController {
    
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
		//实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
		System.out.println("看看控制台能输出不？");
        return "test";
    }
	
	@RequestMapping(value = "springtest", method = RequestMethod.GET)
	public String springTest() {
		return testService.test();
		
	}
}
