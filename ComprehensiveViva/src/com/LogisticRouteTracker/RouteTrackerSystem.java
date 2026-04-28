package com.LogisticRouteTracker;

public class RouteTrackerSystem {

    public static void main(String[] args) {

        Driver d = new Driver("D1204", "Kavita Nair");

        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 50, 30, 40));
        d.routeHistory.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20, 15, 15));
        d.routeHistory.addCheckpoint(new RestCheckpoint("C3", "Motel X", 10, 20, 60));
        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 40, 25, 40));

        System.out.println("Driver: " + d.driverId + " - " + d.name);
        System.out.println("Route Summary:");

        d.routeHistory.printRoute();

        double totalDistance = d.routeHistory.computeTotalDistance();
        double totalPenalty = d.routeHistory.computeTotalPenalty();
        double routeScore = totalDistance - totalPenalty;

        System.out.println("Total Distance: " + totalDistance);
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + routeScore);

        System.out.println("Critical Route Check: " +
                (d.routeHistory.checkConsistency() ?
                        "All required checkpoints present" :
                        "Missing critical checkpoints"));
    }
}
