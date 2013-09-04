package north.magic.cardtracker.criteria.filter;

import north.magic.cardtracker.criteria.Modifier;
import com.avaje.ebean.Query;

/**
 *
 * @author North
 */
public class InsensitiveContainsFilter implements Modifier {

    private String propertyName;
    private String value;

    public InsensitiveContainsFilter(String propertyName, String value) {
        this.propertyName = propertyName;
        this.value = value;
    }

    @Override
    public void apply(Query query) {
        query.where().icontains(propertyName, value);
    }
}
