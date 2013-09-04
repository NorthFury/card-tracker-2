package north.magic.cardtracker.service;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.Query;
import java.util.List;
import north.magic.cardtracker.criteria.Modifier;
import north.magic.cardtracker.domain.Card;

/**
 *
 * @author North
 */
public class CardSearchService {

    public static List<Card> findCards(List<Modifier> modifiers, int firstRow, int maxRows) {
        EbeanServer server = Ebean.getServer(null);
        Query<Card> query = server.find(Card.class);

        query.setFirstRow(firstRow);
        query.setMaxRows(maxRows);

        for (Modifier modifier : modifiers) {
            modifier.apply(query);
        }

        return query.findList();
    }
}
