package north.magic.cardtracker.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author North
 */
@Entity
public class Card {

    @Id
    private Long id;
    @Column(length = 64, nullable = false)
    private String name;
    @Column(length = 1024, nullable = false)
    private String abilities;
    @Column(length = 64, nullable = false)
    private String cost;
    @Column(nullable = false)
    private int cmc;
    @Column(length = 64, nullable = false)
    private String type;
    @Column(length = 64)
    private String supertype;
    @Column(length = 64)
    private String subtype;
    @Column(length = 8)
    private String power;
    @Column(length = 8)
    private String toughness;
    @OneToOne
    private CardStatus status;
    @OneToMany(mappedBy = "card")
    private List<CardEdition> editions;
    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    private List<Comment> comments;
    @OneToOne
    private Card otherSide;

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public CardStatus getStatus() {
        return status;
    }

    public void setStatus(CardStatus status) {
        this.status = status;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getCmc() {
        return cmc;
    }

    public void setCmc(int cmc) {
        this.cmc = cmc;
    }

    public List<CardEdition> getEditions() {
        return editions;
    }

    public void setEditions(List<CardEdition> editions) {
        this.editions = editions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSupertype() {
        return supertype;
    }

    public void setSupertype(String supertype) {
        this.supertype = supertype;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getToughness() {
        return toughness;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Card getOtherSide() {
        return otherSide;
    }

    public void setOtherSide(Card otherSide) {
        this.otherSide = otherSide;
    }
}
