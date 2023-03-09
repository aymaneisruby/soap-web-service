using BankServiceReference;

BankService stub = new BankServiceClient();
Convert_USD_to_MADRequest request = new Convert_USD_to_MADRequest(99.99);
Convert_USD_to_MADResponse response = stub.Convert_USD_to_MAD(request);
double res = response.@return;
Console.WriteLine(res);

getAccountRequest request1 = new getAccountRequest(100);
getAccountResponse response1 = stub.getAccount(request1);
account account = response1.@return;
Console.WriteLine("Account Id : " + account.Id);
Console.WriteLine("Balance : " + account.Balance);
Console.WriteLine("Creation Date : " + account.CreationDate);


AccountsListRequest request2 = new AccountsListRequest();
AccountsListResponse response2 = stub.AccountsList(request2);

account[] accounts = response2.@return;

foreach (account accnt in accounts)
{
    Console.WriteLine("---------------------");
    Console.WriteLine(accnt.Id + "\t" + accnt.Balance + "\t" + accnt.CreationDate.ToString());
}

for (int i = 0; i < accounts.Length; i++)
{
    Console.WriteLine("---------------------");
    Console.WriteLine(accounts[i].Id);
    Console.WriteLine(accounts[i].Balance);
    Console.WriteLine(accounts[i].CreationDate.ToString());

}

Console.ReadLine();