package Entities;

public class CyberCarroCarga extends Veiculo {

    private double capacidadeCarga;

    // Construtor
    public CyberCarroCarga(int id, String modelo, int ano){
        super(id, modelo, ano);
    }
    
    // Getter

    public double getCapacidadeCarga(){
        return capacidadeCarga;
    }

    //Setter

    public void setCapacidadeCarga(double capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
    }

    public boolean CadastrarCarga(){
        do{
            try{
                System.out.print("Digite a capacidade de carga do veículo : ");
                capacidadeCarga = leitor.nextDouble();

                if(capacidadeCarga <= 0)
                    System.out.println("Capacidade de carga inválida, redigite !!");
                    leitor.nextLine();    
                    return true;
            }
            catch(Exception erro){
                System.out.println("Não foi possível cadastrar a capacidade de carga do veículo, tente novamente");
                leitor.nextLine();
                return true;
            }
        }
        while(true);
    }
    public void CadastrarCyberCarroCarga(){
        
        if(super.getId() == geradorId())
            geradorId();

        super.cadastroModelo();
        super.cadastroAno();
        CadastrarCarga();
    }

    public String toString(){

        return super.toString() + " capacidade de carga : " + capacidadeCarga + " Toneladas ";
    }

}
