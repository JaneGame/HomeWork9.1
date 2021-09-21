package ru.netology;

public class Post {
    private String id;
    private String text;
    private String urlImage;
    private String date;
    private int heart;
    private int comment;
    private int repost;
    private boolean right;

    public void getVision(String id, String text, String urlImage, String date, int heart, int comment, int repost) {
        return;
    }

    public void setIdText() {
        this.id = id;
    }

    public void setVisionText() {
        this.text = text;
    }

    public void urlImageVision() {
        this.urlImage = urlImage;
    }

    public void setDateText() {
        this.date = date;
    }

    public void setCommentText() {
        this.comment = comment;
    }

    public void setHeartText() {
        this.heart = heart;
    }

    public void setRepostText() {
        this.repost = repost;
    }

}
