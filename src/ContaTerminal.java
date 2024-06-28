
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        String nome;
        String sobrenome;
        String agencia; 
        int conta;
        double saldo;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o seu nome");
            nome = scanner.next();
            
            System.out.println("Digite o seu sobrenome");
            sobrenome = scanner.next();

            System.out.println("Digite a sua agencia");
            agencia = scanner.next();
            
            System.out.println("Digite a sua conta");
            conta = scanner.nextInt();

            System.out.println("Digite o saldo da sua conta");
            saldo = scanner.nextDouble();
        }
        
        System.out.println("Ola " + nome + " " + sobrenome + " obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + " " + conta + ", e seu saldo é " + saldo + " ja está disponível para saque.");
        
        
    }
        
    }