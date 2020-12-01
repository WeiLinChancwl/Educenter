package net.william.educenter.entity;

public class New {
    private Integer newId;

    private String newTitle;

    private String newTime;

    private String newFrom;

    private String newWriter;

    private String newImg;

    private String newType;

    private String newContent;

    private String newCn;

    private String newEn;

    private String newTranslator;

    public Integer getNewId() {
        return newId;
    }

    public void setNewId(Integer newId) {
        this.newId = newId;
    }

    public String getNewTitle() {
        return newTitle;
    }

    public void setNewTitle(String newTitle) {
        this.newTitle = newTitle == null ? null : newTitle.trim();
    }

    public String getNewTime() {
        return newTime;
    }

    public void setNewTime(String newTime) {
        this.newTime = newTime == null ? null : newTime.trim();
    }

    public String getNewFrom() {
        return newFrom;
    }

    public void setNewFrom(String newFrom) {
        this.newFrom = newFrom == null ? null : newFrom.trim();
    }

    public String getNewWriter() {
        return newWriter;
    }

    public void setNewWriter(String newWriter) {
        this.newWriter = newWriter == null ? null : newWriter.trim();
    }

    public String getNewImg() {
        return newImg;
    }

    public void setNewImg(String newImg) {
        this.newImg = newImg == null ? null : newImg.trim();
    }

    public String getNewType() {
        return newType;
    }

    public void setNewType(String newType) {
        this.newType = newType == null ? null : newType.trim();
    }

    public String getNewContent() {
        return newContent;
    }

    public void setNewContent(String newContent) {
        this.newContent = newContent == null ? null : newContent.trim();
    }

    public String getNewCn() {
        return newCn;
    }

    public void setNewCn(String newCn) {
        this.newCn = newCn == null ? null : newCn.trim();
    }

    public String getNewEn() {
        return newEn;
    }

    public void setNewEn(String newEn) {
        this.newEn = newEn == null ? null : newEn.trim();
    }

    public String getNewTranslator() {
        return newTranslator;
    }

    public void setNewTranslator(String newTranslator) {
        this.newTranslator = newTranslator == null ? null : newTranslator.trim();
    }
}