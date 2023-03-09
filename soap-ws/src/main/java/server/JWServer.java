package server;

import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class JWServer
{
    public static void main(String[] args)
    {
        String url = "http://0.0.0.0:8084/";
        Endpoint.publish(url,new BankService());
        System.out.println("Web service deployed on : "+url);
    }
}
