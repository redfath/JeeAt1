package Metier;

import Dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImp implements IMetier{

    @Autowired
    private Idao dao;

    @Override
    public int calcul() {
        return dao.getData() + 2;
    }

    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
