package com.example.demo.repository.entity;

import java.util.Objects;

public class OrdersPlaced {
    int ordersPlaced;
    int hourOfTheDay;

    public int getOrdersPlaced() {
        return ordersPlaced;
    }

    public void setOrdersPlaced(int ordersPlaced) {
        this.ordersPlaced = ordersPlaced;
    }

    public int getHourOfTheDay() {
        return hourOfTheDay;
    }

    public void setHourOfTheDay(int hourOfTheDay) {
        this.hourOfTheDay = hourOfTheDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersPlaced that = (OrdersPlaced) o;
        return ordersPlaced == that.ordersPlaced && hourOfTheDay == that.hourOfTheDay;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordersPlaced, hourOfTheDay);
    }
}
