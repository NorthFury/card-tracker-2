package north.magic.cardtracker.filter;

import com.avaje.ebean.Expression;
import com.avaje.ebean.ExpressionFactory;
import com.avaje.ebean.Junction;
import com.avaje.ebean.Query;
import java.util.List;

/**
 *
 * @author North
 */
public class CardTypeFilter implements Filter {

    private List<String> values;

    public CardTypeFilter(List<String> values) {
        this.values = values;
    }

    @Override
    public Expression buildExpression(Query query) {
        ExpressionFactory expressionFactory = query.getExpressionFactory();
        Junction disjunction = expressionFactory.disjunction(query);
        for (String type : values) {
            disjunction.contains("type", type);
        }
        return disjunction;
    }
}
