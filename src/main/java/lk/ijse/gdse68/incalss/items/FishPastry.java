package lk.ijse.gdse68.incalss.items;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishPastry implements BakeryItems{
    @Override
    public void preference() {
        System.out.println("Fish Pastry");
    }
}

