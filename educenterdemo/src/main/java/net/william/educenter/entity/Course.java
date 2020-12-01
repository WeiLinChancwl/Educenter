package net.william.educenter.entity;

public class Course {
    private Integer cId;

    private String cName;

    private Float cCredit;

    private Integer cClass;

    private String cDesc;

    private String cPlan;

    private String cContent;

    private String cTest;

    private String cImg;

    private String cDate;

    private String cType;

    private String tName;

    private Integer tId;

    private String schName;

    private String mName;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public Float getcCredit() {
        return cCredit;
    }

    public void setcCredit(Float cCredit) {
        this.cCredit = cCredit;
    }

    public Integer getcClass() {
        return cClass;
    }

    public void setcClass(Integer cClass) {
        this.cClass = cClass;
    }

    public String getcDesc() {
        return cDesc;
    }

    public void setcDesc(String cDesc) {
        this.cDesc = cDesc == null ? null : cDesc.trim();
    }

    public String getcPlan() {
        return cPlan;
    }

    public void setcPlan(String cPlan) {
        this.cPlan = cPlan == null ? null : cPlan.trim();
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent == null ? null : cContent.trim();
    }

    public String getcTest() {
        return cTest;
    }

    public void setcTest(String cTest) {
        this.cTest = cTest == null ? null : cTest.trim();
    }

    public String getcImg() {
        return cImg;
    }

    public void setcImg(String cImg) {
        this.cImg = cImg == null ? null : cImg.trim();
    }

    public String getcDate() {
        return cDate;
    }

    public void setcDate(String cDate) {
        this.cDate = cDate == null ? null : cDate.trim();
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName == null ? null : schName.trim();
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }
}