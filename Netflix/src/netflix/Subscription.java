
package netflix;

public class Subscription {
 private int subscription_id;   
 private int Users_id;   
 private int creditCard_id;   
 private int subscriptionType_id;   
 private String startDate;
 private String endDate;

    public Subscription(int subscription_id, int Users_id, int creditCard_id, int subscriptionType_id, String startDate, String endDate) {
        this.subscription_id = subscription_id;
        this.Users_id = Users_id;
        this.creditCard_id = creditCard_id;
        this.subscriptionType_id = subscriptionType_id;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getSubscription_id() {
        return subscription_id;
    }

    public void setSubscription_id(int subscription_id) {
        this.subscription_id = subscription_id;
    }

    public int getUsers_id() {
        return Users_id;
    }

    public void setUsers_id(int User_id) {
        this.Users_id = User_id;
    }

    public int getCreditCard_id() {
        return creditCard_id;
    }

    public void setCreditCard_id(int creditCard_id) {
        this.creditCard_id = creditCard_id;
    }

    public int getSubscriptionType_id() {
        return subscriptionType_id;
    }

    public void setSubscriptionType_id(int subscriptionType_id) {
        this.subscriptionType_id = subscriptionType_id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
}
