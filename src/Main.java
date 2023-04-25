public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o screan match");
        System.out.println("Filme: Top Gun: Maverick");
        int ano = 2022;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom
                ano de lançamento
                """ + ano;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}