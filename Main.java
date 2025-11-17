public class Main {

    public static void main(String[] args) {

        String texto = "Olá Mundo! Template Method FUNCIONANDO.";

        ProcessadorTexto p1 = new TudoMaiuscula();
        ProcessadorTexto p2 = new TudoMinuscula();

        String resultadoMaiusculo = p1.processar(texto);
        String resultadoMinusculo = p2.processar(texto);

        System.out.println("Texto original: " + texto);
        System.out.println("Tudo Maiúsculo: " + resultadoMaiusculo);
        System.out.println("Tudo Minúsculo: " + resultadoMinusculo);
    }
}

