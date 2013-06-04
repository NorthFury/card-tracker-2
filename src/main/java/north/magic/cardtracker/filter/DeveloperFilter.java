package north.magic.cardtracker.filter;

import com.avaje.ebean.Expression;
import com.avaje.ebean.ExpressionFactory;
import com.avaje.ebean.Query;
import java.util.List;

/**
 *
 * @author North
 */
public class DeveloperFilter implements Filter {

    private List<Long> values;

    public DeveloperFilter(List<Long> values) {
        this.values = values;
    }

    @Override
    public Expression buildExpression(Query query) {
        ExpressionFactory expressionFactory = query.getExpressionFactory();
        return expressionFactory.in("status.account.id", values);
    }
}
