package ws;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name="Account")
@XmlAccessorType(XmlAccessType.FIELD)
public class Account
{
        private int Id;
        private double Balance;
        private Date CreationDate;

        public Account(){

        }
        public Account(int id, double balance, Date creationDate) {
            Id = id;
            Balance = balance;
            CreationDate = creationDate;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public double getBalance() {
            return Balance;
        }

        public void setBalance(double balance) {
            Balance = balance;
        }

        public Date getCreationDate() {
            return CreationDate;
        }

        public void setCreationDate(Date creationDate) {
            CreationDate = creationDate;
        }
}
