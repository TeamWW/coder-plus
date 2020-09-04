package com.lucifiere.demo;

import com.lucifiere.bootstrap.DefaultBootstrap;

@SuppressWarnings("Duplicates")
public class Main {

//    public    ) engine=innodb auto_increment=21438132 default charset=utf8 comment='券码表';""";
//        // 将代码文本导入Antlr自建流中
//        var input = CharStreams.fromString(sql.toUpperCase());
//        // 词法解析
//        var lexer = new MySqlLexer(input);
//        var tokens = new CommonTokenStream(lexer);
//        // 语法解析
//        var parser = new MySqlParser(tokens);
//        // 指定根语法节点
//        MySqlParser.CreateTableContext ctDdlTree = parser.createTable();
//        // 创建一个树遍历器
//        var walker = new ParseTreeWalker();
//        var model = new TableModel();
//        var listener = new AntlrResolver(model);
//        // 注册回调，开始遍历树
//        walker.walk(listener, ctDdlTree);
//        System.out.println(listener.getTableModel().toString());
//    }

    public static void main(String[] args) {
        var myBootstrap = new DefaultBootstrap();
        myBootstrap.setDdlName("sda")
                .setInputPath("31231")
                .setOutputPath("asdsa")
                .setTemplatesPath("asdas")
                .setWorkspacePath("3123");
        myBootstrap.execute("template1", "template2", "template3");
    }

}
