package ru.gb.hw1;

public class Notebook {
    private int price;
    private int ramQuantity;
    private String manufacturer;

    public Notebook(int price, int ramQuantity, String manufacturer) {
        this.price = price;
        this.ramQuantity = ramQuantity;
        this.manufacturer = manufacturer;
    }

    //--------Основная логика сравнения----//
    public int compareTo(Notebook n){
        int res = Integer.compare(price, n.getPrice());
        if (res==0){
            res = Integer.compare(ramQuantity, n.getRamQuantity());
            if (res==0){
                return manufacturer.compareTo(n.getManufacturer());
            }
            return res;
        }
        return res;
    }

    public int getPrice() {
        return price;
    }

    public int getRamQuantity() {
        return ramQuantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRamQuantity(int ramQuantity) {
        this.ramQuantity = ramQuantity;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
