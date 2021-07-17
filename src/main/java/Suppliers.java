import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        //new mesma coisa que instanciar
        //()-> new Pessoa == Pessoa :: new
        Supplier<Pessoa> instanciaPessoa2 = Pessoa::new;
        System.out.println(instanciaPessoa.get());
        System.out.println(instanciaPessoa2.get());
    }
}



class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa() {
        nome = "daniel";
        idade = 26;
    }

    @Override
    public String toString() {
        return String.format("nome : %s, idade: %d", nome, idade);
    }
}