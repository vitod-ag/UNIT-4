package next_devs.Entity;

import next_devs.DAO.CatalogoDao;
import next_devs.Exceptions.CatalogoException;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Archivio {
//    private List<Catalogo> catalogo = new ArrayList<>();
    private CatalogoDao catalogoDao;

    public Archivio(EntityManager em) {
        this.catalogoDao = new CatalogoDao(em);
    }

    public Archivio() {}

    public void setCatalogoDao(EntityManager em) {
        this.catalogoDao = new CatalogoDao(em);
    }

    public void addProduct(Catalogo catalogo) throws CatalogoException {
        if (catalogoDao.getById(catalogo.getCodiceISBN()) == null) {
            catalogoDao.save(catalogo);
            System.out.println("Aggiunto con successo al catalogo: ISBN: " + catalogo.getCodiceISBN());
        } else {
            catalogoDao.update(catalogo);
            System.out.println("Aggiornato prodotto all'archivio. ISBN: " + catalogo.getCodiceISBN());
        }
    }

    public void removePerISBN(String codiceISBN) throws CatalogoException {
        Catalogo catalogo = catalogoDao.getById(codiceISBN);
        if (catalogo == null) {
            throw new CatalogoException("Codice ISBN non trovato");
        }else {
            catalogoDao.delete(catalogo);
            System.out.println();
        }
    }

//    public Catalogo searchPerISBN(String codiceISBN) throws CatalogoException {
//        if (catalogo.get(codiceISBN) == null) {
//            throw new CatalogoException("Nessun prodotto trovato");
//        }else {
//            return catalogo.get(codiceISBN);
//        }
//    }
//
//    public List<Catalogo> searchYearPubblication(String anno) throws CatalogoException {
//        List<Catalogo> products = catalogo.values().stream().filter
//                (product -> product.getAnnoPubblicazione()
//                        .equals(anno)).toList();
//        if(products.isEmpty()){
//            throw new CatalogoException("Nessun prodotto relativo all'anno fornito è stato trovato");
//        }else {
//            return products;
//        }
//    }
//
//    public List<Catalogo> searchAuthor(String author) throws CatalogoException{
//        List<Catalogo> products = catalogo.values().stream().filter(product -> product instanceof Libro
//                      && ((Libro) product).getAutore().equals(author)).collect(Collectors.toList());
//        if (products.isEmpty()) {
//            throw new CatalogoException("Non è stato trovato nessun libro relativo all'autore fornito");
//        }else {
//            return products;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Archivio{" +
//                "catalogo=" + catalogo +
//                '}';
//    }
}
