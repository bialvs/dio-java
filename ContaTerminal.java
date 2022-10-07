import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ola! Digite seu nome: ");
		String nome = sc.next();
		System.out.println("Digite o numero da sua conta: ");
		int conta = sc.nextInt();
		System.out.println("Digite o numero da sua agencia: ");
		String agencia = sc.next();
		System.out.println("Digite o valor que deseja resgatar: ");
		double saldo = sc.nextDouble();
		
		System.out.printf("Ola, " + nome +  " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ conta + " e seu saldo " + saldo + " já está disponível para saque");
		
		sc.close();
	}

}
