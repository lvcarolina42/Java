public class Operadores {
    public static void main(String[] args) {
        /***
         *      Incremento = ++
         *      Decremento = --
         *      Soma = +
         *      Subtração = -
         *      Multiplicação = *
         *      Divisão = /
         *      Cast = ()
         *      Negação = !
         */

        int a = 10;
        int b = 5;
        double c = 5.3;
        boolean d = false;

        //Incremento
        a++;
        System.out.println("Incremento a++ = " + a);
        a = 10;

        //Decremento
        a--;
        System.out.println("Decremento a-- = " + a);
        a = 10;

        //Soma
        System.out.println("Soma a + b = " + (a + b));

        //Subtração
        System.out.println("Subtracao a - b = " + (a - b));

        //Multiplicação
        System.out.println("Multiplicacao a * b = " + (a * b));

        //Divisão
        System.out.println("Divisao a / b = " + (a / b));

        //Cast
        System.out.println("Cast c para int = " + (int)c);

        //Negação
        System.out.println("Negacao de d = " + !d);

    }
}
