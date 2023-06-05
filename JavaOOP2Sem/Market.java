
import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private final List<Actor> actors = new ArrayList<>();
    

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + "пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + "вышел из магазина");
            actors.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();

    }

    @Override
    public void takeInQueue(Actor actor) {
        
        this.actors.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : actors) {
            if (!actor.isMakeOrder) {
                actor.setMakeOrder();
                
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : actors) {
            if (actor.isMakeOrder) {
                actor.setTakeOrder();
                
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasesActors = new ArrayList<>();
        for (Actor actor : actors) {
            if (actor.isTakeOrder) {
                releasesActors.add(actor);
                System.out.println(actor.getName() + "вышел из очереди");
            }
        }
        releaseFromMarket(releasesActors);
    }
}