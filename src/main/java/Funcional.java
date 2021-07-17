import java.util.function.UnaryOperator;

public class Funcional {
    public static void main(String[]args){
        //conceito de programação funcional
        UnaryOperator<Integer> calcularValorVezes3 = valor -> valor*3;
        int valor = 10;
        System.out.println("O resultado é: "+calcularValorVezes3.apply(10));

        //imutabilidade
        //v é uma variavél imutavel referente a valor (usando função lambda)
        UnaryOperator<Integer> retornaDobro = v -> v*2;
        System.out.println(retornaDobro.apply(valor));
        System.out.println(valor);
    }
}
