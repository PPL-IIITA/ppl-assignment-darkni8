/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pplassginment;

import java.io.*;
import java.util.*;

/**
 *
 * @author Dark_ni8
 */
public class boysCSV 
{
    String name;// naam ladke ka.
    double att_level;//attractiveness 
    double int_level;//his IQ
    double budget;//his bidget
    //bool isCommitted;
    double min_att_lev;
    boolean isCommitted;//f=comm,t=not_comm
    int typ;
    
    /**
     *
     * @return
     * @throws FileNotFoundException
     */
    public ArrayList<boys> generate()throws FileNotFoundException, IOException
    //public ArrayList<boys> generate() throws IOException
    {
        PrintWriter pw = new PrintWriter(new File("FinalBoys.csv"));
        StringBuilder sb = new StringBuilder();
        ArrayList<boys> B = new ArrayList<boys>(100);
        for(int i=0;i<100;i++)
        {
            name="BoyNo"+(i);
            att_level=10+(Math.random()*19);
            budget=100+(Math.random()*1000);
            int_level=15+(Math.random()*25);
            min_att_lev=2+(Math.random()*10);
            typ=(int)1+(int)(Math.random()*3);
            isCommitted=false;
            sb.append(name);
            sb.append(',');
            sb.append(att_level);
            sb.append(',');
            sb.append(budget);
            sb.append(',');
            sb.append(int_level);
            sb.append(',');
            sb.append(min_att_lev);
            sb.append(',');
            sb.append(isCommitted);
            sb.append(',');
            sb.append(typ);
            sb.append("\n");
            //sb.append(',');
            boys b = new boys(name,att_level,budget,int_level,min_att_lev,typ,isCommitted);
            B.add(b);
        }
        pw.write(sb.toString());
        pw.close();
        return B;
    }
}