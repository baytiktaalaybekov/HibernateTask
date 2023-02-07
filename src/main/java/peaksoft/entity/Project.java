package peaksoft.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private LocalDate date_of_start;
    private LocalDate date_of_finish;
    private int price;


    @ManyToMany(cascade = {})
    @JoinColumn(name = "project_id")
    private List <Programmer> programmer;
}
