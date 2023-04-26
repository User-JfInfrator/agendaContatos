import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int contatos;

        System.out.println("Quantos contatos vai adicionar? ");
        contatos = sc.nextInt();
        System.out.println("\n");

        agenda [] lista = new agenda [contatos];

        for (int cont = 0; cont < contatos; cont++) {
            
            agenda ctt = new agenda();

            System.out.println("Digite o nome do contato: ");
            ctt.setNome(sc.next());
            System.out.println("\n");

            System.out.println("Digite o sobrenome do contato: ");
            ctt.setSobreNome(sc.next());
            System.out.println("\n");

            System.out.println("Digite o número do contato: ");
            ctt.setNumeroCelular(sc.nextInt());
            System.out.println("\n");

            lista [cont] = ctt;
            }


            System.out.println("Seus contatos a seguir: ");
            for(agenda agd : lista ){
                System.out.println(agd.getNome() + agd.getSobreNome() + agd.getNumeroCelular());
            }
}

}

