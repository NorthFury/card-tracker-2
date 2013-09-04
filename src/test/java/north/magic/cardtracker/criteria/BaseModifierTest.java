package north.magic.cardtracker.criteria;

import java.io.IOException;
import java.net.URISyntaxException;
import north.magic.cardtracker.BaseEbeanTest;
import org.junit.Before;

public class BaseModifierTest extends BaseEbeanTest {

    @Before
    public void importData() throws URISyntaxException, IOException {
        importData("testdata/data.sql");
    }
}
