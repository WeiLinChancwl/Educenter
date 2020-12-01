package net.william.educenter.entity;

public class Organization {
    private Integer oId;

    private String oAccount;

    private String oPsw;

    private String oName;

    private String oEmail;

    private String oTel;

    private String oTitle;

    private String oDesc;

    private String oLocation;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public String getoAccount() {
        return oAccount;
    }

    public void setoAccount(String oAccount) {
        this.oAccount = oAccount == null ? null : oAccount.trim();
    }

    public String getoPsw() {
        return oPsw;
    }

    public void setoPsw(String oPsw) {
        this.oPsw = oPsw == null ? null : oPsw.trim();
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName == null ? null : oName.trim();
    }

    public String getoEmail() {
        return oEmail;
    }

    public void setoEmail(String oEmail) {
        this.oEmail = oEmail == null ? null : oEmail.trim();
    }

    public String getoTel() {
        return oTel;
    }

    public void setoTel(String oTel) {
        this.oTel = oTel == null ? null : oTel.trim();
    }

    public String getoTitle() {
        return oTitle;
    }

    public void setoTitle(String oTitle) {
        this.oTitle = oTitle == null ? null : oTitle.trim();
    }

    public String getoDesc() {
        return oDesc;
    }

    public void setoDesc(String oDesc) {
        this.oDesc = oDesc == null ? null : oDesc.trim();
    }

    public String getoLocation() {
        return oLocation;
    }

    public void setoLocation(String oLocation) {
        this.oLocation = oLocation == null ? null : oLocation.trim();
    }
}