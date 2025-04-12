import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o numero da conta: ");
            Integer numero = Integer.parseInt(scanner.nextLine());

            System.out.println("Digite a agencia: ");
            String agencia = scanner.nextLine();

            System.out.println("Digite o nome: ");
            String nomeCliente = scanner.nextLine();

            System.out.println("Digite o saldo: ");
            Double saldo = Double.parseDouble(scanner.nextLine());

            System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
        } catch (Exception e) {
            System.out.println("Ops! Algum erro rolou aí! \n "+e.getMessage());
        }

    }
}
