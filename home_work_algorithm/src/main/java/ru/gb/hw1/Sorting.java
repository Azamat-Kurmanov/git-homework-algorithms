package ru.gb.hw1;

public class Sorting {
    public static void main(String[] args) {
        Logic logic = new Logic();
        Notebook[] notebooks = logic.createNotebooArrObj();
        //---------Создание массива с ноутбуками, оперативной памятью и производителями
        for (int i = 0; i < notebooks.length; i++) {
            Notebook notebook = new Notebook(logic.getNotebooksPrice(), logic.getRAM(), logic.getManufacturer());
            logic.insert(notebook);
//            System.out.println("Price: " + notebooks[i].getPrice() + " RAM: " + notebooks[i].getRamQuantity() + " Manufacturer: " + notebooks[i].getManufacturer());
        }
        selectSorting(notebooks);

    }

    private static void selectSorting(Notebook[] notebooks) {
        int min;
        for (int i = 0; i < notebooks.length-1; i++) {
            min = i;
            for (int j = i+1; j < notebooks.length; j++) {
                if (notebooks[j].compareTo(notebooks[min])<0){
                    min = j;
                }
            }
            Notebook temp = notebooks[i];
            notebooks[i] = notebooks[min];
            notebooks[min] = temp;
        }

        System.out.println("---------------------------------------------------------------------------");
        for (int i = 0; i < notebooks.length; i++) {
            System.out.println("Price: " + notebooks[i].getPrice() + " RAM: " + notebooks[i].getRamQuantity() + " Manufacturer: " + notebooks[i].getManufacturer());
        }
    }
}
