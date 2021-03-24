package Presentatin;

import Dao.Daoimpl;
import Dao.Idao;
import Metier.IMetier;
import Metier.MetierImp;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation {
    public static void main(String[] args) {


        try {
            Scanner sc = new Scanner(new File("/home/f/IdeaProjects/JeeA1/src/main/resources/config.txt"));

            Class clsD = Class.forName(sc.nextLine());
            Idao dao = (Idao)clsD.newInstance();

            Class clsM = Class.forName(sc.nextLine());
            IMetier metier = (IMetier) clsM.newInstance();

            Method method = clsM.getMethod("setDao", Idao.class);
            method.invoke(metier, dao);

            System.out.println("calcul : " + metier.calcul());

        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
