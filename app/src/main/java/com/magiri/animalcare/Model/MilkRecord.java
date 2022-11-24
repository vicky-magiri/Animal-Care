package com.magiri.animalcare.Model;

public class MilkRecord {
    String AnimalName,MilkTime,Date;
    int Quantity;

    public MilkRecord(String animalName, String milkTime, String date, int quantity) {
        this.AnimalName = animalName;
        this.MilkTime = milkTime;
        this.Date = date;
        this.Quantity = quantity;
    }

    public String getAnimalName() {
        return AnimalName;
    }

    public void setAnimalName(String animalName) {
        AnimalName = animalName;
    }

    public String getMilkTime() {
        return MilkTime;
    }

    public void setMilkTime(String milkTime) {
        MilkTime = milkTime;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}

