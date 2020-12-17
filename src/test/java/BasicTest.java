import com.dlin.bootstrap.IdlBasedCodeGenerator;
import com.dlin.bootstrap.SqlBasedCodeGenerator;
import com.dlin.templates.embed.EmbedTemplates;
import org.junit.Test;

/**
 * @author created by XD.Wang
 * Date 2020/9/4.
 */
public class BasicTest {

    @Test
    public void testBootstrap() {
        SqlBasedCodeGenerator myBootstrap = new SqlBasedCodeGenerator();
        myBootstrap.setDdlName("ddl.sql")
                .setWorkspacePath("/Users/wangxiandui/Documents/gen-codes");
        myBootstrap.execute(EmbedTemplates.MODEL);
    }

    @Test
    public void testBootstrap1() {
        IdlBasedCodeGenerator myBootstrap = new IdlBasedCodeGenerator();
        myBootstrap.setIdlName("idl.thrift")
                .setWorkspacePath("/Users/wangxiandui/Documents/gen-codes");
        myBootstrap.execute(EmbedTemplates.THRIFT_DELEGATE);
    }

}
