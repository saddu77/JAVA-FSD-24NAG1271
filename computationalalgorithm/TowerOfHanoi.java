package computationalalgorithm;

public class TowerOfHanoi {    
    // Method to solve the Tower of Hanoi puzzle
    public static void solveTowerOfHanoi(int n, char sourceRod, 
    		char targetRod, char auxiliaryRod) {
        // Base case: If there's only one disk, 
//    	move it from source to target
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + sourceRod + 
            		" to rod " + targetRod);
            return;
        }
        
        // Move n-1 disks from source to auxiliary, using target as auxiliary
        solveTowerOfHanoi(n - 1, sourceRod, auxiliaryRod, targetRod);
        
        // Move the nth disk from source to target
        System.out.println("Move disk " + n + " from rod " + sourceRod + 
        		" to rod " + targetRod);
        
        // Move the n-1 disks from auxiliary to target, using source as auxiliary
        solveTowerOfHanoi(n - 1, auxiliaryRod, targetRod, sourceRod);
    }
    
    public static void main(String[] args) {
        int numberOfDisks = 3; // Number of disks
        // Solving the puzzle
        solveTowerOfHanoi(numberOfDisks, 'A', 'C', 'B'); // A, B and C are the rods
    }
}

