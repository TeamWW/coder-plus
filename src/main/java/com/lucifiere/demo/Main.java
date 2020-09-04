package com.lucifiere.demo;

import com.lucifiere.bootstrap.DefaultBootstrap;

@SuppressWarnings("Duplicates")
public class Main {

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
