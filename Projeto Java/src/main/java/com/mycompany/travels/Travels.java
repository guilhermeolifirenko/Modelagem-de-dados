package com.mycompany.travels;

/**
 *
 * @author Guilherme Olifirenko
 */
import TravelsDAO.TravelsDAO;
import java.util.Scanner;

public class Travels {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        System.out.println("      \nBem-vindo a nossa agência");
        System.out.println(" ___________________________________");
        System.out.println("|                                   |");
        System.out.println("|        Selecione uma opção        |");
        System.out.println("|___________________________________|");
        System.out.println("|                                   |");
        System.out.println("| 1. Cadastrar-se                   |");
        System.out.println("| 2. Editar Conta                   |");
        System.out.println("| 3. Deletar Conta                  |");
        System.out.println("| 4. Listar Contas                  |");
        System.out.println("| 5. Emitir Passagem                |");
        System.out.println("| 6. Editar Passagem                |");
        System.out.println("| 7. Deletar Passagem               |");
        System.out.println("| 8. Listar Passagens               |");
        System.out.println("| 9. Sair                           |");
        System.out.println("|___________________________________|");
        
        TravelsDAO t = new TravelsDAO();
        int opcao = teclado.nextInt();
        
        switch(opcao) {
            case 1:
                Cliente c = new Cliente();
                
                System.out.println("\nDigite seu nome: ");
                String nome = teclado.next();
                c.setNome(nome);
        
                System.out.println("\nDigite seu E-mail: ");
                String email = teclado.next();
                c.setEmail(email);

                System.out.println("\nDigite seu CEP: ");
                String cep = teclado.next();
                c.setCep(cep);

                System.out.println("\nDigite seu CPF: ");
                String cpf = teclado.next();
                c.setCpf(cpf);

                System.out.println("\nDigite seu Telefone: ");
                String tel = teclado.next();
                c.setTelefone(tel);
                
                t.cadastrarCliente(c);
                System.out.println("Cliente cadastrado com sucesso!");
                menu();
                break;
            case 2:
                Cliente ec = new Cliente();
                
                System.out.println("\nQual o ID do cliente? ");
                int id = teclado.nextInt();
                ec.setId(id);
                
                System.out.println("\nDigite o novo nome: ");
                String novoNome = teclado.next();
                ec.setNome(novoNome);
                
                System.out.println("\nDigite o novo E-mail: ");
                String novoEmail = teclado.next();
                ec.setEmail(novoEmail);
                
                System.out.println("\nDigite o novo CEP: ");
                String novoCep = teclado.next();
                ec.setCep(novoCep);
                
                System.out.println("\nDigite o novo CPF: ");
                String novoCpf = teclado.next();
                ec.setCpf(novoCpf);
                
                System.out.println("\nDigite o novo telefone: ");
                String novoTel = teclado.next();
                ec.setTelefone(novoTel);
                
                t.editarCliente(ec);
                System.out.println("\nConta modificada com sucesso!");
                menu();
                break;
            case 3:
                System.out.println("Qual o ID do cliente? ");
                int idCliente = teclado.nextInt();
                t.deletarCliente(idCliente);
                System.out.println("\nCliente deletado com sucesso!");
                menu();
                break;
            case 4:
                for (Cliente c1: t.listarCliente()) {
                    System.out.println("\nID: " + c1.getId());
                    System.out.println("Cliente: " + c1.getNome());
                    System.out.println("E-mail: " + c1.getEmail());
                    System.out.println("CPF: " + c1.getCpf());
                    System.out.println("CEP: " + c1.getCep());
                    System.out.println("Telefone: " + c1.getTelefone());
                    System.out.println("");
                }
                menu();
                break;
            case 5:
                Passagem p = new Passagem();
                
                System.out.println("\nDigite o dia de partida: ");
                int dia = teclado.nextInt();
                p.setDia(dia);
        
                System.out.println("\nDigite o Mês: ");
                int mes = teclado.nextInt();
                p.setMes(mes);

                System.out.println("\nDigite o Ano: ");
                int ano = teclado.nextInt();
                p.setAno(ano);

                System.out.println("\nDigite o Horário de partida: ");
                Double hora = teclado.nextDouble();
                p.setHorario(hora);

                System.out.println("\nDigite seu Destino: ");
                String des = teclado.next();
                p.setDestino(des);
                
                System.out.println("\nDigite o Aeroporto de partida: ");
                String partida = teclado.next();
                p.setPartida(partida);
                
                System.out.println("\nDigite o Aeroporto de chegada: ");
                String chegada = teclado.next();
                p.setChegada(chegada);
                
                System.out.println("\nDigite o valor da passagem: ");
                Double valor = teclado.nextDouble();
                p.setHorario(valor);
                
                System.out.println("\nDigite o valor do desconto: ");
                Double desc = teclado.nextDouble();
                p.setHorario(desc);
                
                System.out.println("\nQual o número da poltrona?: ");
                int polt = teclado.nextInt();
                p.setDia(polt);
                
                t.emitirPassagem(p);
                System.out.println("Passagem emitida com sucesso!");
                
                menu();
                break;
            case 6:
                Passagem ep = new Passagem();
                
                System.out.println("\nQual o ID da sua passagem? ");
                int idP = teclado.nextInt();
                ep.setId(idP);
                
                System.out.println("\nDigite o novo dia de partida: ");
                int novoDia = teclado.nextInt();
                ep.setDia(novoDia);
        
                System.out.println("\nDigite o novo Mês: ");
                int novoMes = teclado.nextInt();
                ep.setMes(novoMes);

                System.out.println("\nDigite o novo Ano: ");
                int novoAno = teclado.nextInt();
                ep.setAno(novoAno);

                System.out.println("\nDigite o novo Horário de partida: ");
                Double novoHora = teclado.nextDouble();
                ep.setHorario(novoHora);

                System.out.println("\nDigite o seu novo Destino: ");
                String novoDes = teclado.next();
                ep.setDestino(novoDes);
                
                System.out.println("\nDigite o novo Aeroporto de partida: ");
                String novoPartida = teclado.next();
                ep.setPartida(novoPartida);
                
                System.out.println("\nDigite o novo Aeroporto de chegada: ");
                String novoChegada = teclado.next();
                ep.setChegada(novoChegada);
                
                System.out.println("\nDigite o novo valor da passagem: ");
                Double novoValor = teclado.nextDouble();
                ep.setHorario(novoValor);
                
                System.out.println("\nDigite o novo valor do desconto: ");
                Double novoDesc = teclado.nextDouble();
                ep.setHorario(novoDesc);
                
                System.out.println("\nQual o novo número da poltrona?: ");
                int novoPolt = teclado.nextInt();
                ep.setDia(novoPolt);
                
                t.editarPassagem(ep);
                System.out.println("Passagem modificada!");
                
                menu();
                break;
            case 7:
                System.out.println("Digite o ID da passagem que deseja deletar: ");
                int del = teclado.nextInt();
                t.deletarPassagem(del);
                System.out.println("Passagem deletada com sucesso!");
                
                menu();
                break;
            case 8:
                for (Passagem p1: t.listarPassagem()) {
                    System.out.println("\nID: " + p1.getId());
                    System.out.println("Dia: " + p1.getDia());
                    System.out.println("Mês: " + p1.getMes());
                    System.out.println("Ano: " + p1.getAno());
                    System.out.println("Horário: " + p1.getHorario());
                    System.out.println("Destino: " + p1.getDestino());
                    System.out.println("Partida: " + p1.getPartida());
                    System.out.println("Chegada: " + p1.getChegada());
                    System.out.println("Valor: " + p1.getValor());
                    System.out.println("Desconto: " + p1.getDesconto());
                    System.out.println("Poltrona: " + p1.getPoltrona());
                    System.out.println("");
                }
                menu();
                break;
            case 9:
                System.out.println("\nObrigado por visitar a nossa agência");
                System.exit(0);
            default:
                System.out.println("\nOpção inválida!");
                menu();
                break;
        }
    }
}
