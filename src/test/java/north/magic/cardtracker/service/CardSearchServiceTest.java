package north.magic.cardtracker.service;

import java.util.ArrayList;
import java.util.List;
import north.magic.cardtracker.domain.Card;
import north.magic.cardtracker.criteria.BaseModifierTest;
import north.magic.cardtracker.criteria.filter.CardTypeFilter;
import north.magic.cardtracker.criteria.filter.EqualsFilter;
import north.magic.cardtracker.criteria.Modifier;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author North
 */
public class CardSearchServiceTest extends BaseModifierTest {

    @Test
    public void testCardSearchServiceWithMultipleFilters() {
        ArrayList<String> types = new ArrayList<>();
        types.add("Creature");

        ArrayList<Modifier> filters = new ArrayList<>();
        filters.add(new EqualsFilter("status.implemented", true));
        filters.add(new CardTypeFilter(types));

        List<Card> cards = CardSearchService.findCards(filters);
        Assert.assertEquals(1, cards.size());
    }
}