package Presentatin;

import Dao.Daoimpl;
import Metier.MetierImp;

public class Presentation {
    public static void main(String[] args) {
        Daoimpl dao = new Daoimpl();

        MetierImp metier = new MetierImp();

        metier.setDao(dao);

        System.out.println("calcul : " + metier.calcul());
    }
}
