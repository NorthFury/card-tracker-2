package north.magic.cardtracker.order;

import com.avaje.ebean.Query;

/**
 *
 * @author North
 */
public class NoSearchOrder implements SearchOrder {

    @Override
    public void apply(Query query) {
    }
}
