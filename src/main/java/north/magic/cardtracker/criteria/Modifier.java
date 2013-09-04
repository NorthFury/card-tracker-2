package north.magic.cardtracker.criteria;

import com.avaje.ebean.Query;

/**
 *
 * @author North
 */
public interface Modifier {

    void apply(Query query);
}
