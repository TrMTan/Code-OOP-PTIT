/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04007_KhaiBaoNhanVien;

/**
 *
 * @author tan
 */
public class NhanVien {
    private String mvn, ht, gt, ns, dc, mst, hd;

    public NhanVien(String mvn, String ht, String gt, String ns, String dc, String mst, String hd) {
        this.mvn = "00001";
        this.ht = ht;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        this.hd = hd;
    }

    public String getMvn() {
        return mvn;
    }

    public void setMvn(String mvn) {
        this.mvn = mvn;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getMst() {
        return mst;
    }

    public void setMst(String mst) {
        this.mst = mst;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return mvn + " " + ht + " " + gt + " " + ns + " " + dc + " " + mst + " " + hd;
    }
}
