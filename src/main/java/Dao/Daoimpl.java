package Dao;

import org.springframework.stereotype.Component;

@Component
public class Daoimpl implements Idao{

    @Override
    public int getData() {
        return 3;
    }
}
