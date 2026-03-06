package task2;

public class LegoBlocksContainers {
    public static void main(String[] args){

        int amountofbricks =63;
        System.out.println("Number of Lego bricks: " + amountofbricks);
        int containercapacity = 6;
        System.out.println("Each container can hold: " + containercapacity + " bricks");

        int fullContainers = amountofbricks / containercapacity;
        System.out.println("Each container can hold: " + containercapacity + " bricks");
        int remainingBricks = amountofbricks % containercapacity;
        System.out.println("Remaining bricks: " + remainingBricks);
        int totalContainers = remainingBricks > 0 ? fullContainers + 1 : fullContainers;
        System.out.println("Total containers needed: " + totalContainers);



    }
}