public abstract class ProcessadorTexto {

    // TEMPLATE METHOD – define o algoritmo fixo
    public final String processar(String entrada) {
        char[] caracteres = extrairCaracteres(entrada);
        char[] convertidos = converterCaracteres(caracteres);
        String resultado = juntarCaracteres(convertidos);
        return resultado;
    }

    // Etapas fixas
    protected char[] extrairCaracteres(String texto) {
        return texto.toCharArray();
    }

    protected String juntarCaracteres(char[] chars) {
        return new String(chars);
    }

    // Etapa variável → definida nas subclasses
    protected abstract char[] converterCaracteres(char[] chars);
}
