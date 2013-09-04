package north.magic.cardtracker.criteria.filter;

import north.magic.cardtracker.criteria.Criteria;
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
public class EqualsFilterTest extends BaseFilterTest {

    @Test
    public void testEqFilter() {
        ArrayList<Criteria> filters = new ArrayList<>();
        filters.add(new EqualsFilter("status.implemented", true));

        List<Card> cards = CardSearchService.findCards(filters, firstRow, maxRows);
        Assert.assertEquals(4, cards.size());
    }
}