package north.magic.cardtracker.service;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Query;
import java.util.List;
import north.magic.cardtracker.criteria.Modifier;
import north.magic.cardtracker.domain.Card;

/**
 *
 * @author North
 */
public class CardSearchService {

    public static List<Card> findCards(List<Modifier> modifiers) {
        Query<Card> query = Ebean.find(Card.class);

        for (Modifier modifier : modifiers) {
            modifier.apply(query);
        }

        return query.findList();
    }
}
