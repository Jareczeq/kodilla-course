package pl.jareczeq.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    private boolean executed = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Buy " + String.format("%,.0f", quantity) + " pieces" + " of " + whatToBuy);
        executed = true;
        System.out.println(String.format("%,.0f", quantity) + " pieces" + " of " + whatToBuy + " has been bought");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}