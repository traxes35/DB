
package netflix;

public class SubscriptionType {
 private int subscriptionType_id;   
 private String name;   
 private String maxQuality;   
 private String price;
 private String maxVideo;   

    public SubscriptionType(int subscriptionType_id, String name, String maxQuality, String price, String maxVideo) {
        this.subscriptionType_id = subscriptionType_id;
        this.name = name;
        this.maxQuality = maxQuality;
        this.price = price;
        this.maxVideo = maxVideo;
    }

    public int getSubscriptionType_id() {
        return subscriptionType_id;
    }

    public void setSubscriptionType_id(int subscriptionType_id) {
        this.subscriptionType_id = subscriptionType_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaxQuality() {
        return maxQuality;
    }

    public void setMaxQuality(String maxQuality) {
        this.maxQuality = maxQuality;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMaxVideo() {
        return maxVideo;
    }

    public void setMaxVideo(String maxVideo) {
        this.maxVideo = maxVideo;
    }

    
}
