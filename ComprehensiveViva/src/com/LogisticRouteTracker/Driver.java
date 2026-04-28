package com.LogisticRouteTracker;

public class Driver {
    String driverId;
    String name;
    RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
        routeHistory = new RouteLinkedList<>();
    }
}
