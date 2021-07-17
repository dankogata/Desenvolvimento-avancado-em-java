import java.util.*;

class FatorialMemoization {
    //armazenar em mapas
    static Map<Integer,Integer> MAPA_FATORIAL = new HashMap<>();
    public static void main(String[] args) {
        //inicial
        long I = System.nanoTime();
        System.out.println(fatorialComMemoization(15));
        //final
        long F = System.nanoTime();
        System.out.println("FATORIAL 1 "+(F-I));

        I = System.nanoTime();
        System.out.println(fatorialComMemoization(15));
        F = System.nanoTime();
        System.out.println("FATORIAL 2 "+(F-I));
    }

    public static Integer fatorialComMemoization( Integer value ) {
        if ( value == 1 ) {
            return value;
        } else {
            if (MAPA_FATORIAL.containsKey(value)) {
                //checa se o valor está dentro do mapa
                return   MAPA_FATORIAL.get(value);
            }  else {
                Integer resultado =  value * fatorialComMemoization(value -1);
                MAPA_FATORIAL.put(value,resultado);
                return resultado;
            }
        }
    }
}

