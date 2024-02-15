public class Endings {
    
    //Player decides to go back to bed
    public static void b2b() throws InterruptedException{
        System.out.println("\n> You decide that getting the "+ ConsoleColors.WHITE_BOLD_BRIGHT + "Donut" + ConsoleColors.RESET +" is too much effort right now and is not worth the effort.");
        System.out.println("ENDING: Back to Bed");
        Thread.sleep(4000);
        Inventory.resetInventory();      
        Main.start();
    }

    
    //Player find the hidden donut
    public static void hidden() throws InterruptedException{
        System.out.println("\n> You have found a "+ ConsoleColors.WHITE_BOLD_BRIGHT + "Donut" + ConsoleColors.RESET +"! It might not be THE "+ ConsoleColors.WHITE_BOLD_BRIGHT + "Donut" + ConsoleColors.RESET +" but it will suffice"); 
        System.out.println("ENDING: Hidden "+ ConsoleColors.WHITE_BOLD_BRIGHT + "Donut" + ConsoleColors.RESET);
        Thread.sleep(4000);
        Inventory.resetInventory();
        Main.start();
    }

    
    //Player completes their goal of obtaining their donut
    public static void spaceDonut() throws InterruptedException{
        System.out.println("\n> You have done it, after collecting the space suit parts you made it into space and got your "+ ConsoleColors.WHITE_BOLD_BRIGHT + "Donut" + ConsoleColors.RESET +"."); 
        Thread.sleep(1500);
        System.out.println("> Was it worth all that effort? You like to tell yourself that it was");
        System.out.println("ENDING: Space "+ ConsoleColors.WHITE_BOLD_BRIGHT + "Donut" + ConsoleColors.RESET);
        Thread.sleep(4000);
        Inventory.resetInventory();
        Main.start();
    }


    //Player decides to leave without their spacesuit
    public static void dead() throws InterruptedException{
        System.out.println("\n> Oh no.. you forgot your spacesuit. No "+ ConsoleColors.WHITE_BOLD_BRIGHT + "Donuts" + ConsoleColors.RESET +" for you.... forever"); 
        System.out.println("ENDING: Deadly "+ ConsoleColors.WHITE_BOLD_BRIGHT + "Donut" + ConsoleColors.RESET);
        Thread.sleep(4000);
        Inventory.resetInventory();
        Main.start();
    }
    
    }
