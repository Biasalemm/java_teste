package primeiro_projeto;
import java.util.Scanner;
public class Atividade_somativa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //variáveis 
		String a,b,conj;
		//instanciar classe Scanner
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("informe seu nome: ");
		a =  ler.nextLine();
		
		System.out.println("informe sua idade: ");
		b = ler.nextLine();
		
		//Processamento
		conj = a+b;
		//Saída
		System.out.println("Seu nome e sua idade: " + a + ", " + b + " anos ");
	}

}
