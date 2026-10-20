import java.util.ArrayList;
import java.util.Scanner;
import Entities.Ciberbike;
import Entities.CyberCarroCarga;
import Entities.Veiculo;

public class App {

    public static void main(String[] args) throws Exception {

         String opcao;
        
        Scanner leitor = new Scanner(System.in);

        ArrayList<Veiculo> listavVeiculos = new ArrayList<>();
        

        do{

            System.out.println("Olá, bem vindo ao Sistema Gestor de Frota Espacial da Cidade do Ferro !!");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("\n\n em que posso te ajudar hoje ??");
            System.out.println("[1] Cadastrar Ciberbike");
            System.out.println("[2] Cadastrar CiberCarro");
            System.out.println("[3] Mostrar lista de cadastros realizados");
            System.out.println("[4] Buscar veículo por modelo ");
            System.out.println("[5] Remover um veículo da lista de cadastros");
            System.out.println("[6] Relatório de potência das Ciberbikes");
            System.out.println("[7] Relatório das cargas suportadas pelos CiberCarros ");
            System.out.println("[8] Sair");
            System.out.print("--> ");
            int escolha = leitor.nextInt();

            switch (escolha) {
                case 1:

                    Ciberbike ciberbike = new Ciberbike(0, null, 0);
                    ciberbike.cadastroCiberbike();
                    listavVeiculos.add(ciberbike);
                    leitor.nextLine();

                    break;

                case 2:

                    CyberCarroCarga cibercarro = new CyberCarroCarga(0, null, 0);
                    cibercarro.CadastrarCyberCarroCarga();
                    listavVeiculos.add(cibercarro);
                    leitor.nextLine();

                    break;

                case 3:

                    for(Veiculo veiculos : listavVeiculos)
                        System.out.println(veiculos);
                    leitor.nextLine();

                    break;

                case 4:

                    boolean retorno = false;

                    leitor.nextLine();
                    System.out.println("Digite a descrição do veículo");
                    System.out.print("--> ");
                    String descricao = leitor.nextLine();
                    
                    for(Veiculo veiculos : listavVeiculos){

                        if (veiculos.getModelo().toLowerCase().contains(descricao.toLowerCase())) 

                            // para funcionar, tem de garantir que ambas informações estejam na mesma case
                            
                            System.out.println(veiculos.getId()+ " - " + veiculos.getAno() + " - " + veiculos.getModelo());
                            retorno = true;
                    }
                    if(retorno == false)
                        System.out.println("Busca não encontrada"); // verificação da condição não encontrada sempre fora do laço
                    break;

                case 5:

                    for(Veiculo veiculos : listavVeiculos)
                        System.out.println(veiculos);

                    do{
                        boolean cadastroRemovido = false;

                        System.out.print("Digite o codigo do cadastro que deseja remover : ");
                        int codigoRemocao = leitor.nextInt();
                        leitor.nextLine();

                        cadastroRemovido = listavVeiculos.removeIf(e -> e.getId() == codigoRemocao);

                        if(cadastroRemovido == true)
                            System.out.println("Cadastro removido com sucesso !!");
                        else
                            System.out.println("Codigo não encontrado, remoção não concluida !!");

                    }
                    while(false);
                    leitor.nextLine();
                    break;

                case 6:

                    boolean veiculoEncontrado = false;

                    for(Veiculo veiculos : listavVeiculos)
                    
                    if(veiculos instanceof Ciberbike){

                        Ciberbike cb = (Ciberbike) veiculos;

                        if(cb.getPotenciaTurbina() > 500) 
                            veiculoEncontrado = true;
                    } 

                if(veiculoEncontrado != true )
                    System.out.println("Nenhum veículo encontrado");
                break;


                case 7: 

                    boolean buscaEncontrada = false;

                   
                     for(Veiculo veiculos : listavVeiculos)
                        
                        if(veiculos instanceof CyberCarroCarga ){

                            CyberCarroCarga ciberCarro = (CyberCarroCarga) veiculos;

                            if(ciberCarro.getCapacidadeCarga() >= 10000)
                                System.out.println(ciberCarro);
                                buscaEncontrada = true;
                        }
                        if(buscaEncontrada == false)
                            System.out.println("Veículo não encontrado");
                    break;

                case 8:
                    System.out.println("Desligando o sistema");

                default:
                    break;
            }
            System.out.println("Deseja escolher outra das opções acima ??");
            System.out.print("--> ");
            opcao = leitor.nextLine();
        }
        while(opcao.equalsIgnoreCase("sim"));
    }
}
