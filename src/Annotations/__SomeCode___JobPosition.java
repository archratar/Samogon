package Annotations;

public class __SomeCode___JobPosition {

    @Position()
    String position;

    private void d() {
        try {
            this.position = Class.forName("Annotations.Miner").getDeclaredField("position").getAnnotation(Position.class).value();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
