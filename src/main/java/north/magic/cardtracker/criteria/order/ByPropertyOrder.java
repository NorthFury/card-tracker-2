package north.magic.cardtracker.criteria.order;

import com.avaje.ebean.OrderBy;
import com.avaje.ebean.Query;
import north.magic.cardtracker.criteria.Modifier;

/**
 *
 * @author North
 */
public class ByPropertyOrder implements Modifier {

    private String propertyName;
    private OrderDirection direction;

    public ByPropertyOrder(String propertyName, OrderDirection direction) {
        this.propertyName = propertyName;
        this.direction = direction;
    }

    @Override
    public void apply(Query query) {
        OrderBy order = query.order();
        if (OrderDirection.ASCENDING.equals(direction)) {
            order.asc(propertyName);
        } else {
            order.desc(propertyName);
        }
    }
}
