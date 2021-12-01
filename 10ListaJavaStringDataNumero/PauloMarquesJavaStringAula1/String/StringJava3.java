package String;

public class StringJava3 {
    public static void main(String[] args) {
        String string1 = "abc";
        System.out.println("Valor da String: " + string1);

        //metodo toUpper()
        string1.toUpperCase();
        System.out.println("Valor da String: " + string1);
        //não muda nada, string imutavel

        string1 = string1.toUpperCase();
        System.out.println("Valor da String: " + string1);

        String string2 = "def";
        System.out.println("strings concaternadas: " + string1 + string2);
    }
}
