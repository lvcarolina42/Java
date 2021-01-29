public class AulaArrays {
    public static void main(String[] args) {

        String [][] idades = new String[3][3];

        idades[0][0] = "Ana Boba";
        idades[1][0] = "Ana Flávia";
        idades[2][0] = "Ana Clara";
        idades[0][1] = "Ana Boba";
        idades[1][1] = "Ana Flávia";
        idades[2][1] = "Ana Clara";
        idades[0][2] = "Ana Boba";
        idades[1][2] = "Ana Flávia";
        idades[2][2] = "Ana Clara";

        for (String[] aux : idades) {
            for(String aux1 : aux){
                System.out.println(aux1);
            }
        }

    }
}
