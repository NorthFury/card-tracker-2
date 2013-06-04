package north.magic.cardtracker;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.Query;
import com.avaje.ebean.Transaction;
import java.util.List;
import north.magic.cardtracker.domain.Account;
import north.magic.cardtracker.domain.Card;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest extends BaseEbeanTest {

    @Test
    public void testBasicOperations() {

        Account e = buildAccount(-1);

        // Get the default EbeanServer and save
        EbeanServer server = Ebean.getServer(null);
        server.save(e);
        Assert.assertNotNull(e.getId());

        e.setEmail("banana");
        server.update(e);

        // find by id
        Account e2 = server.find(Account.class, e.getId());
        Assert.assertNotNull("we found it in the db", e2);
        Assert.assertTrue("different instance", e2 != e);
        Assert.assertEquals("updated description", "banana", e2.getEmail());

        server.delete(e2);

        Account e3 = server.find(Account.class, e.getId());
        Assert.assertNull("its been deleted", e3);

        Query<Card> query = Ebean.find(Card.class);
    }

    @Test
    public void testBatch() {
        int rowsNumber = 100;

        EbeanServer server = Ebean.getServer(null);
        Transaction transaction = server.beginTransaction();
        transaction.setBatchMode(true);
        transaction.setBatchSize(30);
        try {
            for (int i = 0; i < rowsNumber; i++) {
                server.save(buildAccount(i));
            }
            server.commitTransaction();
        } finally {
            server.endTransaction();
        }
        List<Account> all = server.find(Account.class).select("name").findList();
        Assert.assertEquals("Batch update", rowsNumber, all.size());
    }

    private Account buildAccount(int i) {
        Account account = new Account();
        account.setEmail("email" + i);
        account.setName("name" + i);
        account.setPassword("password" + i);
        return account;
    }
}
