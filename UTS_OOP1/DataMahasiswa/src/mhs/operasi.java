/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mhs;

import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class operasi {
    
    private static  List<data> listdata = new LinkedList<data>();
    public static void addData(data data){
        listdata.add(data);
    }
    public static void editData(data data, int idx){
        listdata.set(idx, data);
    }
    public static void removeData(int idx){
        listdata.remove(idx);
    }
    public static List<data> getListData(){
        return listdata;
    }
}
