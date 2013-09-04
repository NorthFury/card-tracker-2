package north.magic.cardtracker.criteria.filter;

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
public class DeveloperFilterTest extends BaseFilterTest {

    @Test
    public void testDeveloperFilter() {
        ArrayList<Long> developers = new ArrayList<>();
        developers.add(1l);
        developers.add(2l);

        ArrayList<Modifier> filters = new ArrayList<>();
        filters.add(new DeveloperFilter(developers));

        List<Card> cards = CardSearchService.findCards(filters, firstRow, maxRows);
        Assert.assertEquals(4, cards.size());
    }
}
