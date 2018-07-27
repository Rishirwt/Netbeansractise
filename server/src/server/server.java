package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class server {

    
    public static void main(String[] args) {
        
        try
        {
            ServerSocket ser = new ServerSocket(9999);
            Socket sock = ser.accept();
            
            BufferedReader ed = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            String tmp = ed.readLine();
             System.out.print("I Recieved :"+tmp);
            
             PrintStream pr = new PrintStream(sock.getOutputStream());
             String str = "Yup I got it !!";
             pr.println(str);
             
        }
      catch(IOException ex){}
    }
    
}