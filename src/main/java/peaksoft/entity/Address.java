package peaksoft.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "address")

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String region_name;
    private String street;
    private int home_number;

    @OneToOne(mappedBy = "address")
    private Programmer programmers;

    @ManyToOne
    private Country country;
}
