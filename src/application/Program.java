package application;
import entities.Funcionario;
import entities.Gerente;

public class Program {
	
	public static void main(String args[]) {
        Funcionario funcionario = new Funcionario("Robertão", 3000.0);
        Gerente gerente = new Gerente("Cabeludo", 5000.0, "Marketing");
     
        funcionario.exibirInfo();
        System.out.println();
        
        gerente.exibirInfo();
        System.out.println();
		
	}
}
