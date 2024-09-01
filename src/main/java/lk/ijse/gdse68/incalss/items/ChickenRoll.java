package lk.ijse.gdse68.incalss.items;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Most Like")
public class ChickenRoll implements BakeryItems{
    @Override
    public void preference() {
        System.out.println("Chicken Roll");
    }
}

