<?php
    $mt=0;
if(isset($_POST['action']))
{
    $action = $_POST['action'];
    if($action == "ok")
    {
        if (isset($_POST['amount']))
        {
            $mt = $_POST['amount'];
            $clientSoap = new SoapClient("http://localhost:8084/BankService?wsdl");
            $param = new stdClass();
            $param->amount = $mt;
            $res = $clientSoap->__soapCall("Convert_USD_to_MAD", array($param));
        }
    }
    else if($action == "accounts")
    {
        $clientSoap = new SoapClient("http://localhost:8084/?wsdl");
        $accounts = $clientSoap->__soapCall("AccountsList",array());
    }
    else if ($action == "account"){
        $mt = $_POST['amount'];
        $clientSoap = new SoapClient("http://localhost:8084/?wsdl");
        $param = new stdClass();
        $param->Id = $mt;
        $account = $clientSoap->__soapCall("getAccount",array($param));
    }

}
?>

<html>
<body>
    <form action="soap_ws_php_client.php" method="post">
        Amount/Id : <input type="text" name="amount" value="<?php echo ($mt) ?>">
        <input name="action" type="submit" value="ok" >
        <input name="action" type="submit" value="accounts" >
        <input name="action" type="submit" value="account" >


    </form>
    <?php if(isset($res)){ ?>
            <?php echo ($mt) ?> USD = <?php echo($res->return) ?> MAD
    <?php }?>

    <?php if(isset($accounts)){?>


            <table border="1">
                <tr>
                    <td>Id</td>
                    <td>Balance</td>
                    <td>Creation Date</td>
                </tr>
                <?php foreach ($accounts->return as $cp) {?>
                    <tr>
                        <td><?php echo($cp->Id) ?></td>
                        <td><?php echo($cp->Balance) ?></td>
                        <td><?php echo($cp->CreationDate) ?></td>
                    </tr>
                <?php } ?>
            </table>
    <?php }?>
    <?php if(isset($account)){ ?>
        Account: Id=<?php echo($account->return->Id) ?> Balance=<?php echo($account->return->Balance) ?> Creation Date=<?php echo($account->return->CreationDate) ?>
    <?php }?>
</body>
</html>
