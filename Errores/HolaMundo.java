import java.io.*;
public class HolaMundo{
	public static void main(String args[]){
		try{
			entradaABar(18);
		}catch(MiErrorPersonalizado e){
			System.out.println("Se rompio: "+e.getMessage());
		}
	}
	public static void entradaABar(int edad) throws MiErrorPersonalizado{
		if(edad<18){
			throw new MiErrorPersonalizado("Usted es un pollito");
		}else{
			System.out.println("Bienvenido al Bar Feroz");
		}
	}
}