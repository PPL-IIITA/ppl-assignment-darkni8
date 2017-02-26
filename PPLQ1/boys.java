/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pplassginment;

/**
 *
 * @author Dark_ni8
 */
public class boys
{
    String name;// naam ladke ka.
    double att_level;//attractiveness 
    double int_level;//his IQ
    double budget;//his bidget
    //bool isCommitted;
    double min_att_lev;
    boolean isCommitted;//f=comm,t=not_comm
    int typ;
    
    public boys(String n,double a,double b,double i,double mal,int t,boolean ic)
    {
        name=n;
        att_level=a;
        int_level=i;
        budget=b;
        isCommitted=ic;//ic is always false.
        min_att_lev=mal;
        typ=t;
    }
    
    public String retName()
    {
        return name;
    }
    
    public void setName(String n)
    {
        this.name=n;
    }
    
    public double retAtt_level()
    {
        return att_level;
    }
    
    public void setAtt_level(double a)
    {
        att_level=a;
    }
    
    public double retInt_level()
    {
        return int_level;
    }
    
    public void setInt_level(double i)
    {
        int_level=i;
    }
    
    public double retBudget()
    {
        return budget;
    }
    
    public void setBudget(double b)
    {
        budget=b;
    }
    
    public double retMinAttLev()
    {
        return min_att_lev;
    }
    
    public void MinAttLev(double mal)
    {
        min_att_lev=mal;
    }
    
    public boolean isComm()
    {
        return isCommitted;
    }
    
    public void setComm(boolean ic)
    {
        isCommitted=ic;
    }
    
    public int retType()
    {
        return typ;
    }
  
}
