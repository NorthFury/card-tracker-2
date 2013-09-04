package north.magic.cardtracker.criteria;

import com.avaje.ebean.Query;

/**
 *
 * @author North
 */
public interface Criteria {

    void apply(Query query);
}
