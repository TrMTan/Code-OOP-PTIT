/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    public static <T> List<T> doc(String fname){ // doc file
        List<T> list = new ArrayList<>();
        try{
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(fname));
            list = (List<T>)o.readObject();
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return list;
    }
    
    public static <T> void ghi(String fname, List<T> arr){ // doc file
        try{
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fname));
            o.writeObject(arr);
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
