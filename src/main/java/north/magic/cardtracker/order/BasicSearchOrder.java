package north.magic.cardtracker.order;

import com.avaje.ebean.OrderBy;
import com.avaje.ebean.Query;

/**
 *
 * @author North
 */
public class BasicSearchOrder implements SearchOrder {

    private String propertyName;
    private OrderDirection direction;

    public BasicSearchOrder(String propertyName, OrderDirection direction) {
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
