package be.pxl.budget;

import org.dom4j.swing.LeafTreeNode;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date date;
    private float amount;

    @Column(length = 45)
    private String currency;

    private String detail;

    @ManyToOne
    private Account account;

    @OneToOne(mappedBy = "payment")
    @NotFound(action = NotFoundAction.IGNORE)
    private Label label;

    public Payment(long id, Date date, float amount, String currency, String detail, Account account, Label label) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.currency = currency;
        this.detail = detail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
}
