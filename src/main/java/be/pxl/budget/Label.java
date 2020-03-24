package be.pxl.budget;

import javax.persistence.*;

@Entity
public class Label {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String description;

    @OneToOne
    private Payment payment;

}
