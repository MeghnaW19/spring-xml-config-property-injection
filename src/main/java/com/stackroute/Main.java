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
        Menu secondMenu = xmlBeanFactory.getBean("menu2", Menu.class);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Menu menu1 = applicationContext.getBean("menu2", Menu.class);
        Menu menu2 = applicationContext.getBean("menu2", Menu.class);
        Menu menu3 = applicationContext.getBean("menu3", Menu.class);

        System.out.println(firstMenu.getDish());

        System.out.println(menu1.getDish());
        System.out.println(menu2.getDish());

        System.out.println(menu1==menu2);

        System.out.println(firstMenu==secondMenu);

        System.out.println(menu3.getDish());

    }
}
