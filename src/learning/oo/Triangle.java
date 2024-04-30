package learning.oo;  // Pacote da classe

public class Triangle {  // Triangle é o nome da classe
    public double a;
    public double b;
    public double c;  // Atributos da classe

    public double area() {   // A função não recebe os argumentos, pois as variáveis a, b e c já estão na classe
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

// O prefixo "public" indica que o atributo ou método pode ser usado em outros arquivos
// double é o tipo de dado que o método retorna (se o método não retorna nada, usa-se a palavra do "void")


