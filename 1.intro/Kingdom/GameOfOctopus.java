public class GameOfOctopus extends Thread {

    @Override
    public void run() {
        //System.out.println("run has been called");


        Octopus otto = new Octopus();
        //System.out.println(otto.isAlive());
        //System.out.println(otto.move());
        // System.out.println(otto.move());
        otto.makeDoActivity();


    }
}
