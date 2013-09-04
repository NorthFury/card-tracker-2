package north.magic.cardtracker.filter;

import com.avaje.ebean.Query;

/**
 *
 * @author North
 */
public interface Filter {

    void apply(Query query);
}
