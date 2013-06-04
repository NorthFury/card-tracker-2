package north.magic.cardtracker.filter;

import com.avaje.ebean.Expression;
import com.avaje.ebean.ExpressionFactory;
import com.avaje.ebean.Query;

/**
 *
 * @author North
 */
public class EqualsFilter implements Filter {

    private String propertyName;
    private Object value;

    public EqualsFilter(String propertyName, Object value) {
        this.propertyName = propertyName;
        this.value = value;
    }

    @Override
    public Expression buildExpression(Query query) {
        ExpressionFactory expressionFactory = query.getExpressionFactory();
        return expressionFactory.eq(propertyName, value);
    }
}