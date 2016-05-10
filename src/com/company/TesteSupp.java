package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * Created by cleve.kengue on 10/05/2016.
 */
public class TesteSupp implements serialized{
    public static void main(String [] argv){
        ArrayList maList = new ArrayList();
        maList.add("1");
        maList.add("2");
        maList.add("3");
        maList.add("4");
        maList.add("5");
        maList.add("6");

        boolean hasRemoved = false;
        Iterator it = maList.iterator();
        Object element = null;
        while(it.hasNext()){
            element = it.next();
            if(hasRemoved){
                hasRemoved = false;
            }else{
                it.remove();
                hasRemoved = true;
                System.out.println(element);
            }

        }


    }
}
