package ru.gb.hw1;

public class Sorting {
    public static void main(String[] args) {
        Logic logic = new Logic();
        Notebook[] notebooks = logic.createNotebooArrObj();

        for (int i = 0; i < notebooks.length; i++) {
            Notebook notebook = new Notebook(logic.getNotebooksPrice(), logic.getRAM(), logic.getManufacturer());
            logic.insert(notebook);
            System.out.println("Price: " + notebooks[i].getPrice() + " RAM: " + notebooks[i].getRamQuantity() + " Manufacturer: " + notebooks[i].getManufacturer());
        }


    }
}
