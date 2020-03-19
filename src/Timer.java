public class Timer {
    private static long startTime;
    private static long endTime;


    public static void start() {
        startTime = System.currentTimeMillis();
    }

    public static void stop() {
        endTime = System.currentTimeMillis();
    }
    public static void elapsedTime() {
        System.out.println("the algorithm took: " + (endTime - startTime) + "ms");
    }
}
