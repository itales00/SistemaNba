import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema da NBA!");
        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        if ("ADMIN".equals(usuario) && "nba123".equals(senha)) {
            System.out.println("Login bem-sucedido!");

            List<Jogador> jogadores = new ArrayList<>();
            List<Equipe> equipes = new ArrayList<>();
            int opcao;

            do {
                System.out.println("\n--- Menu Principal ---");
                System.out.println("1. Adicionar Jogador");
                System.out.println("2. Adicionar Equipe");
                System.out.println("3. Registrar Partida");
                System.out.println("4. Exibir Dados");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcao) {
                    case 1:
                        System.out.print("Nome do jogador: ");
                        String nome = scanner.nextLine();
                        System.out.print("Idade: ");
                        int idade = scanner.nextInt();
                        System.out.print("Pontos: ");
                        int pontos = scanner.nextInt();
                        scanner.nextLine(); 
                        jogadores.add(new Jogador(nome, idade, pontos));
                        break;
                    case 2:
                        
                        System.out.println("\n--- Jogadores Cadastrados ---");
                        for (int i = 0; i < jogadores.size(); i++) {
                            System.out.println((i + 1) + ". " + jogadores.get(i).getNome());
                        }

                        if (jogadores.size() < 2) {
                            System.out.println("Não há jogadores suficientes para formar uma equipe.");
                            break;
                        }

                        System.out.print("Escolha o jogador 1 (índice): ");
                        int jogador1Index = scanner.nextInt() - 1;
                        System.out.print("Escolha o jogador 2 (índice): ");
                        int jogador2Index = scanner.nextInt() - 1;
                        scanner.nextLine(); 

                        if (jogador1Index != jogador2Index) {
                            List<Pessoa> equipeJogadores = new ArrayList<>();
                            equipeJogadores.add(jogadores.get(jogador1Index));
                            equipeJogadores.add(jogadores.get(jogador2Index));
                            System.out.print("Nome da equipe: ");
                            String nomeEquipe = scanner.nextLine();
                            equipes.add(new Equipe(nomeEquipe, equipeJogadores));
                        } else {
                            System.out.println("Jogadores não podem ser os mesmos!");
                        }
                        break;
                    case 3:
                        System.out.println("Partida registrada!");
                        break;
                    case 4:
                        System.out.println("\n--- Dados ---");
                        for (Equipe equipe : equipes) {
                            System.out.println(equipe);
                        }

                        
                        if (equipes.size() >= 2) {
                            Random random = new Random();
                            int time1 = random.nextInt(equipes.size());
                            int time2 = random.nextInt(equipes.size());

                            
                            while (time1 == time2) {
                                time2 = random.nextInt(equipes.size());
                            }

                            String mensagem = gerarResultadoPartida(equipes.get(time1).getNome(), equipes.get(time2).getNome());
                            System.out.println(mensagem);
                        } else {
                            System.out.println("Não há partidas suficientes para exibir.");
                        }
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }

            } while (opcao != 5);
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }

        scanner.close();
    }

    
    public static String gerarResultadoPartida(String time1, String time2) {
        Random random = new Random();
        int vitoria = random.nextInt(2); 
        if (vitoria == 0) {
            return time1 + " venceu " + time2 + "!";
        } else {
            return time2 + " venceu " + time1 + "!";
        }
    }
}
