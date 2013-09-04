package north.magic.cardtracker.filter;

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
    public void apply(Query query) {
        Junction disjunction = query.where().disjunction();
        for (String type : values) {
            disjunction.contains("type", type);
        }
    }
}
