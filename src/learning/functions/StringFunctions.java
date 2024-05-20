package learning.functions;

public class StringFunctions {
    public static void main(String[] args) {
        String original = "ASADA asdasdbc ASD ASDA asd     ";
        String originalSplit = "potato apple lemon";
        System.out.println("Original: - " + original + "-");

        String lower = original.toLowerCase();  // Transforma as letras em minúsculas
        System.out.println("toLowerCase: - " + lower + "-");

        String upper = original.toUpperCase();  // Transforma as letras em maiúsculas
        System.out.println("toUpperCase: - " + upper + "-");

        String noSpace = original.trim();  // Remove os espaços em branco do início e do final da string
        System.out.println("trim: - " + noSpace + "-");

        String sub = original.substring(2); // Recorta a string da posição 2 em diante
        System.out.println("substring(2): - " + sub + "-");

        String sub2 = original.substring(2, 9); // Recorta a string da posição 2 até a posição 9
        System.out.println("substring(2): - " + sub2 + "-");

        String replaced = original.replace("s", "g"); // As letras "a" da string são trocadas por letras "g"
        System.out.println("replace(a, g): - " + replaced + "-");

        int i = original.indexOf("bc");
        int j = original.lastIndexOf("sd");
        System.out.println("indexOf('bc'): - " + i + "-");
        System.out.println("lastIndexOf('sd'): - " + j + "-");

        String[] vector = originalSplit.split(" ");  // Recorta a string e gera um vetor com o separador passado como argumento
        String split1 = vector[0];
        String split2 = vector[1];
        String split3 = vector[2];
        System.out.println(split1);
        System.out.println(split2);
        System.out.println(split3);

        System.out.println("Finish code");
    }
}
