package net.william.educenter.entity;

public class Major {
    private Integer mId;

    private Integer dId;

    private String mName;

    private String mAssistant;

    private String mTel;

    private String mDesc;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmAssistant() {
        return mAssistant;
    }

    public void setmAssistant(String mAssistant) {
        this.mAssistant = mAssistant == null ? null : mAssistant.trim();
    }

    public String getmTel() {
        return mTel;
    }

    public void setmTel(String mTel) {
        this.mTel = mTel == null ? null : mTel.trim();
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc == null ? null : mDesc.trim();
    }
}