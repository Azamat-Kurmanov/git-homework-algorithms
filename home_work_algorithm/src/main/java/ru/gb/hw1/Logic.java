package ru.gb.hw1;

import java.util.Random;

public class Logic {
    private static Notebook[] notebooks;
    private static int[] priceArr;
    private static int[] ramArr;
    private static int elements;
    private static int price;
    private static int numberOfNotebooks = 10000; //---Кол-во ноутбуков
    private static int priceRange = 50;    //---Интервал цен
    private static int ramRange = 4;       //---Интервал по кол-ву оперативной памяти
    private static String[] manufacturer = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};


    //----Запуск процесса создания массива с необходимым списком для последующей сортировки
    public Notebook[] createNotebooArrObj() {
        priceArr = getPriceRange();
        ramArr = getRAMrange();
        notebooks = new Notebook[numberOfNotebooks];
        return notebooks;
    }

    //---Добавление элементов в массив
    public void insert(Notebook notebook){
        notebooks[elements] = notebook;
        elements++;
    }

    //----Рандомно извлекаются производители
    public String getManufacturer(){
        Random random = new Random();
        int rand = random.nextInt(manufacturer.length);
        return manufacturer[rand];
    }

    //---Рандомно извлекаются цены
    public int getNotebooksPrice(){
        Random random = new Random();
        int rand = random.nextInt(priceArr.length);
        return priceArr[rand];
    }

    //---Список цен
    public int[] getPriceRange(){
        int[] priceArr = new int[numberOfNotebooks];

        //---Создается массив в который зацикливаются записи со значениями, где указывается диапазон от 500 до 2000, до тех пор пока не дойдет до кол-ва ноутбуков
        for (int i = 0; i <= priceArr.length-1; i++) {
            while(true){
                if (price<=2000){
                    priceArr[i] = price;
                    price += priceRange;
                    break;
                }else{
                    price=500;
                }
            }
        }
        return priceArr;
    }

    //--Извлекается оперативная память
    public int getRAM(){
        Random random = new Random();
        int rand = random.nextInt(ramArr.length);
        return ramArr[rand];
    }

    //---Список оперативной памяти
    public int[] getRAMrange(){
        int[] ramArr = new int[numberOfNotebooks];
        int ram = 4;
        for (int i = 0; i <= ramArr.length-1; i++) {
            while(true){
                if (ram<=24){
                    ramArr[i] = ram;
                    ram+=ramRange;
                    break;
                }else{
                    ram = 4;
                }
            }
        }
        return ramArr;
    }

}
