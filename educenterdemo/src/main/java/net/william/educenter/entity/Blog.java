package net.william.educenter.entity;

public class Blog {
    private Integer blogId;

    private String blogTime;

    private String blogTitle;

    private String blogContent;

    private String blogWriter;

    private String blogImg;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogTime() {
        return blogTime;
    }

    public void setBlogTime(String blogTime) {
        this.blogTime = blogTime == null ? null : blogTime.trim();
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }

    public String getBlogWriter() {
        return blogWriter;
    }

    public void setBlogWriter(String blogWriter) {
        this.blogWriter = blogWriter == null ? null : blogWriter.trim();
    }

    public String getBlogImg() {
        return blogImg;
    }

    public void setBlogImg(String blogImg) {
        this.blogImg = blogImg == null ? null : blogImg.trim();
    }
}