package PBOP6;

public class UbahNilai {
    String[] mobil = {
        "Tesla", "Suzuki", "Civic", "Mazda", "BMW"
    };

    public void ubahMobil() {
        mobil[1] = "Honda";

        System.out.println(mobil[1]);
    }
}
