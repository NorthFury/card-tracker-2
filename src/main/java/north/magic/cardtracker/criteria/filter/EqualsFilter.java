package north.magic.cardtracker.criteria.filter;

import north.magic.cardtracker.criteria.Modifier;
import com.avaje.ebean.Query;

/**
 *
 * @author North
 */
public class EqualsFilter implements Modifier {

    private String propertyName;
    private Object value;

    public EqualsFilter(String propertyName, Object value) {
        this.propertyName = propertyName;
        this.value = value;
    }

    @Override
    public void apply(Query query) {
        query.where().eq(propertyName, value);
    }
}
