import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        //retornar boolean vazio=True
        Predicate<String> estaVazio = String::isEmpty;
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Daniel"));
    }
}
