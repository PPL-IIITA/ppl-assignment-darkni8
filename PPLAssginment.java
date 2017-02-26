/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pplassginment;

import java.io.*;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/**
 *
 * @author Dark_ni8
 */
public class PPLAssginment {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args)throws FileNotFoundException, IOException
    {
        Logger logger = Logger.getLogger("MyLog");  
        FileHandler fh;
        try
        {  

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("LOG.log");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);
        }
        catch (SecurityException e)
        {  
            e.printStackTrace();  
        }
        catch (IOException e)
        {  
            e.printStackTrace();  
        }   
        ArrayList<boys> Arr_Boys = new ArrayList<boys>(100);
        ArrayList<girls> Arr_Girls = new ArrayList<girls>(80);
        boysCSV obj1=new boysCSV();
        Arr_Boys=obj1.generate();
        girlsCSV obj2=new girlsCSV();
        Arr_Girls=obj2.generate();
        for(boys i: Arr_Boys)
        {
           for(girls j: Arr_Girls)
           {
               if(i.retBudget() >= j.retMaintainanceBudget() && j.retAtt_level() > i.retMinAttLev() && i.isComm()==false && j.isComm()==false)
               {
                   logger.info(i.retName() +" Is Committed With "+j.retName());
                   i.setComm(true);
                   j.setComm(true);
               }
           }
        }
    }
    
}
