package be.pxl.budget;

import javax.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String IBAN;
    private String name;

    public Account(String IBAN, String name) {
        this.IBAN = IBAN;
        this.name = name;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
