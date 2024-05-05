import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos= 0;
        boolean isWin= false;


        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < palabraSecreta.length(); i++) {
            letrasAdivinadas[i] = '-';
            
        }

        while (!isWin && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar " + String.valueOf(letrasAdivinadas)+"(" +palabraSecreta.length()+" letras)");

            System.out.println("Introduce una letra, por favor");
            char letra = Character.toLowerCase(scanner.nextLine().charAt(0));
            boolean isLetterInWord = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    isLetterInWord = true;
                }
            }

            if (!isLetterInWord) {
                intentos++;
                System.out.println("Letra incorrecta");
                System.out.println("Te quedan " + (intentosMaximos - intentos) + " intentos");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                isWin = true;
                System.out.println("Has ganado la palabra era: "+palabraSecreta);
            }
        }
        if (!isWin) {
            System.out.println("Has perdido, la palabra era: "+palabraSecreta);
        }

        scanner.close();
    }
}
