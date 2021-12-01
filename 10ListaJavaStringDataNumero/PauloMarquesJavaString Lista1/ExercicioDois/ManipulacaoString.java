package ExercicioDois;

public class ManipulacaoString {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(processar(s));
    }

    public static String processar(String s) {
        if (s.length()!=0) {
            if (s.length() <= 3) {
                return s.toUpperCase();
            } else {
                String sv = ""; //string para guardar a string com a modificação
                String aux; //string para pegar apenas um pedaço da string
                aux = s.substring(0, 3);
                for (int x = aux.length() - 1; x >= 0; x--) { // repetição para pegar as letras e trocar: "ABC" -> "CBA"
                    sv += s.charAt(x); // pega as letra e coloca na string alterada
                }
                aux = s.substring(3); // pega o resto da string que vai continuar normal
                sv += aux;  // coloca o resto na string
                return sv.toUpperCase();
            }
        }
        return null;
    }


}