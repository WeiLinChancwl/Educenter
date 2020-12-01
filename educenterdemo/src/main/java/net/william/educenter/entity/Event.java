package net.william.educenter.entity;

public class Event {
    private Integer eventId;

    private Integer eventFee;

    private String eventWriter;

    private String eventDate;

    private String eventTime;

    private String eventLocation;

    private String eventImg;

    private String eventTitle;

    private String eventContent;

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getEventFee() {
        return eventFee;
    }

    public void setEventFee(Integer eventFee) {
        this.eventFee = eventFee;
    }

    public String getEventWriter() {
        return eventWriter;
    }

    public void setEventWriter(String eventWriter) {
        this.eventWriter = eventWriter == null ? null : eventWriter.trim();
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate == null ? null : eventDate.trim();
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime == null ? null : eventTime.trim();
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation == null ? null : eventLocation.trim();
    }

    public String getEventImg() {
        return eventImg;
    }

    public void setEventImg(String eventImg) {
        this.eventImg = eventImg == null ? null : eventImg.trim();
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle == null ? null : eventTitle.trim();
    }

    public String getEventContent() {
        return eventContent;
    }

    public void setEventContent(String eventContent) {
        this.eventContent = eventContent == null ? null : eventContent.trim();
    }
}