package north.magic.cardtracker.service;

import north.magic.cardtracker.filter.Filter;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.Query;
import java.util.ArrayList;
import java.util.List;
import north.magic.cardtracker.criteria.Criteria;
import north.magic.cardtracker.domain.Card;

/**
 *
 * @author North
 */
public class CardSearchService {

    public static List<Card> findCards(List<Filter> filters, int firstRow, int maxRows) {
        return findCards(filters, new ArrayList(), firstRow, maxRows);
    }

    public static List<Card> findCards(List<Filter> filters, List<Criteria> criaterias, int firstRow, int maxRows) {
        EbeanServer server = Ebean.getServer(null);
        Query<Card> query = server.find(Card.class);

        for (Filter filter : filters) {
            filter.apply(query);
        }

        query.setFirstRow(firstRow);
        query.setMaxRows(maxRows);

        for (Criteria criteria : criaterias) {
            criteria.apply(query);
        }

        return query.findList();
    }
}
