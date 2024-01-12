/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class Phong implements Serializable{
    private int ma;
    private String kieup;
    private int tient, slp;
    private static int sma = 100;

    public Phong() {
    }

    public Phong(int ma, String kieup, int tient, int slp) {
        this.ma = ma;
        this.kieup = kieup;
        this.tient = tient;
        this.slp = slp;
    }

    public Phong(String kieup, int tient, int slp) {
        this.ma = sma++;
        this.kieup = kieup;
        this.tient = tient;
        this.slp = slp;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getKieup() {
        return kieup;
    }

    public void setKieup(String kieup) {
        this.kieup = kieup;
    }

    public int getTient() {
        return tient;
    }

    public void setTient(int tient) {
        this.tient = tient;
    }

    public int getSlp() {
        return slp;
    }

    public void setSlp(int slp) {
        this.slp = slp;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Phong.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            ma, kieup, tient, slp
        };
    }
    
}
