package north.magic.cardtracker;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.config.ServerConfig;
import com.avaje.ebean.config.dbplatform.H2Platform;
import com.avaje.ebeaninternal.api.SpiEbeanServer;
import com.avaje.ebeaninternal.server.ddl.DdlGenerator;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.Before;

/**
 *
 * @author North
 */
public class BaseEbeanTest {

    private static final String dropDdl;
    private static final String createDdl;

    static {
        EbeanServer server = Ebean.getServer("h2");
        DdlGenerator ddlGenerator = new DdlGenerator((SpiEbeanServer) server, new H2Platform(), new ServerConfig());

        dropDdl = ddlGenerator.generateDropDdl();
        createDdl = ddlGenerator.generateCreateDdl();
    }

    @Before
    public void dropCreateDb() throws IOException {
        EbeanServer server = Ebean.getServer("h2");
        server.execute(server.createCallableSql(dropDdl));
        server.execute(server.createCallableSql(createDdl));
    }

    protected void importData(String importFile) throws URISyntaxException, IOException {
        URI resource = getClass().getClassLoader().getResource(importFile).toURI();
        Path path = Paths.get(resource);
        String dataSql = new String(Files.readAllBytes(path));

        EbeanServer server = Ebean.getServer("h2");
        server.execute(server.createCallableSql(dataSql));
    }
}
