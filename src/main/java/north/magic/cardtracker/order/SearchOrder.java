package north.magic.cardtracker.order;

import com.avaje.ebean.Query;

/**
 *
 * @author North
 */
public interface SearchOrder {

    void apply(Query query);
}
