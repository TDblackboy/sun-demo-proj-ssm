package rain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rain.mapping.AccountMapper;
import rain.pojo.Account;
import rain.service.AccountService;


/*
 * @Kouch
 * 
 * AccountService接口实现类；
 */


@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountMapper accountMapper;//Dao
	
	//查
	public List<Account> findAllAccount() {
		return this.accountMapper.findAllAccount();
	}

	/*
	 * public Account findAccountById(int id) { return
	 * this.accountMapper.findAccountById(id); }
	 * 
	 * public Account findAccountByName(String account) { return
	 * this.accountMapper.findAccountByName(account); }
	 * 
	 * //增 public boolean addAccount(Account account) { return
	 * this.accountMapper.addAccount(account)>0?true:false; }
	 */
	
	//删
	public void delAccount(int id) {
		
	}
	
	//改
	public boolean updateAccount(Account account) {
		return false;
	}

	

}
