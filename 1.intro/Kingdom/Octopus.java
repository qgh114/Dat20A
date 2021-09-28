import java.util.Random;

public class Octopus extends Animal {
    int act;

    @Override
    public String move() {
        return "Swish Swoosh";
    }

    private static final Random random = new Random();
    private static final int min = 1;
    private static final int max = 10;


    public void makeDoActivity() {
        while (true) {
            try {
                String activity = activity();
                System.out.println(activity());
                if (activity.equals("Mate")) {
                    GameOfOctopus gameThread = new GameOfOctopus();
                    gameThread.start();
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(activity());
        }
    }


    private String activity() {
        String activity = null;

        int activityNumber = random.nextInt(max) + min;
        switch (activityNumber) {
            case 1:
                activity = "Dancing";
                //System.out.println("Dancing");
                break;
            case 2:
                activity = "Fighting";
                //System.out.println("Fighting");
                break;
            case 3:
                activity = "Sleeping";
                // System.out.println("Sleeping");
                break;
            case 4:
                activity = "Laughing";
                //System.out.println("Laughing");
                break;
            case 5:
                activity = "Swooshing";
                //System.out.println("Swooshing");
                break;
            case 6:
                activity = "Mate";
                // System.out.println("Relaxing");
                break;
            default:
                activity = "no activity";
                //System.out.println("no activity");
        }
        return activity;

    }

}

