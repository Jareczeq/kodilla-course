package pl.jareczeq.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task makeTask(String className, String arg1, String arg2, String arg3) {
        return switch(className) {
            case "SHOPPING_TASK" -> new ShoppingTask(arg1, arg2, Double.parseDouble(arg3));
            case "PAINTING_TASK" -> new PaintingTask(arg1, arg2, arg3);
            case "DRIVING_TASK" -> new DrivingTask(arg1, arg2, arg3);
            default -> null;
        };
    }

}
