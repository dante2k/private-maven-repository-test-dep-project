package org.example;

import net.wholedoc.util.StringUtils;

public class Main {
    public static void main(String[] args) {
        String content = "TEST";

        System.out.println(
            "content is blank: " + StringUtils.isBlank(content)
        );
    }
}