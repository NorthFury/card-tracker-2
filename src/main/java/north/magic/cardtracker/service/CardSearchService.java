package north.magic.cardtracker.service;

import north.magic.cardtracker.filter.Filter;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.Junction;
import com.avaje.ebean.Query;
import java.util.List;
import north.magic.cardtracker.domain.Card;
import north.magic.cardtracker.order.NoSearchOrder;
import north.magic.cardtracker.order.SearchOrder;

/**
 *
 * @author North
 */
public class CardSearchService {

    public static List<Card> findCards(List<Filter> filters, int firstRow, int maxRows) {
        NoSearchOrder noSearchOrder = new NoSearchOrder();
        return findCards(filters, noSearchOrder, firstRow, maxRows);
    }

    public static List<Card> findCards(List<Filter> filters, SearchOrder order, int firstRow, int maxRows) {
        EbeanServer server = Ebean.getServer(null);
        Query<Card> query = server.find(Card.class);

        Junction<Card> junction = query.where().conjunction();
        for (Filter filter : filters) {
            junction.add(filter.buildExpression(query));
        }

        query.setFirstRow(firstRow);
        query.setMaxRows(maxRows);

        order.apply(query);

        return query.findList();
    }
}
