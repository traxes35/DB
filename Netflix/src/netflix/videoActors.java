
package netflix;

public class videoActors {
    private int videoActors_id;
    private int video_id;
    private int actor_id;

    public videoActors(int videoActors_id, int video_id, int actor_id) {
        this.videoActors_id = videoActors_id;
        this.video_id = video_id;
        this.actor_id = actor_id;
    }

    public int getVideoActors_id() {
        return videoActors_id;
    }

    public void setVideoActors_id(int videoActors_id) {
        this.videoActors_id = videoActors_id;
    }

    public int getVideo_id() {
        return video_id;
    }

    public void setVideo_id(int video_id) {
        this.video_id = video_id;
    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }
    
}
