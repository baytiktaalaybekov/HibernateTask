package peaksoft.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    private String description;

    @OneToMany(mappedBy = "country",cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH})
    private List <Address> address;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
