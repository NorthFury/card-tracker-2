package north.magic.cardtracker.filter;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.Expression;
import com.avaje.ebean.ExpressionFactory;
import com.avaje.ebean.Junction;
import com.avaje.ebean.Query;
import java.util.List;
import north.magic.cardtracker.domain.CardEdition;

/**
 *
 * @author North
 */
public class EditionFilter implements Filter {

    private List<String> codes;

    public EditionFilter(List<String> codes) {
        this.codes = codes;
    }

    @Override
    public Expression buildExpression(Query query) {
        EbeanServer server = Ebean.getServer(null);
        Query<CardEdition> subquery = server.createQuery(CardEdition.class);
        subquery.select("card");

        ExpressionFactory expressionFactory = server.getExpressionFactory();
        Junction disjunction = expressionFactory.disjunction(subquery);
        for (String code : codes) {
            disjunction.contains("expansion.code", code);
        }
        subquery.where(disjunction);

        return expressionFactory.in("id", subquery);
    }
}
