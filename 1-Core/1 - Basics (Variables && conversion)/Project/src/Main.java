public class Main {
    public static void main(String[] args) {

        // conversão forçada (Pode dar erro.)
        int _int = 127;
        byte _byte = (byte) _int;
        System.out.println(_byte);
        //

        // conversão forçada (Pode dar erro.)
        int _int2 = 257;
        byte _byte2 = (byte) _int2;
        System.out.println(_byte2);
        //

        // conversão controlada (Erro pode ser tratado) defeito do java, _int3 tem que ser um vetor pois não existe a opção do out como no C#
        String _str = "123cx";
        int[] _int3 = {0}; // Usamos um array para armazenar o valor retornado

        if (tryParseInt(_str, _int3)) {
            System.out.println("Conversão OK " + _int3[0]);
        } else {
            System.out.println("Conversão não OK " + _int3[0]);
        }
        //

        

    }

    public static boolean tryParseInt(String value, int[] result) {
        try {
            result[0] = Integer.parseInt(value); // Modifica o valor no array
            return true; // Retorna true se a conversão for bem-sucedida
        } catch (NumberFormatException e) {
            return false; // Retorna false se a conversão falhar
        }
    }
}
