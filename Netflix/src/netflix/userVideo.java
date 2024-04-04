
package netflix;

public class userVideo {
    private int userVideo_id;
    private int video_id;
    private int user_id;
    private boolean isListed;
    private int score;

    public userVideo(int userVideo_id, int video_id, int user_id, boolean isListed, int score) {
        this.userVideo_id = userVideo_id;
        this.video_id = video_id;
        this.user_id = user_id;
        this.isListed = isListed;
        this.score = score;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public boolean isIsListed() {
        return isListed;
    }

    public void setIsListed(boolean isListed) {
        this.isListed = isListed;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getUserVideo_id() {
        return userVideo_id;
    }

    public void setUserVideo_id(int userVideo_id) {
        this.userVideo_id = userVideo_id;
    }

    public int getVideo_id() {
        return video_id;
    }

    public void setVideo_id(int video_id) {
        this.video_id = video_id;
    }

    
}
