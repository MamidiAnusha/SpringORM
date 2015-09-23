import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.account.dao.IAccountDao;
import com.account.model.Account;

public class Main {

	public static void main(String[] args) {

   ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
   IAccountDao adao = (IAccountDao)context.getBean("accDao");
   Account account = (Account)adao.getAccountDetailsById(101);
  // account.setAccId(104);
  // account.setAccName("qrst");
 //  account.setAccBal(5412.01);
   
   System.out.println(account);
   
   

	}

}
