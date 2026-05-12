// ============================================================
//  VehicleManagementSystem.java  –  Driver / Main class
// ============================================================

public class VehicleManagementSystem {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║       VEHICLE  MANAGEMENT  SYSTEM            ║");
        System.out.println("╚══════════════════════════════════════════════╝\n");

        // ── 1. Display initial (static) fuel price ──────────
        System.out.println("► Initial Fuel Price (static, shared by all vehicles)");
        System.out.printf( "  ₹%.2f per litre%n%n", Vehicle.getFuelPrice());

        // ── 2. Create vehicles using parameterised constructor
        Vehicle car   = new Vehicle("MH-12-AB-1234", "Ravi Kumar",
                                    "Car",   "Petrol", 45.0, 15);

        Vehicle bike  = new Vehicle("KA-05-CD-5678", "Priya Sharma",
                                    "Bike",  "Petrol", 12.0, 50);

        Vehicle truck = new Vehicle("DL-01-EF-9012", "Suresh Patel",
                                    "Truck", "Diesel", 150.0, 8);

        // ── 3. Create a vehicle using default constructor ────
        Vehicle defaultVehicle = new Vehicle();

        // ── 4. Display details of all vehicles ──────────────
        System.out.println("► Vehicle Details (using current fuel price):\n");
        car.displayDetails();
        bike.displayDetails();
        truck.displayDetails();
        defaultVehicle.displayDetails();

        // ── 5. Update static fuel price ─────────────────────
        System.out.println("► Updating fuel price to ₹110.75 per litre …");
        Vehicle.setFuelPrice(110.75);

        // ── 6. Redisplay – all vehicles pick up the new price
        //       automatically (static variable is shared)
        System.out.println("► Vehicle Details AFTER price update:\n");
        car.displayDetails();
        bike.displayDetails();
        truck.displayDetails();

        // ── 7. Attempt invalid price update ─────────────────
        System.out.println("► Attempting to set invalid price (-50) …");
        Vehicle.setFuelPrice(-50);

        // ── 8. Summary table ─────────────────────────────────
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║                 REFILL COST SUMMARY                     ║");
        System.out.println("╠══════════════════╦════════════╦══════════════════════════╣");
        System.out.println("║ Vehicle ID       ║ Owner      ║ Full-Tank Cost (₹)       ║");
        System.out.println("╠══════════════════╬════════════╬══════════════════════════╣");
        printRow(car);
        printRow(bike);
        printRow(truck);
        System.out.println("╚══════════════════╩════════════╩══════════════════════════╝");

        System.out.println("\n✔  All operations completed successfully.");
    }

    // Helper to print a summary table row
    private static void printRow(Vehicle v) {
        System.out.printf("║ %-16s ║ %-10s ║ ₹%-23.2f║%n",
                v.getVehicleId(), v.getOwnerName(), v.calculateRefillCost());
    }
}
