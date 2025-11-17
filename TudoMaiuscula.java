public class TudoMaiuscula extends ProcessadorTexto {

    @Override
    protected char[] converterCaracteres(char[] chars) {
        char[] resultado = new char[chars.length];

        for(int i = 0; i < chars.length; i++) {
            resultado[i] = Character.toUpperCase(chars[i]);
        }

        return resultado;
    }
}
