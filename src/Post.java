public class Post {
    long id;
    String title;
    String describle;
    String avarta;
    String mainContent;
    String writer;
    String dateofWriting;


    public void setDateofWriting(String dateofWriting) {
        this.dateofWriting = dateofWriting;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setMainContent(String mainContent) {
        this.mainContent = mainContent;
    }

    public void setAvarta(String avarta) {
        this.avarta = avarta;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescrible() {
        return describle;
    }

    public String getAvarta() {
        return avarta;
    }

    public String getMainContent() {
        return mainContent;
    }

    public String getWriter() {
        return writer;
    }

    public String getDateofWriting() {
        return dateofWriting;
    }
}
