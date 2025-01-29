package TypeRepeatingAnnotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Repeatable;
import java .lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Repeatable(Schedules.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Schedule {
    String dayOfWeek() default "Mon";
    int hour() default 12;
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Schedules {
    Schedule[] value();
}
class RepeatingAnnotationsExample {
    @Schedule(dayOfWeek = "Mon", hour = 9)
    @Schedule(dayOfWeek = "Wed", hour = 10)
    public void doTask() {
        System.out.println("Performing task...");
    }
    public static void main(String[] args) {
        RepeatingAnnotationsExample example = new RepeatingAnnotationsExample();
        try {
            var method = example.getClass().getMethod("doTask");
            Schedules schedules = method.getAnnotation(Schedules.class);
            if (schedules != null) {
                for (Schedule schedule : schedules.value()) {
                    System.out.println("Task scheduled on " + schedule.dayOfWeek() + " at " + schedule.hour() + ":00");
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
