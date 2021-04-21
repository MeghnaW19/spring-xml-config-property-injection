package com.stackroute;

import com.stackroute.domain.Menu;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));

        Menu firstMenu = xmlBeanFactory.getBean("menu1", Menu.class);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Menu menu = (Menu) applicationContext.getBean("menu1");

        System.out.println(firstMenu.getDish());
        System.out.println(menu.getDish());

    }
}
