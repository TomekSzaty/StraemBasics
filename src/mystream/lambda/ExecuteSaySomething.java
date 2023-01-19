package mystream.lambda;

public class ExecuteSaySomething implements Executor{
    @Override
    public void process() {
        System.out.println("Simon say something");
    }
}
