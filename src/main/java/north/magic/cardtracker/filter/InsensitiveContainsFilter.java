package north.magic.cardtracker.filter;

import com.avaje.ebean.Expression;
import com.avaje.ebean.ExpressionFactory;
import com.avaje.ebean.Query;

/**
 *
 * @author North
 */
public class InsensitiveContainsFilter implements Filter {

    private String propertyName;
    private String value;

    public InsensitiveContainsFilter(String propertyName, String value) {
        this.propertyName = propertyName;
        this.value = value;
    }

    @Override
    public Expression buildExpression(Query query) {
        ExpressionFactory expressionFactory = query.getExpressionFactory();
        return expressionFactory.icontains(propertyName, value);
    }
}
