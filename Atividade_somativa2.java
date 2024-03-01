package primeiro_projeto;
import java.util.Scanner;

public class Atividade_somativa2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       //variáveis 
			double horatrab,valorhora,salbruto,salliquido,inss;
			//instanciar classe Scanner
			Scanner ler = new Scanner(System.in);
			
			//Entrada de dados
			System.out.println("informe valor da Hora trabalhada: ");
			horatrab = ler.nextDouble();
			
			System.out.println("informe o valor hora: ");
			valorhora = ler.nextDouble();
		
			
			//Processamento
			salbruto = horatrab*valorhora;
			//Saída
			System.out.println("O resultado do salbruto é: " + salbruto);
			
			//Processamento
			inss = salbruto*0.12;
			//saída
			System.out.println("O resultado do inss é : " + inss);
			
			//Processamento
			salliquido = salbruto-inss;
			//saída
			System.out.println("O resultado do salliquido é : " + salliquido);
			
			//saída
			System.out.println("O resultado do salbruto é : " + salbruto);
			
			
			
					
			
			
			
			
			
			
			
			
			
	}

}
