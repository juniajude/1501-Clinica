package CadastroPet;

public class Responsavel {
    String nome;
    String sobrenome;
    String cep;
    String numeroResidencial;
    int idade;
    String email;
    String telefone;

    public Responsavel(String nome, String sobrenome, String cep, String numeroResidencial, int idade, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cep = cep;
        this.numeroResidencial = numeroResidencial;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public void retornarDadosBasicos (){
        if(nome == "Jude Sam"){
          System.out.println("Esse cara é legal!");

        }
        System.out.println("Nome: " + nome + "\n"+ " email:"+email );
    }

    public String retornarTodosDados() {
        return "Responsavel{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cep='" + cep + '\'' +
                ", numeroResidencial='" + numeroResidencial + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
