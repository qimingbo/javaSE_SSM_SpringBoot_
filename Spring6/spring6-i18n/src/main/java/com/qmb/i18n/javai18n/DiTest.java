package com.qmb.i18n.javai18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class DiTest {
    @Test
    public void testDemo1()
    {
        ResourceBundle bundle1 = ResourceBundle.getBundle("message", new Locale("zh", "CN"));
        ResourceBundle bundle2 = ResourceBundle.getBundle("message", new Locale("en", "US"));
        String str1 = bundle1.getString("main.test");
        String str2 = bundle2.getString("main.test");
        System.out.println(str1);
        System.out.println(str2);

    }
}
