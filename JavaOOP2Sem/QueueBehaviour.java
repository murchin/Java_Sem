
public interface QueueBehaviour {

    void takeInQueue(Actor actor);  // создаем очередь
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();

}