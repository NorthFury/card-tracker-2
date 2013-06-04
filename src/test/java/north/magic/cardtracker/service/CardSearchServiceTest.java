package north.magic.cardtracker.service;

import java.util.ArrayList;
import java.util.List;
import north.magic.cardtracker.domain.Card;
import north.magic.cardtracker.filter.BaseFilterTest;
import north.magic.cardtracker.filter.CardTypeFilter;
import north.magic.cardtracker.filter.EqualsFilter;
import north.magic.cardtracker.filter.Filter;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author North
 */
public class CardSearchServiceTest extends BaseFilterTest {

    @Test
    public void testCardSearchServiceWithMultipleFilters() {
        ArrayList<String> types = new ArrayList<>();
        types.add("Creature");

        ArrayList<Filter> filters = new ArrayList<>();
        filters.add(new EqualsFilter("status.implemented", true));
        filters.add(new CardTypeFilter(types));

        List<Card> cards = CardSearchService.findCards(filters, firstRow, maxRows);
        Assert.assertEquals(1, cards.size());
    }
}