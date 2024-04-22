public class Aritmetica {
    public int divisione(int a, int b) throws DivisionePerZeroException {  // se è checked l'eccezione è obbligatoria, altrimenti no
        int risultato = 0;

        if (b == 0) {
            throw new DivisionePerZeroException("Divisione per 0 non ammessa");
        }else {
            risultato=a/b;
        }
        risultato = a / b;

        return risultato;
    }
}
