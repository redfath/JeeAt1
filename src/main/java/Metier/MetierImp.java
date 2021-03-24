package Metier;

import Dao.Idao;

public class MetierImp implements IMetier{

    private Idao dao;

    @Override
    public int calcul() {
        return dao.getData() + 2;
    }

    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
