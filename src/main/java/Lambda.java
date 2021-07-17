public class Lambda {
    public static void main(String[] args) {
        Funcao colocarPrefixoSenhorNaString = valor -> "Sr." + valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar("Daniel"));
    }
}
//Interface abstrata
@FunctionalInterface
interface Funcao{
    String gerar(String valor);
    //default permite ter outra saída sem ser abstrata
    //default Integer gerarNumero(String valor){}
}
