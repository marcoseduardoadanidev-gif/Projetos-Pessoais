package Equipamentos;
import java.util.Random;
import java.util.Scanner;

public class Equipamentos {
    
    private int id;
    private String descricao;
    private String nome;

    Scanner leitor = new Scanner(System.in);    


    // metodo construtor
    public Equipamentos(int id, String descricao, String nome) {
        this.id = id;
        this.descricao = descricao;
        this.nome = nome;
    }


    public void cadastroNomeDescricao(){

        System.out.println("Digite o nome do produto");
        System.out.print("--> ");
        nome = leitor.nextLine();
        System.out.println("Digite a descricao");
        System.out.print("---> ");
        descricao = leitor.nextLine();
    }

    // Gerador de id aleatório

    public void gerarId(){

        Random geradorId = new Random();
        this.id = geradorId.nextInt(1000);
    }


    public int getId() {
        return this.id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Scanner getLeitor() {
        return leitor;
    }


    public void setLeitor(Scanner leitor) {
        this.leitor = leitor;
    }

    // Método que evita que o 'sout' fique muito extenso
    @Override
    public String toString() {
        return id + " - " + nome + " (" + descricao + ")"; 
    }
  
}
