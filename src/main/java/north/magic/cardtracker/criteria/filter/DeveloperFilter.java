package north.magic.cardtracker.criteria.filter;

import north.magic.cardtracker.criteria.Criteria;
import com.avaje.ebean.Query;
import java.util.List;

/**
 *
 * @author North
 */
public class DeveloperFilter implements Criteria {

    private List<Long> values;

    public DeveloperFilter(List<Long> values) {
        this.values = values;
    }

    @Override
    public void apply(Query query) {
        query.where().in("status.account.id", values);
    }
}
