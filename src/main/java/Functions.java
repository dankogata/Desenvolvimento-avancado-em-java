import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Function<String,String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String,Integer> converterStringParaInteiroECalcularODobro = string -> Integer.valueOf(string) * 2;
        System.out.println(retornarNomeAoContrario.apply("daniel"));
        System.out.println(converterStringParaInteiroECalcularODobro.apply("10"));
    }
}
