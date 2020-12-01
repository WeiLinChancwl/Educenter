package net.william.educenter.entity;

public class School {
    private Integer schId;

    private String schName;

    private String schChairman;

    private String schEmail;

    private String schTel;

    private String schLocation;

    private String schDesc;

    public Integer getSchId() {
        return schId;
    }

    public void setSchId(Integer schId) {
        this.schId = schId;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName == null ? null : schName.trim();
    }

    public String getSchChairman() {
        return schChairman;
    }

    public void setSchChairman(String schChairman) {
        this.schChairman = schChairman == null ? null : schChairman.trim();
    }

    public String getSchEmail() {
        return schEmail;
    }

    public void setSchEmail(String schEmail) {
        this.schEmail = schEmail == null ? null : schEmail.trim();
    }

    public String getSchTel() {
        return schTel;
    }

    public void setSchTel(String schTel) {
        this.schTel = schTel == null ? null : schTel.trim();
    }

    public String getSchLocation() {
        return schLocation;
    }

    public void setSchLocation(String schLocation) {
        this.schLocation = schLocation == null ? null : schLocation.trim();
    }

    public String getSchDesc() {
        return schDesc;
    }

    public void setSchDesc(String schDesc) {
        this.schDesc = schDesc == null ? null : schDesc.trim();
    }
}