package north.magic.cardtracker.criteria.filter;

import north.magic.cardtracker.criteria.Modifier;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.Junction;
import com.avaje.ebean.Query;
import java.util.List;
import north.magic.cardtracker.domain.CardEdition;

/**
 *
 * @author North
 */
public class EditionFilter implements Modifier {

    private List<String> codes;

    public EditionFilter(List<String> codes) {
        this.codes = codes;
    }

    @Override
    public void apply(Query query) {
        Query<CardEdition> subquery = Ebean.createQuery(CardEdition.class);
        subquery.select("card");

        Junction<CardEdition> disjunction = subquery.where().disjunction();
        for (String code : codes) {
            disjunction.contains("expansion.code", code);
        }

        query.where().in("id", subquery);
    }
}
