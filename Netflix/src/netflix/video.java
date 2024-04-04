
package netflix;

public class video {

    public video(int video_id, String name, String type, String duration, String releaseYear, String Lang, String Url) {
        this.video_id = video_id;
        this.name = name;
        this.type = type;
        this.duration = duration;
        this.releaseYear = releaseYear;
        this.Lang = Lang;
        this.Url = Url;
    }
    
   private int video_id;
   private String name;
   private String type;
   private String duration;
   private String releaseYear;
   private String Lang;
   private String Url;

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public video() {
    }
   
    public int getVideo_id() {
        return video_id;
    }

    public void setVideo_id(int video_id) {
        this.video_id = video_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getLang() {
        return Lang;
    }

    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }
           
}
