package north.magic.cardtracker.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author North
 */
@Entity
public class CardEdition {

    @Id
    private Long id;
    @ManyToOne
    private Card card;
    @ManyToOne
    private Expansion expansion;
    @Column(length = 64)
    private String gathererId;
    @Column(length = 64)
    private String cardNumber;
    @Column(length = 64)
    private String mtgoImageId;
    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private CardRarity rarity;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Expansion getExpansion() {
        return expansion;
    }

    public void setExpansion(Expansion expansion) {
        this.expansion = expansion;
    }

    public String getGathererId() {
        return gathererId;
    }

    public void setGathererId(String gathererId) {
        this.gathererId = gathererId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMtgoImageId() {
        return mtgoImageId;
    }

    public void setMtgoImageId(String mtgoImageId) {
        this.mtgoImageId = mtgoImageId;
    }

    public CardRarity getRarity() {
        return rarity;
    }

    public void setRarity(CardRarity rarity) {
        this.rarity = rarity;
    }
}
