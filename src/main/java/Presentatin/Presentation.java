package Presentatin;

import Dao.Daoimpl;
import Dao.Idao;
import Metier.IMetier;
import Metier.MetierImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation {
    public static void main(String[] args) {

        ApplicationContext context=new
                ClassPathXmlApplicationContext("configbean.xml");
        IMetier metier=(IMetier) context.getBean("metier");
        System.out.println(metier.calcul());


    }
}
