package CadastroPet;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        Responsavel pessoa1 = new Responsavel(
                "Jude",
                "Mondesir",
                "05883-260",
                "550",
                15,
                "jude@.com",
                "35777489"
        );

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.email);

        Pet cachorro = new Pet(
                "Bitoven",
                "Cao",
                "vira-lata",
                2,
                "preto",
                pessoa1,
                Pet.TiposCuidado.Fisioterapia.toString()
        );
        System.out.println(cachorro);
        pessoa1.retornarDadosBasicos();
        if(pessoa1.idade >= 18){
            System.out.println(cachorro.dono.retornarTodosDados());
        }
        else{
            System.out.println("Você é menor!");
        }

        System.out.println(cachorro.retornarDadospet());

    }
}
