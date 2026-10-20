package Equipamentos;

public class Musical extends Equipamentos {

    // Construtor que interliga a subClasse à SuperClasse

    public Musical(int id, String descricao, String nome) {
        super(id, descricao, nome);
    }

    public void Cadastro(){

        super.cadastroNomeDescricao();
        super.gerarId();
    }


    
}

