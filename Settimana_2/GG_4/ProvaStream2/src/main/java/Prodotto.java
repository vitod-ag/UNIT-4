public class Prodotto {
        private Long id;
        private String nome;
        private String categoria;
        private Double prezzo;

        public Prodotto(String categoria) {
            this.categoria = categoria;
        }
    public Prodotto(Long id, String nome, String categoria, double prezzo) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.prezzo = prezzo;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCategoria() {
        return this.categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
