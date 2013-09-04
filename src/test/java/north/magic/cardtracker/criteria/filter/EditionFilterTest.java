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
public class EditionFilterTest extends BaseModifierTest {

    @Test
    public void testEditionFilter() {
        ArrayList<String> editions = new ArrayList<>();
        editions.add("M11");
        editions.add("M12");

        ArrayList<Modifier> filters = new ArrayList<>();
        filters.add(new EditionFilter(editions));

        List<Card> cards = CardSearchService.findCards(filters);

        Assert.assertEquals(10, cards.size());
    }
}
