package netflix;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NetApp {

    public void app() throws SQLException {
        Scanner sc = new Scanner(System.in);
        boolean out = true;
       // System.out.println("Welcome to netflix Application What do you wonder ?");
        while (out == true) {
         /*   System.out.println("********************");
            System.out.println("press 1 for Users");
            System.out.println("press 2 for Videos");
            System.out.println("press 3 for Actors");
            System.out.println("press 4 for CreditCards");
            System.out.println("press 5 for Categorys");
            System.out.println("press 6 for SubscriptionType");
            System.out.println("press 7 for Subscription");
            System.out.println("press 8 for Quit");  */           
        int a = sc.nextInt();          
            switch (a) {                
                case (1):
                    getUsers();
                    //break;
                case (2):
                    getVideos();
                    //break;
                case (3):
                    getActors();
                   // break;
                case (4):
                    getCreditCards();
                   // break;
                case (5):
                    getCategorys();
                   // break;
                case (6):
                    getSubscriptionType();
                  //  break;                    
                case (7):
                    getSubscription();
                  //  break;
                case (8):
                    out = false;
                    break;
            }
        }
    }

    public void getUsers() throws SQLException {
        List<Users> uList = new ArrayList<Users>();
        String query = "select * from public.\"users\"";
        SQLOperation op = new SQLOperation();
        ResultSet rs = op.selectOperation(query);
        System.out.println("USERS INFORMATIONS");
        System.out.println("name " + " Surname " + " Username " + " password " + "e mail ");

        while (rs.next()) {
            int users_id = rs.getInt("users_id");
            String name = rs.getString("name");
            String surname = rs.getString("surname");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String email = rs.getString("email");
            String phoneNumb = rs.getString("phoneNumb");
            Users u = new Users(users_id, name, surname, username, password, email, phoneNumb);
            uList.add(u);
            System.out.println(" " + u.getName() + " " + u.getSurname() + " " + u.getUsername() + " " + u.getPassword() + " " + u.getEmail());
        }

    }

    public void getVideos() throws SQLException {
        List<video> vList = new ArrayList<video>();
        String query = "select * from public.\"video\"";
        SQLOperation op = new SQLOperation();
        System.out.println("VIDEO INFORMATIONS");        
        System.out.println("name  type  duration   ReleaseYear   Lang");
        ResultSet rs1 = op.selectOperation(query);
        while (rs1.next()) {
            int video_id = rs1.getInt("video_id");
            String name = rs1.getString("name");
            String type = rs1.getString("type");
            String duration = rs1.getString("duration");
            String releaseYear = rs1.getString("releaseYear");
            String Lang = rs1.getString("Language");
            String Url = rs1.getString("Url");
            video v = new video(video_id, name, type, duration, releaseYear, Lang, Url);
            vList.add(v);
            System.out.println(v.getName() + v.getType() + v.getDuration() + v.getReleaseYear() + v.getLang());
        }

    }

    public void getActors() throws SQLException {
        List<actors> aList = new ArrayList<actors>();
        String query = "select * from public.\"actors\"";
        SQLOperation op = new SQLOperation();
        ResultSet rs1 = op.selectOperation(query);
        System.out.println("ACTORS INFORMATIONS");       
        System.out.println("name      Surname");
        while (rs1.next()) {
            int actors_id = rs1.getInt("actors_id");
            String name = rs1.getString("name");
            String surname = rs1.getString("surname");
            actors a = new actors(actors_id, name, surname);
            aList.add(a);
            System.out.println(a.getName() + a.getSurname());
        }
    }

    public void getCreditCards() throws SQLException {
        List<CreditCard> vList = new ArrayList<CreditCard>();
        String query = "select * from public.\"creditcard\" inner join public.\"users\" using(users_id)";
        System.out.println("CREDIT CARD INFORMATIONS");
        SQLOperation op = new SQLOperation();
        ResultSet rs1 = op.selectOperation(query);
        while (rs1.next()) {
            int creditCard_id = rs1.getInt("CreditCard_id");
            int users_id = rs1.getInt("users_id");
            String name = rs1.getString("name");
            String surname = rs1.getString("surname");
            int number = rs1.getInt("number");
            String ExpDate = rs1.getString("ExpDate");
            int securityCode = rs1.getInt("securityCode");
            CreditCard c = new CreditCard(creditCard_id, users_id, number, ExpDate, securityCode);
            vList.add(c);
            System.out.println("User name and Surname " + name + surname + " number " + c.getNumber() + " duration " + c.getExpDate() + " relasingDate " + c.getSecurityCode());
        }

    }

    public void getCategorys() throws SQLException {
        List<Category> cList = new ArrayList<Category>();
        String query = "select * from public.\"category\"";
        SQLOperation op = new SQLOperation();
        ResultSet rs = op.selectOperation(query);
        System.out.println("CATEGORY INFORMATIONS");        
        while (rs.next()) {
            int category_id = rs.getInt("category_id");
            String name = rs.getString("name");

            Category c = new Category(category_id, name);
            cList.add(c);
            System.out.println("Category Name " + c.getName());
        }
    }

    public void getSubscriptionType() throws SQLException {
        List<SubscriptionType> stList = new ArrayList<SubscriptionType>();
        String query = "select * from public.\"subscriptiontype\"";
        SQLOperation op = new SQLOperation();
        ResultSet rs = op.selectOperation(query);
        System.out.println("SUBSCRIPTIONTYPE INFORMATIONS");
        System.out.println("SubscriptionType name, maxQuality, price, maxVideo");
        while (rs.next()) {
            int subscriptionType_id = rs.getInt("subscriptionType_id");
            String name = rs.getString("name");
            String maxQuality = rs.getString("maxQuality");
            String price = rs.getString("price");
            String maxVideo = rs.getString("maxVideo");

            SubscriptionType st = new SubscriptionType(subscriptionType_id, name, maxQuality, price, maxVideo);
            stList.add(st);
            System.out.println( st.getName() + " "+maxQuality + " "+price + " " + maxVideo);
        }

    }

    public void getSubscription() throws SQLException {
        List<Subscription> sList = new ArrayList<Subscription>();
        String query = "select * from public.\"subscription\"";
        SQLOperation op = new SQLOperation();
        ResultSet rs = op.selectOperation(query);
        System.out.println("SUBSCRIPTION INFORMATIONS");        
        System.out.println("StartDate EndDate");
        while (rs.next()) {
            int subscription_id = rs.getInt("subscription_id");
            int Users_id = rs.getInt("Users_id");
            int subscriptionType_id = rs.getInt("subscriptionType_id");
            int creditCard_id = rs.getInt("creditCard_id");
            String startDate = rs.getString("startDate");
            String endDate = rs.getString("endDate");

            Subscription s = new Subscription(subscription_id, Users_id, creditCard_id, subscriptionType_id, startDate, endDate);
            sList.add(s);
            System.out.println(" "+ s.getStartDate() + " " + s.getEndDate());
        }

    }

    public void query1() throws SQLException {
        String query = ("select category.name , count(videocategory.videocategory_id) from public.\"category\" inner join public.\"videocategory\" using (category_id) group by category.name having count(videoCategory.videoCategory_id)>=0");
        SQLOperation op = new SQLOperation();
        ResultSet rs = op.selectOperation(query);
        System.out.println("Query 1");
        System.out.println("Category name and count");
        while (rs.next()) {
            String name = rs.getString("name");
            int count = rs.getInt("count");
            System.out.println(name + " " + count);
        }
        System.out.println("******************************");
    }

    public void query2() throws SQLException {
        System.out.println("Query 2");
        String query = ("select * from public.\"video\" where releaseYear > 2000");
        SQLOperation op = new SQLOperation();
        ResultSet rs = op.selectOperation(query);
        System.out.println("User name and releaseYear");
        while (rs.next()) {
            String name = rs.getString("name");
            int releaseYear = rs.getInt("releaseYear");
            System.out.println(name + " " + releaseYear);
        }
        System.out.println("******************************");

    }

    public void query3() throws SQLException {
        System.out.println("Query 3");

        String query = ("select users.name, subscriptiontype.price from public.\"users\" inner join public.\"subscription\" using (users_id) inner join public.\"subscriptiontype\" using (subscriptiontype_id)");
        SQLOperation op = new SQLOperation();
        ResultSet rs = op.selectOperation(query);
        System.out.println("User name and SubscriptionPrice");
        while (rs.next()) {
            String name = rs.getString("name");
            int price = rs.getInt("price");
            System.out.println(name + " " + price);
        }
        System.out.println("******************************");

    }

    public void query4() throws SQLException {
        System.out.println("Query 4");

        String query = ("select name,score from public.\"video\" natural join public.\"uservideo\" order by score limit 1");
        SQLOperation op = new SQLOperation();
        ResultSet rs = op.selectOperation(query);
        System.out.println("User name and videoScore");
        while (rs.next()) {
            String name = rs.getString("name");
            int score = rs.getInt("score");
            System.out.println(name + " " + score);
        }
        System.out.println("******************************");

    }

    public void query5() throws SQLException {
        System.out.println("Query 5");

        String query = ("select users.name from public.\"users\" natural join public.\"subscription\" join public.\"subscriptiontype\" using(subscriptiontype_id) where subscriptiontype.price > 15");
        SQLOperation op = new SQLOperation();
        ResultSet rs = op.selectOperation(query);
        System.out.println("User name");
        while (rs.next()) {
            String name = rs.getString("name");
            System.out.println(name);
        }
        System.out.println("******************************");

    }

    public void query6() throws SQLException {
        System.out.println("Query 6");

        String query = ("select users.name,video.name as video from public.\"users\" full outer join public.\"uservideo\" using(users_id) full outer join public.\"video\" using(video_id)");
        SQLOperation op = new SQLOperation();
        ResultSet rs = op.selectOperation(query);
        System.out.println("User name and videoName");
        while (rs.next()) {
            String name = rs.getString("name");
            String video = rs.getString("video");
            System.out.println(name + " " + video);
        }
        System.out.println("******************************");

    }

    public void query7() throws SQLException {
        System.out.println("Query 7");

        String query = ("select video.name,isListed from public.\"uservideo\" inner join public.\"video\" using(video_id)");
        SQLOperation op = new SQLOperation();
        ResultSet rs = op.selectOperation(query);
        System.out.println("Video name and isListed");
        while (rs.next()) {
            boolean t = rs.getBoolean("isListed");
            String video = rs.getString("name");
            System.out.println(video + " | " + t);
        }
        System.out.println("******************************");

    }

    public void query8() throws SQLException {
        System.out.println("Query 8");
        String query = ("select name,startdate,enddate from public.\"users\" inner join public.\"subscription\" using(users_id)");
        SQLOperation op = new SQLOperation();
        ResultSet rs = op.selectOperation(query);
        System.out.println("User name ,startDate and endDate");
        while (rs.next()) {
            String name = rs.getString("name");
            String startdate = rs.getString("startdate");
            String enddate = rs.getString("enddate");
            System.out.println(name + " " + startdate + " " + enddate);
        }
        System.out.println("******************************");

    }

    public void query9() throws SQLException {
        System.out.println("Query 9");
        String query = ("select name,surname from public.\"actors\" where name like 'A%' or surname like 'A%' ");
        SQLOperation op = new SQLOperation();
        ResultSet rs = op.selectOperation(query);
        System.out.println("Actor name and Surname");
        while (rs.next()) {
            String name = rs.getString("name");
            String surname = rs.getString("surname");
            System.out.println(name + " " + surname + " ");
        }
        System.out.println("******************************");

    }

    public void query10() throws SQLException {
        System.out.println("Query 10");
        String query = ("SELECT NAME FROM PUBLIC.\"video\" WHERE TYPE = 'movies'");
        SQLOperation op = new SQLOperation();
        ResultSet rs = op.selectOperation(query);
        System.out.println("Video name ");
        while (rs.next()) {
            String name = rs.getString("name");
            System.out.println(name + " ");
        }
        System.out.println("******************************");

    }
}
