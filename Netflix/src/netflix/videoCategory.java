
package netflix;

public class videoCategory {
    private int videoCategory_id;
    private int video_id;
    private int Category_id;

    public videoCategory(int videoCategory_id, int video_id, int Category_id) {
        this.videoCategory_id = videoCategory_id;
        this.video_id = video_id;
        this.Category_id = Category_id;
    }

    public int getVideoCategory_id() {
        return videoCategory_id;
    }

    public void setVideoCategory_id(int videoCategory_id) {
        this.videoCategory_id = videoCategory_id;
    }

    public int getVideo_id() {
        return video_id;
    }

    public void setVideo_id(int video_id) {
        this.video_id = video_id;
    }

    public int getCategory_id() {
        return Category_id;
    }

    public void setCategory_id(int Category_id) {
        this.Category_id = Category_id;
    }

    
}
