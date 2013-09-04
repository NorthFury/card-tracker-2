package north.magic.cardtracker.criteria.filter;

import north.magic.cardtracker.criteria.BaseModifierTest;
import java.util.ArrayList;
import java.util.List;
import north.magic.cardtracker.criteria.Modifier;
import north.magic.cardtracker.domain.Card;
import north.magic.cardtracker.service.CardSearchService;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author North
 */
public class ContainsFilterTest extends BaseModifierTest {

    @Test
    public void testContainsFilter() {
        ArrayList<Modifier> filters = new ArrayList<>();
        filters.add(new InsensitiveContainsFilter("subtype", "Illusion"));

        List<Card> cards = CardSearchService.findCards(filters);
        Assert.assertEquals(2, cards.size());
    }
}
