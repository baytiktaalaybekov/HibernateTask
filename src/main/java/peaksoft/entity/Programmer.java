package peaksoft.entity;

import jakarta.persistence.*;
import peaksoft.enums.Status;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "programmers")
public class Programmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String full_name;
    private String email;
    private LocalDate date_of_birth;
    private Status status;
    private String location;


    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToMany(mappedBy = "programmer")
    private List<Project> projectList;
}
