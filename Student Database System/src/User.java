/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author madhur
 */
public class User {
    
    private int rollno;
    private String name;
    private String FName;
    private long ConNo;
    private String Email;
    public static int userlog;
    public User(){
        this.userlog=getUserLog();
    }
    public User (int rollno,String name,String FName,long ConNo,String Email)
    {
        this.rollno=rollno;
        this.name=name;
        this.FName=FName;
        this.ConNo=ConNo;
        this.Email=Email;
        
    }
    public User(int a)
    {
        this.userlog=a;
        
    }
    
    public int getUserLog(){
        return userlog;
    }
    
    public int getRoll()
    {
        return rollno;
    }
    public String getName()
    {
        return name;
    }
    public String getFname()
    {
        return FName;
    }
    public long getCon()
    {
        return ConNo;
    }
    public String getemail()
    {
        return Email;
    }
    
    public static void main(String[] args){
        
        
    }
    
    
}
