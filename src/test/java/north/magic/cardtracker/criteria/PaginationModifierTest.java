package north.magic.cardtracker.criteria;

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
public class PaginationModifierTest extends BaseModifierTest {

    @Test
    public void firstPageTest() {
        ArrayList<Modifier> modifiers = new ArrayList<>();
        modifiers.add(new PaginationModifier(0, 5));

        List<Card> cards = CardSearchService.findCards(modifiers);
        Assert.assertEquals(5, cards.size());
    }

    @Test
    public void lastPageTest() {
        ArrayList<Modifier> modifiers = new ArrayList<>();
        modifiers.add(new PaginationModifier(2, 5));

        List<Card> cards = CardSearchService.findCards(modifiers);
        Assert.assertEquals(3, cards.size());
    }
}