package Presentatin;

import Dao.Daoimpl;
import Dao.Idao;
import Metier.IMetier;
import Metier.MetierImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation {
    public static void main(String[] args) {

        ApplicationContext ctx=new AnnotationConfigApplicationContext("Dao","Metier");
        IMetier metier = ctx.getBean(IMetier.class);
        System.out.println(metier.calcul());

    }
}
