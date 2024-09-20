public class VetorOperacoes {
    public int[] somarVetor(int[] vetor, int numero) {
        int[] resultado = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            resultado[i] = vetor[i] + numero;
        }
        return resultado;
    }
}
