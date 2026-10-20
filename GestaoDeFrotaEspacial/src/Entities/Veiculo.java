package Entities;
import java.util.Random;
import java.util.Scanner;

public class Veiculo {

    private int id;
    private String modelo;
    private int ano;

    Random gerarId = new Random();
    Scanner leitor = new Scanner(System.in);

    
    // Constructor

    public Veiculo(int id, String modelo, int ano){
        this.id = id;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Getters

    public int getId(){
        
        return id;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno() {
        return ano;
    }


    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
    

    // Gerador Automatico de id

    public int geradorId(){
        id = gerarId.nextInt(10000);
        return id;
    }
    
    // Cadastrar modelo

    public boolean cadastroModelo(){

        do{
            try{

                System.out.print("Digite o modelo do veículo : ");
                modelo = leitor.nextLine();

                if(modelo.isEmpty())
                    System.out.println("Erro ao digitar o modelo do veículo, redigite !!");
                    leitor.nextLine();
                return true;
            }
            catch(Exception erro){
                System.out.println("Não foi possível cadastrar o veículo !!");
                leitor.nextLine();
                return true;
            }
            
        }
        while(true);
    }

    // Cadastrar ano

    
     
    
    public boolean cadastroAno(){

        do{
            try{

                System.out.print("Digite o ano do veículo : ");
                ano = leitor.nextInt();

                if(ano <= 0)
                    System.out.println("Erro ao digitar o modelo do veículo, redigite !!");
                    leitor.nextLine();
                return true;
            }
            catch(Exception erro){
                System.out.println("Não foi possível cadastrar o ano do veículo !!");
                leitor.nextLine();
                return true;
            }
        }
        while(true);
        
    }

    public String toString(){

        return id + " - " + modelo + " ( " + " ano " + ano + " ) ";
    }

    
    
}
