package north.magic.cardtracker.criteria.filter;

import com.avaje.ebean.Query;

/**
 *
 * @author North
 */
public interface Filter {

    void apply(Query query);
}
