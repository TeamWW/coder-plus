import com.lucifiere.bootstrap.CodeGenerator;
import com.lucifiere.templates.embed.BaseTemplatesConfig;
import org.junit.Test;

/**
 * @author created by XD.Wang
 * Date 2020/9/4.
 */
public class BasicTest {

    @Test
    public void testBootstrap() {
        var myBootstrap = new CodeGenerator();
        myBootstrap.setDdlName("ddl.sql")
                .setWorkspacePath("/Users/wangxiandui/Documents/gen-codes");
        myBootstrap.execute(BaseTemplatesConfig.BASE_POJO);
    }

}
