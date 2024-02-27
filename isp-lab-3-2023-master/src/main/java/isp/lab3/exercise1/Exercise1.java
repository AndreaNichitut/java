package isp.lab3.exercise1;

public class Exercise1 {
    private int height;
    public Exercise1() {
        this.height = 15;
    }
    public void grow(int meters) {
        if (meters >= 1) {
            this.height = this.height + meters;
        }
    }
    public String toString() {
        return "Height of tree: " + this.height + " meters";
    }
    public int getHeight () {
        return this.height;
    }



    public static void main(String[] args) {
        Exercise1 myTree = new Exercise1();
        System.out.println("Initial height of the tree: " + myTree.toString());
        myTree.grow(10);
        System.out.println("New height of the tree: " + myTree.toString());
    }
}

