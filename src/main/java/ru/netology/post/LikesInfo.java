package ru.netology.post;

public class LikesInfo {
    private int count;
    private int[] userLike;
    private int[] canLike;
    private int[] canPiblish;

    public int getCount() {
        return count;
    }

    public LikesInfo setCount(int count) {
        this.count = count;
        return this;
    }

    public int[] getUserLike() {
        return userLike;
    }

    public LikesInfo setUserLike(int[] userLike) {
        this.userLike = userLike;
        return this;
    }

    public int[] getCanLike() {
        return canLike;
    }

    public LikesInfo setCanLike(int[] canLike) {
        this.canLike = canLike;
        return this;
    }

    public int[] getCanPiblish() {
        return canPiblish;
    }

    public LikesInfo setCanPiblish(int[] canPiblish) {
        this.canPiblish = canPiblish;
        return this;
    }
}
