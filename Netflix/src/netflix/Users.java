
package netflix;

public class Users {

   public Users(int user_id, String name, String surname, String username, String password,String email, String phoneNumb) {
        this.user_id = user_id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.email=email;
        this.phoneNumb = phoneNumb;
    }
   private int user_id;
   private String name;
   private String surname;
   private String username;
   private String password;
   private String email;
   private String phoneNumb;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }     
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhoneNumb() {
        return phoneNumb;
    }
    public void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
    }
}
