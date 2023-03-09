
package org.sid;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sid package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Account_QNAME = new QName("http://ws/", "Account");
    private final static QName _AccountsList_QNAME = new QName("http://ws/", "AccountsList");
    private final static QName _AccountsListResponse_QNAME = new QName("http://ws/", "AccountsListResponse");
    private final static QName _ConvertUSDToMAD_QNAME = new QName("http://ws/", "Convert_USD_to_MAD");
    private final static QName _ConvertUSDToMADResponse_QNAME = new QName("http://ws/", "Convert_USD_to_MADResponse");
    private final static QName _GetAccount_QNAME = new QName("http://ws/", "getAccount");
    private final static QName _GetAccountResponse_QNAME = new QName("http://ws/", "getAccountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.sid
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link AccountsList }
     * 
     * @return
     *     the new instance of {@link AccountsList }
     */
    public AccountsList createAccountsList() {
        return new AccountsList();
    }

    /**
     * Create an instance of {@link AccountsListResponse }
     * 
     * @return
     *     the new instance of {@link AccountsListResponse }
     */
    public AccountsListResponse createAccountsListResponse() {
        return new AccountsListResponse();
    }

    /**
     * Create an instance of {@link ConvertUSDToMAD }
     * 
     * @return
     *     the new instance of {@link ConvertUSDToMAD }
     */
    public ConvertUSDToMAD createConvertUSDToMAD() {
        return new ConvertUSDToMAD();
    }

    /**
     * Create an instance of {@link ConvertUSDToMADResponse }
     * 
     * @return
     *     the new instance of {@link ConvertUSDToMADResponse }
     */
    public ConvertUSDToMADResponse createConvertUSDToMADResponse() {
        return new ConvertUSDToMADResponse();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     * @return
     *     the new instance of {@link GetAccount }
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountResponse }
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountsList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountsList }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "AccountsList")
    public JAXBElement<AccountsList> createAccountsList(AccountsList value) {
        return new JAXBElement<>(_AccountsList_QNAME, AccountsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountsListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountsListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "AccountsListResponse")
    public JAXBElement<AccountsListResponse> createAccountsListResponse(AccountsListResponse value) {
        return new JAXBElement<>(_AccountsListResponse_QNAME, AccountsListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertUSDToMAD }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertUSDToMAD }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Convert_USD_to_MAD")
    public JAXBElement<ConvertUSDToMAD> createConvertUSDToMAD(ConvertUSDToMAD value) {
        return new JAXBElement<>(_ConvertUSDToMAD_QNAME, ConvertUSDToMAD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertUSDToMADResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertUSDToMADResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Convert_USD_to_MADResponse")
    public JAXBElement<ConvertUSDToMADResponse> createConvertUSDToMADResponse(ConvertUSDToMADResponse value) {
        return new JAXBElement<>(_ConvertUSDToMADResponse_QNAME, ConvertUSDToMADResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

}
