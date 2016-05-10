package com.company;

import java.math.BigDecimal;
import java.util.Enumeration;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BigDecimal montant;
        montant = new BigDecimal(0);
        System.out.println("Bonjour pour voir ce que cela donne "+ montant);
        System.out.println("voir ce que cela donne avant");

        StringBuffer texteA = new StringBuffer("je m'appelle cleve");
        String inversetexteA = texteA .reverse().toString();
        //char tt;
        for (int i=0; i< inversetexteA.length();i++) {
                 char tt = inversetexteA.charAt(i);
            System.out.println("------" + tt);
        }
        System.out.println();

        Hashtable ht = new Hashtable();
        ht.put(1, "printemps");
        ht.put(10, "été");
        ht.put(12, "automne");
        ht.put(45, "hiver");
        ht.put(44, "hiver");
        ht.put(457, "hiver");
        ht.put(454, "hiver");
        ht.put(4354, "hiver");

        Enumeration e = ht.elements();

        while(e.hasMoreElements())
            System.out.println(e.nextElement());

    }


}