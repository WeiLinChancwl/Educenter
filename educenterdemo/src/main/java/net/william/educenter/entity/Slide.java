package net.william.educenter.entity;

public class Slide {
    private Integer slideId;

    private String slideImg;

    private String slideTitle;

    private String slideContent;

    public Integer getSlideId() {
        return slideId;
    }

    public void setSlideId(Integer slideId) {
        this.slideId = slideId;
    }

    public String getSlideImg() {
        return slideImg;
    }

    public void setSlideImg(String slideImg) {
        this.slideImg = slideImg == null ? null : slideImg.trim();
    }

    public String getSlideTitle() {
        return slideTitle;
    }

    public void setSlideTitle(String slideTitle) {
        this.slideTitle = slideTitle == null ? null : slideTitle.trim();
    }

    public String getSlideContent() {
        return slideContent;
    }

    public void setSlideContent(String slideContent) {
        this.slideContent = slideContent == null ? null : slideContent.trim();
    }
}