// Enums untuk TipeMobil dan StatusMobil
public class Mobil {
    
    public enum TipeMobil {
        SEDAN, SUV, TRUCK, HATCHBACK;
    }

    public enum StatusMobil {
        AVAILABLE, RENTED, MAINTENANCE;
    }

    private String platNomor; // License plate number
    private String merk; // Brand of the car
    private TipeMobil tipeMobil; // Car type (using enum)
    private StatusMobil statusMobil; // Car status (using enum)

    // Constructor
    public Mobil(String platNomor, String merk, TipeMobil tipeMobil, StatusMobil statusMobil) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.tipeMobil = tipeMobil;
        this.statusMobil = statusMobil;
    }

    // Getter and Setter for platNomor
    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    // Getter and Setter for merk
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter and Setter for tipeMobil (enum)
    public TipeMobil getTipeMobil() {
        return tipeMobil;
    }

    public void setTipeMobil(TipeMobil tipeMobil) {
        this.tipeMobil = tipeMobil;
    }

    // Getter and Setter for statusMobil (enum)
    public StatusMobil getStatusMobil() {
        return statusMobil;
    }

    public void setStatusMobil(StatusMobil statusMobil) {
        this.statusMobil = statusMobil;
    }

    // Optional: Method to print out the details of the car
    public void printInfo() {
        System.out.println("Mobil dengan plat: " + platNomor + ", merk: " + merk 
            + ", tipe: " + tipeMobil + ", status: " + statusMobil);
    }
}
