/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import static oracle.net.aso.b.c;

/**
 *
 * @author brajesh kumar
 */
public class NewClass {
  
    
    public void A(String s1,double p3,int p1,String s5)
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
       
              Connection c= DriverManager.getConnection("jdbc:oracle:thin:@Brajesh:1521:XE","System","9956209112");
              //Statement stmt=c.createStatement();
                  Statement stmt=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
              int i=stmt.executeUpdate("insert into Account values('"+s1+"','"+p3+"','"+p1+"','"+s5+"')");
               
              }
        catch(Exception e)
        {
            
        }
    }
}
    class B 
    {
          String na,t;
          int pa;
    public void c1(String s1, int p,String s3)
    {
        
        try
        {
            
            
             Class.forName("oracle.jdbc.driver.OracleDriver");
       
              Connection c= DriverManager.getConnection("jdbc:oracle:thin:@Brajesh:1521:XE","System","9956209112");
        Statement stmt=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
         ResultSet rs=stmt.executeQuery("select name,password,post from Account");
         
         int count=0;
         while(rs.next())
         {
             count++;
         }
         String na[]=new String[count];
         int pa[]=new int [count];
         String t[]=new String[count];
         
         
         for(int j=0;j<=count;j++)
         {
             na[j]=rs.getString(1);
             pa[j]=rs.getInt(3);
             t[j]=rs.getString(4);
             if(s1.equalsIgnoreCase(na[j])&&pa[j]==p&&t[j].equalsIgnoreCase(s3))
             {
              new Boyshostel().setVisible(true);
             }
             else
             {
               
             }
         }
         
         
             
         }
        
        catch(Exception e)
        {
            
        }   
    }    
public void gate(String n,String b,String t,String y,double m,int d,int mn,int dy,int it,String a,String sx)
{
    try
    {
      
        
         Class.forName("oracle.jdbc.driver.OracleDriver");
       
              Connection c= DriverManager.getConnection("jdbc:oracle:thin:@Brajesh:1521:XE","System","9956209112");
              Statement stmt=c.createStatement();
               int i=stmt.executeUpdate("insert into Gate (n,b,t,y,m,d,mn,dy,it,a,sex) values('"+n+"','"+b+"','"+t+"','"+y+"','"+m+"','"+d+"','"+mn+"','"+dy+"','"+it+"','"+a+"','"+sx+"')");
    }
    catch(Exception e)
    {
        
    }
   
}
public void update(String s1,double no,int ot,String s4)
{
    try
    {
         Class.forName("oracle.jdbc.driver.OracleDriver");
       
              Connection c= DriverManager.getConnection("jdbc:oracle:thin:@Brajesh:1521:XE","System","9956209112");
              Statement stmt=c.createStatement();
              int i=stmt.executeUpdate("insert into entry(name,mno,ot,p)values('"+ s1+"','"+ no+"','"+ot+"','"+s4+"')");
             
              
    }
    catch(Exception e)
    {
         
    
    }
}
public void Login(String s1)
{
    
}
    }