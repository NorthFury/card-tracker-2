package north.magic.cardtracker.criteria;

import com.avaje.ebean.Query;

/**
 *
 * @author North
 */
public class PaginationModifier implements Modifier {

    private int firstRow;
    private int maxRows;

    public PaginationModifier(int page, int rows) {
        this.firstRow = page * rows;
        this.maxRows = rows;
    }

    @Override
    public void apply(Query query) {
        query.setFirstRow(firstRow);
        query.setMaxRows(maxRows);
    }
}
