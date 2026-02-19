class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay = 1000;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }

    void displayRental() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + 
                           ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Bob", "Toyota Camry", 5);
        rental.displayRental();
    }
}
