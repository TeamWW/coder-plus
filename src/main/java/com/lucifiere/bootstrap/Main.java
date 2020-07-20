package com.lucifiere.bootstrap;

import cn.hutool.json.JSONUtil;
import com.lucifiere.antlr.*;
import com.lucifiere.extract.table.TableModel;
import com.lucifiere.resovler.AntlrResolver;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

    public static void main(String[] args) {
        String sql = """
CREATE TABLE `coupon_couponinfo` (
                  `id` bigint(20) not null auto_increment comment '主键id',
                  `flow_code` varchar(50) character set utf8 collate utf8_bin default null,
                  `coupon_code` varchar(50) character set utf8 collate utf8_bin not null,
                  `template_type` int(11) not null comment '券模板类型(也是券类型)',
                  `template_code` bigint(20) not null comment '券模板code',
                  `product_type` int(11) not null comment '券应用的商品类别(1.电影票，2.卖品)',
                  `batch_code` bigint(20) default null comment '批次码',
                  `coupon_name` varchar(20) character set utf8 collate utf8_bin not null comment '券外部名称',
                  `price` bigint(20) not null comment '面值',
                  `start_time` datetime not null comment '券有效开始时间',
                  `end_time` datetime not null comment '券有效结束时间',
                  `base_price` bigint(20) not null comment '基础价格',
                  `state` int(11) not null comment '券状态(1.有效，2.已核销，3.作废，4.已锁定 5.已过期 6.未激活)',
                  `issuer` varchar(10) character set utf8 collate utf8_bin default null comment '发行方',
                  `create_user` varchar(32) character set utf8 collate utf8_bin not null comment '创建人',
                  `gmt_create` datetime not null comment '创建时间',
                  `modify_user` varchar(32) character set utf8 collate utf8_bin default null comment '修改人',
                  `gmt_modify` datetime default null comment '修改时间',
                  `gmt_check` datetime default null comment '核销时间',
                  `check_channel` varchar(50) character set utf8 collate utf8_bin default null comment '核销渠道',
                  `system_source` int(11) not null comment '券系统来源(1.会员，2.营销，3.第三方,4.批次发券,5.手动发券，7.销售单，8.pos)',
                  `source_code` varchar(50) character set utf8 collate utf8_bin default null comment '来源系统code(会员发券类型，营销活动id)',
                  `account_id` varchar(50) character set utf8 collate utf8_bin default null comment '会员id',
                  `extension` varchar(2000) character set utf8 collate utf8_bin default null comment '扩展字段',
                  `coupon_snapshot` varchar(4000) character set utf8 collate utf8_bin default null comment '券信息',
                  `film_upgrade_policy` varchar(1000) character set utf8 collate utf8_bin default null comment '影片升级策略',
                  `lease_code` varchar(20) character set utf8 collate utf8_bin default null comment '租户编码',
                  `reprice_coupon_price` bigint(20) default null comment '重新定价券新定价（只指针对重新定价券，其他券类型无意义）',
                  `print_count` int(11) default '0' comment '打印次数',
                  `print_state` int(11) default '1' comment '打印状态（1：未打印、2：已打印）',
                  `compensate_party` int(11) default '1' comment '补差方',
                  `index_no` varchar(20) character set utf8 collate utf8_bin default null comment '预制券码流水号',
                  `prefix` varchar(20) character set utf8 collate utf8_bin default null comment '预制券码前缀',
                  `detail_source_code` varchar(30) character set utf8 collate utf8_bin default null comment 'source_code粒度太粗，再细一点的在这里'
                ) engine=innodb auto_increment=21438132 default charset=utf8 comment='券码表';""";
        // 将代码文本导入Antlr自建流中
        var input = CharStreams.fromString(sql.toUpperCase());
        // 词法解析
        var lexer = new MySqlLexer(input);
        var tokens = new CommonTokenStream(lexer);
        // 语法解析
        var parser = new MySqlParser(tokens);
        // 指定根语法节点
        MySqlParser.CreateTableContext ctDdlTree = parser.createTable();
        // 创建一个树遍历器
        var walker = new ParseTreeWalker();
        var model = new TableModel();
        var listener = new AntlrResolver(model);
        // 注册回调，开始遍历树
        walker.walk(listener, ctDdlTree);
        System.out.println(listener.getTableModel().toString());
    }

}
