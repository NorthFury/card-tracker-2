package north.magic.cardtracker.criteria.order;

import north.magic.cardtracker.criteria.*;
import java.util.ArrayList;
import java.util.List;
import north.magic.cardtracker.domain.Card;
import north.magic.cardtracker.service.CardSearchService;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author North
 */
public class ByPropertyOrderTest extends BaseModifierTest {

    @Test
    public void ascendingTest() {
        ArrayList<Modifier> modifiers = new ArrayList<>();
        modifiers.add(new ByPropertyOrder("name", OrderDirection.ASCENDING));

        List<Card> cards = CardSearchService.findCards(modifiers);
        System.out.println(cards.get(0).getName());
        Assert.assertEquals("Angel's Feather", cards.get(0).getName());
    }

    @Test
    public void descendingTest() {
        ArrayList<Modifier> modifiers = new ArrayList<>();
        modifiers.add(new ByPropertyOrder("name", OrderDirection.DESCENDING));

        List<Card> cards = CardSearchService.findCards(modifiers);
        System.out.println(cards.get(0).getName());
        Assert.assertEquals("Runeclaw Bear", cards.get(0).getName());
    }
}
