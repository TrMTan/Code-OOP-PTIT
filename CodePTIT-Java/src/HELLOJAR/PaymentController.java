/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HELLOJAR;

import java.util.ArrayList;
import java.util.Scanner;
import vn.edu.ptit.Invoice;
import vn.edu.ptit.Rule;
import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;

/**
 *
 * @author tan
 */
public class PaymentController {
    private Invoice invoice;
    private Rule rule;
    private Student student;
    private Subject subject;

    public PaymentController() {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ht = sc.nextLine();
        int soMH = Integer.parseInt(sc.nextLine());
        String maMH;
        String tenMH;
        int sTC;
        student = new Student(ma, ht);
        double sum = 0;
        ArrayList<Subject> a = new ArrayList<>();
        while(soMH-->0){
            maMH = sc.nextLine();
            tenMH = sc.nextLine();
            sTC = Integer.parseInt(sc.nextLine());
            a.add(new Subject(tenMH, maMH, sTC));
        }
        String sQD = sc.nextLine();
        String tenQD = sc.nextLine();
        double donGia = Double.parseDouble(sc.nextLine());
        for(Subject i : a){
            sum += donGia * i.getCredit();
        }
        rule = new Rule(sQD, tenQD, donGia);
        invoice = new Invoice(rule);
        invoice.setAlSubject(a);
        invoice.setAmount(sum);
        invoice.setSt(student);
    }
    
    public Invoice getInvoice(){
        return invoice;
    }
}
