import cn.hutool.json.JSONUtil;
import com.dlin.model.Model;
import com.dlin.resovler.Resolver;
import com.dlin.resovler.antlr.AntlrThriftResolver;
import org.junit.Test;

/**
 * @author created by XD.Wang
 * Date 2020/12/16.
 */
public class ResolverTest {

    @Test
    public void testThriftResolver() {
        String s = "namespace java com.sankuai.meituan.waimai.decoration.core.api.response\n" +
                "\n" +
                "include '../enums/PageType.thrift'\n" +
                "include '../enums/DataSourceEnum.thrift'\n" +
                "include '../enums/MaterialType.thrift'\n" +
                "include '../enums/MaterialStatus.thrift'\n" +
                "include '../enums/VerifyStatus.thrift'\n" +
                "include '../enums/BindType.thrift'\n" +
                "include '../enums/MediaType.thrift'\n" +
                "include '../enums/MaterialDisplayStatus.thrift'\n" +
                "\n" +
                "struct DecrCoreMaterialBindingResult {\n" +
                "\n" +
                "        0: i64 materialId;\n" +
                "        1: i64 wmPoiId;\n" +
                "        2: BindType.BindingType type;\n" +
                "        3: string content;\n" +
                "\n" +
                "}\n" +
                "\n" +
                "struct MaterialSubTypeResult {\n" +
                "        0: i32 code;\n" +
                "        1: string desc;\n" +
                "        2: string source;\n" +
                "}\n" +
                "\n" +
                "struct DecrCoreMaterialMediaResult {\n" +
                "\n" +
                "        0: i64 materialId;\n" +
                "        1: i64 wmPoiId;\n" +
                "        2: VerifyStatus.VerifyStatus verifyStatus;\n" +
                "        3: MediaType.MediaType type;\n" +
                "        4: string content;\n" +
                "        5: string errorMessage;\n" +
                "\n" +
                "}\n" +
                "\n" +
                "struct DecrCoreMaterialTimeSupplyRuleResult {\n" +
                "\n" +
                "        0: string startDate;\n" +
                "        1: string endDate;\n" +
                "        2: string startTime;\n" +
                "        3: string endTime;\n" +
                "        4: list<i32> weeks;\n" +
                "\n" +
                "}\n" +
                "\n" +
                "struct DecrCoreMaterialSupplyRuleResult {\n" +
                "\n" +
                "        0: DecrCoreMaterialTimeSupplyRuleResult timeSupplyRule;\n" +
                "\n" +
                "}\n" +
                "\n" +
                "struct DecrCoreMaterialResult {\n" +
                "\n" +
                "        0: i64 materialId;\n" +
                "        1: i32 sequence;\n" +
                "        2: i64 wmPoiId;\n" +
                "        3: i64 gmtCreate;\n" +
                "        4: i64 gmtModified;\n" +
                "        5: i64 creatorId;\n" +
                "        6: i64 modifierId;\n" +
                "        7: PageType.PageType pageType;\n" +
                "        8: DataSourceEnum.DataSourceEnum source;\n" +
                "        9: MaterialType.MaterialType materialType;\n" +
                "        10: MaterialSubTypeResult materialSubType;\n" +
                "        11: VerifyStatus.VerifyStatus verifyStatus;\n" +
                "        12: MaterialStatus.MaterialStatus status;\n" +
                "        13: list<DecrCoreMaterialBindingResult> bindingList;\n" +
                "        14: list<DecrCoreMaterialMediaResult> mediaList;\n" +
                "        15: DecrCoreMaterialTimeSupplyRuleResult supplyRule;\n" +
                "\n" +
                "}\n";
        Resolver r = new AntlrThriftResolver();
        Model m = r.resolve(s);
        System.out.println(JSONUtil.toJsonStr(m));
    }

}
