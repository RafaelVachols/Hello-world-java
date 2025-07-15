public class Médiafilme {
    public static void main(String[] args) {
        System.out.println("Filme: Creed: Nascido para lutar ");

        int anoDeLancamento =  2015;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        String sinopse;
        sinopse = """
                Adonis Johnson nunca conheceu seu pai, Apollo Creed, que faleceu antes do seu nascimento.\n Ainda assim, a luta está em seu sangue e ele decide entrar no mundo das competições profissionais de boxe, \n após muito insistir, Adonis consegue convencer Rocky Balboa a ser seu treinador. 
                """;
        System.out.println(sinopse);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 7.6;

        double media = (6.5 + 8.0 + 8.5 ) / 3;
        System.out.println(media);

        int classificação;
        classificação = (int) (media/2);
        System.out.println(classificação);

    }
}
