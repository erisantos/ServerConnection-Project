import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	Scanner scan = new Scanner(System.in);
	String enviar;
	String res;
	int resultado;
	
	public Cliente(){
		menu();
	}
	
	private void menu(){
		int opcao = 0;
		
		while(true){
			System.out.println("1... Adicionar");
			System.out.println("2... Subtrair");
			System.out.println("3... Multiplicar");
			System.out.println("4... Dividir");
			System.out.println("5... Sair");
			opcao = scan.nextInt(); scan.nextLine();
			
			switch(opcao){
			case 1:
				adicionar();
				break;
			case 2:
				subtrair();
				break;
			case 3:
				multiplicar();
				break;
			case 4: 
				dividir();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Opcao invalida");
				
			}
		}
	}
	
	
	private void adicionar(){
		System.out.println("Introduza o 1º operando: ");
		int nr1 = scan.nextInt(); scan.nextLine();
		System.out.println("Introduza o 2º operando: ");
		int nr2 = scan.nextInt(); scan.nextLine();

		resultado = nr1 + nr2;
		System.out.println("Resultado :" + resultado );
		enviar ="ADD" + " " + nr1 + " " + nr2;
		Thread1 thread1 = new Thread1();
		thread1.start();
		
	}
	
	private void subtrair(){
		System.out.println("Introduza o 1º operando: ");
		int nr1 = scan.nextInt(); scan.nextLine();
		System.out.println("Introduza o 2º operando: ");
		int nr2 = scan.nextInt(); scan.nextLine();
		
		resultado = nr1 - nr2;
		System.out.println("Resultado :" + resultado );
		enviar ="SUB" + " " + nr1 + " " + nr2;
		Thread1 thread1 = new Thread1();
		thread1.start();
		
	}
	
	private void multiplicar(){
		System.out.println("Introduza o 1º operando: ");
		int nr1 = scan.nextInt(); scan.nextLine();
		System.out.println("Introduza o 2º operando: ");
		int nr2 = scan.nextInt(); scan.nextLine();
		
		resultado = nr1*nr2;
		System.out.println("Resultado :" + resultado );
		enviar ="MUL" + " " + nr1 + " " + nr2;
		Thread1 thread1 = new Thread1();
		thread1.start();
	}
	
	private void dividir(){
		System.out.println("Introduza o 1º operando: ");
		int nr1 = scan.nextInt(); scan.nextLine();
		System.out.println("Introduza o 2º operando: ");
		int nr2 = scan.nextInt(); scan.nextLine();
		
		resultado = nr1/nr2;
		System.out.println("Resultado :" + resultado );
		enviar ="DIV" + " " + nr1 + " " + nr2;
		Thread1 thread1 = new Thread1();
		thread1.start();
	}
	
	public class Thread1 extends Thread {
	      
	    out.println (enviar);
	    try {
	     
	    BufferedReader in;
		res = in.readLine();
	    } catch (IOException e1) {
	   
	     e1.printStackTrace();
	    }
	      
	   }
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		String serverHostname = new String ("127.0.0.1");
	    
	    try {
	 Socket socket = new Socket(serverHostname, 10005);
	 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	 BufferedReader in = new BufferedReader(new InputStreamReader(
	 socket.getInputStream()));
	 } catch (IOException e1) {
	 System.err.println("Couldn't get I/O for "
	 + "the connection to: " + serverHostname);
	 System.exit(1);
	 
	 }
	}
}
