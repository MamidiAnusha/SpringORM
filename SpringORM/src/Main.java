import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.account.dao.IAccountDao;
import com.account.model.Account;

public class Main {

	public static void main(String[] args) {

   ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
   IAccountDao adao = (IAccountDao)context.getBean("accDao");
   Account account = new Account();
   adao.createAccount(account);
   account.setAccId(105);
   account.setAccName("vfgdrg");
   account.setAccBal(14527.2);
   
   System.out.println(account);
   
   

	}

}
