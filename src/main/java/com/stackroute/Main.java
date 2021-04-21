package com.stackroute;

import com.stackroute.domain.Menu;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));

        Menu firstMenu = (Menu) xmlBeanFactory.getBean("menu1");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Menu menu = (Menu) applicationContext.getBean("menu2");
        System.out.println(firstMenu.getDish());
        System.out.println(menu.getDish());

    }
}