
package netflix;

public class CreditCard {
 private int creditCard_id;
 private int User_id;   
 private int number;   
 private String ExpDate;   
 private int securityCode;  

    public CreditCard(int creditCard_id, int User_id, int number, String ExpDate, int securityCode) {
        this.creditCard_id = creditCard_id;
        this.User_id = User_id;
        this.number = number;
        this.ExpDate = ExpDate;
        this.securityCode = securityCode;
    }

    public int getCreditCard_id() {
        return creditCard_id;
    }

    public void setCreditCard_id(int creditCard_id) {
        this.creditCard_id = creditCard_id;
    }

    public int getUser_id() {
        return User_id;
    }

    public void setUser_id(int User_id) {
        this.User_id = User_id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getExpDate() {
        return ExpDate;
    }

    public void setExpDate(String ExpDate) {
        this.ExpDate = ExpDate;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }
 
}
