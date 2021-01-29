public class ImprimindoVariaveis {
    public static void main(String[] args){
        //boolean = 1 byte (true ou false)
        boolean testeBool = false;
        //byte = 1 byte (-128 a 127)
        byte testeByte = 126;
        //short = 2 bytes (-32768 a 32767)
        short testeShort = -32768;
        //long = 8 bytes (-9223372036854775808L a 9223372036854775807L)
        long testeLong = 9223372036854775807L;
        //float = 4 bytes (até 10 elevado a 38)
        float testeFloat = 100000;
        //double = 8 bytes (até 10 elevado a 308)
        double testeDouble = 100000.127;
        //int = 4 bytes (-2147483648 a 2147483647)
        int testeInt = -2147483648;
        //char = 2 bytes (Caracteres delimitados por aspas simples)
        char testeChar = 'F';

        System.out.println(testeBool);
        System.out.println(testeByte);
        System.out.println(testeShort);
        System.out.println(testeLong);
        System.out.println(testeFloat);
        System.out.println(testeDouble);
        System.out.println(testeInt);
        System.out.println(testeChar);
    }
}
