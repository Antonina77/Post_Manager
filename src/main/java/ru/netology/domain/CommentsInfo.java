package ru.netology.domain;

public class CommentsInfo {
    private int count; //число комментов
    private String next_commentsInfo; // следующий коммент
    private String firstNewCommentsInfo; //показать первый коммент
    private boolean canComment; //может ли пользователь откомментировать запись
    private boolean likeComment; //может ли пользователь лайкнуть комментарий

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext_commentsInfo() {
        return next_commentsInfo;
    }

    public void setNext_commentsInfo(String next_commentsInfo) {
        this.next_commentsInfo = next_commentsInfo;
    }

    public String getFirstNewCommentsInfo() {
        return firstNewCommentsInfo;
    }

    public void setFirstNewCommentsInfo(String firstNewCommentsInfo) {
        this.firstNewCommentsInfo = firstNewCommentsInfo;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isLikeComment() {
        return likeComment;
    }

    public void setLikeComment(boolean likeComment) {
        this.likeComment = likeComment;
    }
}
