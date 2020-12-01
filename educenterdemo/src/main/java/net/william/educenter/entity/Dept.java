package net.william.educenter.entity;

public class Dept {
    private Integer dId;

    private String dName;

    private String dChairman;

    private String dEmail;

    private String dDesc;

    private Integer schId;

    private String dTel;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public String getdChairman() {
        return dChairman;
    }

    public void setdChairman(String dChairman) {
        this.dChairman = dChairman == null ? null : dChairman.trim();
    }

    public String getdEmail() {
        return dEmail;
    }

    public void setdEmail(String dEmail) {
        this.dEmail = dEmail == null ? null : dEmail.trim();
    }

    public String getdDesc() {
        return dDesc;
    }

    public void setdDesc(String dDesc) {
        this.dDesc = dDesc == null ? null : dDesc.trim();
    }

    public Integer getSchId() {
        return schId;
    }

    public void setSchId(Integer schId) {
        this.schId = schId;
    }

    public String getdTel() {
        return dTel;
    }

    public void setdTel(String dTel) {
        this.dTel = dTel == null ? null : dTel.trim();
    }
}