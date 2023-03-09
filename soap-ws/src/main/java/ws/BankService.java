package ws;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.Date;
import java.util.List;
@WebService(serviceName = "BankWS")
public class BankService
{
    @WebMethod(operationName = "Convert_USD_to_MAD")
    public double conversion(@WebParam(name="amount") double amount)
    {
        return amount*10.45;
    }
    public Account getAccount(@WebParam(name="Id")int identifier)
    {
        return new Account(identifier,Math.random()*97000,new Date());
    }
    public List<Account> AccountsList()
    {
        return List.of(
                new Account(1,Math.random()*97000,new Date()),
                new Account(2,Math.random()*97000,new Date()),
                new Account(3,Math.random()*97000,new Date())
        );
    }
}
