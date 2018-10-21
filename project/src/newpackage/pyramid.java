
package newpackage;
import java.util.Scanner;
public class pyramid {
    String name;
    int rollno;
    pyramid()
    {
        name="xyz";
        rollno=0;
    }
    pyramid(String n,int r)
    {
        this.name=n;
        this.rollno=r;
    }
    
    void show()
    {
        System.out.println("Name : "+this.name);
        System.out.println("Roll No. : "+this.rollno);
    }
     public static void main(String[] args) {
         pyramid p=new pyramid();
         p.show();
         pyramid p1=new pyramid("Riya",63);
         p1.show();

    	
    }

    
}
