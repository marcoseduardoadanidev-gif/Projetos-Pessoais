import java.util.ArrayList;
import java.util.Scanner;
import Equipamentos.Equipamentos;
import Equipamentos.Musical;

public class App {

    private static String opcao;

    public int menu(Scanner leitor){

        int escolha;

        System.out.println("Escolha uma opção: ");
        System.out.println("[1] Cadastrar um equipamento Musical");
        System.out.println("[2] Listar equipamentos Cadastrados");
        System.out.println("[3] Buscar equipamento por descrição");
        System.out.println("[4] Excluir equipamento por Id");
        System.out.println("[5] Mostrar quantidade de equpamentos cadastrados");
        System.out.print("--> ");

        escolha = leitor.nextInt();
        return escolha;
    }

    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);
        App app = new App();

        ArrayList<Musical> listaEquipamentos = new ArrayList<>(); 

    do{

        int escolha = app.menu(leitor);

        switch (escolha) {

            case 1: 

                Musical musical = new Musical(0, null, null); // objeto instanciado dentro do case para entrar em loop com os cadastros

                musical.Cadastro();
                listaEquipamentos.add(musical);
                leitor.nextLine();
                break;

            case 2:

                for(Musical instrumentos : listaEquipamentos){

                    System.out.println(instrumentos); // Exibiçaõ pelo método 'toString()' declarado na Superclasse 
                }

                leitor.nextLine();
            break;

            case 3:

                for (Musical instrumentos : listaEquipamentos)
                    System.out.println(instrumentos); // Exibição dos cadastros realizados por meio do toString()
                do{
                    boolean removido = false;
                    System.out.println("Digite o código do cadastro que deseja apagar : ");
                    int codigoExclusao = leitor.nextInt();
                    leitor.nextLine();

                    removido = listaEquipamentos.removeIf(e -> e.getId() == codigoExclusao);
                
                    if (removido)
                        System.out.println("Cadastro removido com Sucesso");
                    else
                        System.out.println("Código não encontrado, digite novamente");
                }
                while(false);


            case 4:
                leitor.nextLine();
                boolean buscEncontrada = false;

                System.out.print("Digite a descrição aqui : ");
                String busca = leitor.nextLine();

                for(Musical instrumentos : listaEquipamentos)
                    
                    if (instrumentos.getDescricao().contains(busca.toLowerCase())){
                        System.out.println(instrumentos.getId() + " " + instrumentos.getNome() + " " + instrumentos.getDescricao());
                        buscEncontrada = true;
                    }
                    if(buscEncontrada == false)
                        System.out.println("Nenhum cadastro encontrado com esta descricao");

            default:
                break;
        }

        System.out.println("Deseja selecionar outra opção ?");
        System.out.print("--> " );
        opcao = leitor.nextLine();
    }
    while(opcao.equalsIgnoreCase("sim"));

        
        
    
    }
}
