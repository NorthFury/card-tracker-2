package north.magic.cardtracker.filter;

import com.avaje.ebean.Expression;
import com.avaje.ebean.Query;

/**
 *
 * @author North
 */
public interface Filter {

    Expression buildExpression(Query query);
}
