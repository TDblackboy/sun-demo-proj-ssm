package rain.mapping;

import java.util.List;

import rain.pojo.Account;


/*
 * @Kouch
 * 
 * Dao层接口：数据库中 Account 增删改查；
 * 
 * Dao层：面向数据库
 * 
  *   具体实现：
  *   	xml配置文件加载sql语句 
  *   	相关的mapper.xml配置文件 - 在mybatis.xml配置文件中设置
 * 
 */
public interface AccountMapper {

	//查
	public List<Account> findAllAccount();


}
