package com.LogisticRouteTracker;

public class RouteLinkedList<T extends Checkpoint> {

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addCheckpoint(T checkpoint) {
        Node newNode = new Node(checkpoint);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    public boolean removeCheckpoint(String id) {
        if (head == null) return false;

        if (head.data.checkpointId.equals(id)) {
            head = head.next;
            return true;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.checkpointId.equals(id)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public T findCheckpoint(String id) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.checkpointId.equals(id))
                return temp.data;
            temp = temp.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double total = 0;
        Node temp = head;
        while (temp != null) {
            total += temp.data.distanceFromLast;
            temp = temp.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0;
        Node temp = head;
        while (temp != null) {
            total += temp.data.calculatePenalty();
            temp = temp.next;
        }
        return total;
    }

    public boolean checkConsistency() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        Node temp = head;
        while (temp != null) {
            if (temp.data.getType().equals("Delivery"))
                hasDelivery = true;
            if (temp.data.getType().equals("Fuel"))
                hasFuel = true;
            temp = temp.next;
        }
        return hasDelivery && hasFuel;
    }

    public void printRoute() {
        Node temp = head;
        int i = 1;

        while (temp != null) {
            Checkpoint c = temp.data;
            String status = c.isDelayed() ? "Delayed" : "On Time";

            System.out.println(i + ". " + c.getType() + " - " + c.locationName +
                    " - " + status + " - Penalty: " + c.calculatePenalty());

            temp = temp.next;
            i++;
        }
    }
}
