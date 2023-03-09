package client;
import org.sid.Account;
import org.sid.BankService;
import org.sid.BankWS;
import java.util.List;

public class ClientWS
{
    public static void main(String[] args)
    {
        BankService proxy = new BankWS().getBankServicePort();
        Account account = proxy.getAccount(9);
        System.out.println(account.getId());
        System.out.println(account.getBalance());
        System.out.println(account.getCreationDate());
        List<Account> accounts = proxy.accountsList();
        accounts.forEach(cp ->
        {
            System.out.println("----------------------");
            System.out.println("Account Id : "+cp.getId());
            System.out.println("Balance = "+cp.getBalance());
            System.out.println("Creation Date = "+cp.getCreationDate());
        });
    }
}

