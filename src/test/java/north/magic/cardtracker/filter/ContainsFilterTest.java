package north.magic.cardtracker.filter;

import java.util.ArrayList;
import java.util.List;
import north.magic.cardtracker.domain.Card;
import static north.magic.cardtracker.filter.BaseFilterTest.firstRow;
import north.magic.cardtracker.service.CardSearchService;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author North
 */
public class ContainsFilterTest extends BaseFilterTest {

    @Test
    public void testContainsFilter() {
        ArrayList<Filter> filters = new ArrayList<>();
        filters.add(new InsensitiveContainsFilter("subtype", "Illusion"));

        List<Card> cards = CardSearchService.findCards(filters, firstRow, maxRows);
        Assert.assertEquals(2, cards.size());
    }
}
