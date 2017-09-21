import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	String receb;
	String [] split;
	BufferedReader in;
	Socket clientSocket;
	int result;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	
	public class Thread2 extends Thread {{		
		 try {
		     
			 BufferedReader in = new BufferedReader(
		     new InputStreamReader( clientSocket.getInputStream()));
		     receb = in.readLine();
		     split = receb.split(" ");
		     }catch (IOException e1) {
		     e1.printStackTrace();
		     }
		    
		    if(split[0].matches("ADD")){
		     
		    try {
		      PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),
		      true);
		      int nr1 = Integer.valueOf(split[1]);
		      int nr2 = Integer.valueOf(split[2]);  
		      result = nr1 + nr2;
		      out.println(result);
		      }catch (IOException e) {
		      e.printStackTrace();
		      }

		   }else if(split[0].matches("SUB")){
		    try {
		    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),
		    true);
		    int nr1 = Integer.valueOf(split[1]);
		    int nr2 = Integer.valueOf(split[2]);  
		    result = nr1 - nr2;
		    out.println(result);
		    }catch (IOException e) {
		    e.printStackTrace();
		    }
		    }else if(split[0].matches("MUL")){
		    	
		     try {
		      PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),
		      true);
		      int nr1 = Integer.valueOf(split[1]);
		      int nr2 = Integer.valueOf(split[2]);  
		      result = nr1 * nr2;
		      out.println(result);
		     }catch (IOException e) {
		      e.printStackTrace();
		     }
		    }else if(split[0].matches("DIV")){
		    	
		     try {
		      PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),
		      true);
		      int nr1 = Integer.valueOf(split[1]);
		      int nr2 = Integer.valueOf(split[2]);  
		      result = nr1 / nr2;
		      out.println(result);
		     }catch (IOException e) {
		      e.printStackTrace();
		     }
		    }
		    
		}
	}
}

