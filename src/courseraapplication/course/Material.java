
package courseraapplication.course;

import java.nio.file.Path;


public class Material {
    private String title;
    private String description;
    private Path video;
    private String transcript;
    public static final MaterialTitleComaparator materialTitleComaparator = new MaterialTitleComaparator();
    public Material(String title, String description, Path video, String transcript) {
        this.title = title;
        this.description = description;
        this.video = video;
        this.transcript = transcript;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Path getVideo() {
        return video;
    }

    public void setVideo(Path video) {
        this.video = video;
    }

    public String getTranscript() {
        return transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }
    
  
    @Override
    public String toString() {
        return "Material{" + "title=" + title + ", description=" + description + ", video=" + video.toString() + ", transcript=" + transcript + '}';
    }

    
  
}
