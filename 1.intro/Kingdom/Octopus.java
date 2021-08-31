public class Octopus extends Animal{
    int act;
    @Override
    public String move(){
        return "Swish Swoosh";
    }

    public void activity(int act){

        switch (act){
            case 1:
                System.out.println("Dancing");
                break;
            case 2:
                System.out.println("Fighting");
                break;
            case 3:
                System.out.println("Sleeping");
                break;
            case 4:
                System.out.println("Laughing");
                break;
            case 5:
                System.out.println("Swooshing");
                break;
            case 6:
                System.out.println("Relaxing");
                break;
            default:
                System.out.println("no activity");
        }

        }

    }

