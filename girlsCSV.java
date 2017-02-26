/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pplassginment;

import java.util.*;
import java.io.*;

/**
 *
 * @author Dark_ni8
 */
public class girlsCSV
{
    String name;
    double att_level;
    double m_budget;
    double int_level;
    boolean isCommitted;
    int typ;
    
    /**
     *
     * @return
     * @throws FileNotFoundException
     */
    public ArrayList<girls> generate()throws FileNotFoundException, IOException
    //public ArrayList<boys> generate() throws IOException
    {
        PrintWriter pw = new PrintWriter(new File("FinalGirls.csv"));
        StringBuilder sb = new StringBuilder();
        ArrayList<girls> G = new ArrayList<girls>(80);
        for(int i=0;i<100;i++)
        {
            name="GirlNo"+(i);
            att_level=10+(Math.random()*21);
            m_budget=100+(Math.random()*900);
            int_level=15+(Math.random()*15);
            typ=(int)1+(int)(Math.random()*3);
            isCommitted=false;
            sb.append(name);
            sb.append(',');
            sb.append(att_level);
            sb.append(',');
            sb.append(m_budget);
            sb.append(',');
            sb.append(int_level);
            sb.append(',');
            sb.append(isCommitted);
            sb.append(',');
            sb.append(typ);
            sb.append('\n');
            girls g = new girls(name,att_level,m_budget,int_level,typ,isCommitted);
            G.add(g);
        }
        pw.write(sb.toString());
        pw.close();
        return G;
    }
}
