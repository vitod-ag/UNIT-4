package it.next_devs;

public class Customer {
    private Long id;
    private String name;
    private Integer tier;

    public Customer(long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTier() {
        return this.tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}
