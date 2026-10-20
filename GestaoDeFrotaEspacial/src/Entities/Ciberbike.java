package Entities;

public class Ciberbike extends Veiculo {

    private double potenciaTurbina;

    // Construtor

    public Ciberbike(int id, String modelo, int ano){
        super(id, modelo, ano);
    }

    // Getter
    public double getPotenciaTurbina(){
        return potenciaTurbina;
    }

    // Setter
    public void setPotenciaTurbina(double potenciaTurbina){
        this.potenciaTurbina = potenciaTurbina;
    }

    public boolean cadastroPpotenciaTurbina(){
        do{

            try{
                System.out.print("Digite a potência da turbina da Ciberbike: ");
                potenciaTurbina = leitor.nextDouble();

                if(potenciaTurbina <= 0)
                    System.out.println("Potência inválida, digite novamente !!");
                    leitor.nextLine();
                    return true;
            }
            catch(Exception erro){
                System.out.println("Erro ao cadastrar a potência, redigite-a !!");
                leitor.nextLine();
                return true;
            }
        }
        while(true);
    }

    public void cadastroCiberbike(){

        if(super.getId() == geradorId())
            geradorId();

        super.cadastroModelo();
        super.cadastroAno();
        cadastroPpotenciaTurbina();
    }

    public String toString(){

        return super.toString() + " potência " + potenciaTurbina + " CV ";
    }



    
}
