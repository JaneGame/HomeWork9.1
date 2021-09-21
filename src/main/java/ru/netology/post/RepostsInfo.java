package ru.netology.post;

public class RepostsInfo {
    private int count;
    private int[] userReposted;

    public int getCount() {
        return count;
    }

    public RepostsInfo setCount(int count) {
        this.count = count;
        return this;
    }

    public int[] getUserReposted() {
        return userReposted;
    }

    public RepostsInfo setUserReposted(int[] userReposted) {
        this.userReposted = userReposted;
        return this;
    }
}
