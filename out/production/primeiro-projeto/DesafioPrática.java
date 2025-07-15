public class DesafioPrática {
    public static void main(String[] args) {
        //1
     double media =  (8.5 + 9.8 )/2;
        System.out.println(media);

       //2
      double media2 = 3.5;
      int sing = (int) media2;
        System.out.println(sing);

        //3
      char letra = 'R';
        System.out.println(letra);
        String palavra;
        palavra = """
                desafio e prática
                média do filme
                """;
        System.out.println(palavra);

        //4
        double precoProduto = 50.5;
        int quantidade = 200;
        System.out.println(precoProduto*quantidade);

        //5
        double valorEmDolares = 9;
        double valorEmReais = 4.94;

        System.out.println("Valor em reais: " + valorEmReais*valorEmDolares);


        //6
        double precoOriginal = 10;
        double percentualDesconto = 10%6;
        System.out.println("Preço com desconto:" + precoOriginal%percentualDesconto);


    }
}
