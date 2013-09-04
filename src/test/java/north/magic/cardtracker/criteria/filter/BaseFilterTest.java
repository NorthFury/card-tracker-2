package north.magic.cardtracker.criteria.filter;

import java.io.IOException;
import java.net.URISyntaxException;
import north.magic.cardtracker.BaseEbeanTest;
import org.junit.Before;

public class BaseFilterTest extends BaseEbeanTest {

    protected static final int firstRow = 0;
    protected static final int maxRows = 10;

    @Before
    public void importData() throws URISyntaxException, IOException {
        importData("testdata/data.sql");
    }
}
