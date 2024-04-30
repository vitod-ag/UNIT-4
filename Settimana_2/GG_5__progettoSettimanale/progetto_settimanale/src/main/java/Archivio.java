import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Archivio {
    private HashMap<String, Catalogo> catalogo;

    public Archivio() {
        this.catalogo = new HashMap<>();
    }

    public HashMap<String, Catalogo> getArchivioCatalogo() {
        return this.catalogo;
    }

    public void addProduct(Catalogo product) throws CatalogoException{
        if(catalogo.containsKey(product.getCodiceISBN())) {
            throw new CatalogoException("Codice ISBN già presente");
        }else {
            catalogo.put(product.getCodiceISBN(),product);
        }
    }

    public void removePerISBN(String codiceISBN) throws CatalogoException {
        if (catalogo.remove(codiceISBN) == null) {
            throw new CatalogoException("Codice ISBN non trovato");
        }else {
            catalogo.remove(codiceISBN);
        }
    }

    public Catalogo searchPerISBN(String codiceISBN) throws CatalogoException {
        if (catalogo.get(codiceISBN) == null) {
            throw new CatalogoException("Nessun prodotto trovato");
        }else {
            return catalogo.get(codiceISBN);
        }
    }

    public List<Catalogo> searchYearPubblication(String anno) throws CatalogoException {
        List<Catalogo> products = catalogo.values().stream().filter
                (product -> product.getAnnoPubblicazione()
                        .equals(anno)).toList();
        if(products.isEmpty()){
            throw new CatalogoException("Nessun prodotto relativo all'anno fornito è stato trovato");
        }else {
            return products;
        }
    }

    public List<Catalogo> searchAuthor(String author) throws CatalogoException{
        List<Catalogo> products = catalogo.values().stream().filter(product -> product instanceof Libro
                      && ((Libro) product).getAutore().equals(author)).collect(Collectors.toList());
        if (products.isEmpty()) {
            throw new CatalogoException("Non è stato trovato nessun libro relativo all'autore fornito");
        }else {
            return products;
        }
    }

    @Override
    public String toString() {
        return "Archivio{" +
                "catalogo=" + catalogo +
                '}';
    }
}
