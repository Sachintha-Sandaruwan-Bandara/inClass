package lk.ijse.gdse68.incalss.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.gdse68.incalss.items.BakeryItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Kusal {

    @Autowired
    @Qualifier("Most Like")
    private BakeryItems bakeryItems;


    @PostConstruct
    public void init(){
      bakeryItems.preference();
    }


}

