package rain.service;

import java.util.List;

import rain.pojo.Account;


/*
 * @Kouch
 * 
  *   提供对Account的增删改查服务；
 * 
 */

public interface AccountService {
	
	// 查
	public List<Account> findAllAccount();
	
//	public Account findAccountById(int id);
//	
//	public Account findAccountByName(String account);
//	
//	//增
//	public boolean addAccount(Account account);
// 
//	//删
//	public void delAccount(int id);
//	
//	//改
//	public boolean updateAccount(Account account);
 
	
	
}
