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
public class CardTypeFilterTest extends BaseModifierTest {

    @Test
    public void testCardTypeFilter() {
        ArrayList<String> types = new ArrayList<>();
        types.add("Artifact");
        types.add("Land");

        ArrayList<Modifier> filters = new ArrayList<>();
        filters.add(new CardTypeFilter(types));

        List<Card> cards = CardSearchService.findCards(filters);
        Assert.assertEquals(4, cards.size());
    }
}
