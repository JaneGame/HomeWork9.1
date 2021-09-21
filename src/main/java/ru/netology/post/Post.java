package ru.netology.post;

public class Post {
    private int id;
    private int owner_id;
    private int from_id;
    private int created_by;
    private String text;
    private int date;
    private int reply_owner_id;
    private int reply_post_id;
    private int[] friends_only;
    private String postType;
    private String signerId;
    private int[] canPin;
    private int[] canDelete;
    private int[] isPinned;
    private int[] markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public int getFrom_id() {
        return from_id;
    }

    public void setFrom_id(int from_id) {
        this.from_id = from_id;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getReply_owner_id() {
        return reply_owner_id;
    }

    public void setReply_owner_id(int reply_owner_id) {
        this.reply_owner_id = reply_owner_id;
    }

    public int getReply_post_id() {
        return reply_post_id;
    }

    public void setReply_post_id(int reply_post_id) {
        this.reply_post_id = reply_post_id;
    }

    public int[] getFriends_only() {
        return friends_only;
    }

    public void setFriends_only(int[] friends_only) {
        this.friends_only = friends_only;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getSignerId() {
        return signerId;
    }

    public void setSignerId(String signerId) {
        this.signerId = signerId;
    }

    public int[] getCanPin() {
        return canPin;
    }

    public void setCanPin(int[] canPin) {
        this.canPin = canPin;
    }

    public int[] getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int[] canDelete) {
        this.canDelete = canDelete;
    }

    public int[] getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int[] isPinned) {
        this.isPinned = isPinned;
    }

    public int[] getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int[] markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}
