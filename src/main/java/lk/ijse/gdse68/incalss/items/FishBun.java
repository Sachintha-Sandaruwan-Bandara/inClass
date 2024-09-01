package lk.ijse.gdse68.incalss.items;

import org.springframework.stereotype.Component;

@Component
public class FishBun implements BakeryItems{
    @Override
    public void preference() {
        System.out.println("Fish Bun");
    }
}

