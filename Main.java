import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<CLT> cltList = new ArrayList<>();
        List<Tercerizados> tercerizadoList = new ArrayList<>();

        String opcao;

        do {
            System.out.println("Cadastro de Funcionário: ");
            System.out.println("Digite apenas 'Tercerizado', 'CLT' ou 'Sair'.");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextLine().toLowerCase();

            if (opcao.equals("sair")) {
                break;
            }

            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite as horas trabalhadas: ");
            int horasTrabalhadas = scanner.nextInt();
            System.out.print("Digite o valor da hora de trabalho: ");
            double valorHoraTrabalho = scanner.nextDouble();
            scanner.nextLine(); 

            // Dependendo da opção, adicionar à lista CLT ou Terceirizado
            if (opcao.equals("clt")) {
                CLT clt = new CLT(nome, horasTrabalhadas, valorHoraTrabalho);
                cltList.add(clt);
                System.out.println("Funcionário CLT adicionado com sucesso!");
            } else if (opcao.equals("tercerizado")) {
                Tercerizados tercerizado = new Tercerizados(nome, horasTrabalhadas, valorHoraTrabalho);
                tercerizadoList.add(tercerizado);
                System.out.println("Funcionário Terceirizado adicionado com sucesso!");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (true); 

        // Exibindo as listas de funcionários
        System.out.println("\nLista de Funcionários CLT:");
        for (CLT clt : cltList) {
            System.out.println(clt.getNome() + " - Salário: R$" + clt.calcularSalario());
        }

        System.out.println("\nLista de Funcionários Terceirizados:");
        for (Tercerizados tercerizado : tercerizadoList) {
            System.out.println(tercerizado.getNome() + " - Salário: R$" + tercerizado.calcularSalario());
        }

        // Mensagem final
        System.out.println("\nPrograma encerrado. Obrigado por utilizar o sistema!");

        scanner.close();
    }
}
