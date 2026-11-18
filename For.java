package PBOP6;

public class For {
    int[] umur = {12, 4, 5, 2, 6};

    public void For() {
        for (int i = 0; i < umur.length; i++) {
            System.out.println(umur[i]);
        }
    }

    public void EnhancedFor() {

        for (int nilai : umur) {
            System.out.println(nilai);
        }
    }
}

