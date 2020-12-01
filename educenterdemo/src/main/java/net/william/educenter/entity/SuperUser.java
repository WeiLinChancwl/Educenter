package net.william.educenter.entity;

public class SuperUser {
    private Integer supId;

    private String supAccount;

    private String supPsw;

    private String supName;

    private String supEmail;

    private String supTel;

    private String supSex;

    private String supBirthday;

    private Integer supAuthority;

    public Integer getSupId() {
        return supId;
    }

    public void setSupId(Integer supId) {
        this.supId = supId;
    }

    public String getSupAccount() {
        return supAccount;
    }

    public void setSupAccount(String supAccount) {
        this.supAccount = supAccount == null ? null : supAccount.trim();
    }

    public String getSupPsw() {
        return supPsw;
    }

    public void setSupPsw(String supPsw) {
        this.supPsw = supPsw == null ? null : supPsw.trim();
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName == null ? null : supName.trim();
    }

    public String getSupEmail() {
        return supEmail;
    }

    public void setSupEmail(String supEmail) {
        this.supEmail = supEmail == null ? null : supEmail.trim();
    }

    public String getSupTel() {
        return supTel;
    }

    public void setSupTel(String supTel) {
        this.supTel = supTel == null ? null : supTel.trim();
    }

    public String getSupSex() {
        return supSex;
    }

    public void setSupSex(String supSex) {
        this.supSex = supSex == null ? null : supSex.trim();
    }

    public String getSupBirthday() {
        return supBirthday;
    }

    public void setSupBirthday(String supBirthday) {
        this.supBirthday = supBirthday == null ? null : supBirthday.trim();
    }

    public Integer getSupAuthority() {
        return supAuthority;
    }

    public void setSupAuthority(Integer supAuthority) {
        this.supAuthority = supAuthority;
    }
}