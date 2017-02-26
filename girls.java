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
public class girls
{
    String name;
    double att_level;
    double m_budget;
    double int_level;
    boolean isCommitted;
    int typ;
    
    public girls(String n,double a,double m,double i,int t,boolean ic)
    {
        name=n;
        att_level=a;
        m_budget=m;
        int_level=i;
        isCommitted=ic;
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
    
    public double retMaintainanceBudget()
    {
        return m_budget;
    }
    
    public void setMaintainanceBudget(double b)
    {
        m_budget=b;
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
