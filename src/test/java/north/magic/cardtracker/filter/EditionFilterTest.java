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
public class EditionFilterTest extends BaseFilterTest {

    @Test
    public void testEditionFilter() {
        ArrayList<String> editions = new ArrayList<>();
        editions.add("M11");
        editions.add("M12");

        ArrayList<Filter> filters = new ArrayList<>();
        filters.add(new EditionFilter(editions));

        List<Card> cards = CardSearchService.findCards(filters, firstRow, maxRows);

        Assert.assertEquals(10, cards.size());
    }
}
