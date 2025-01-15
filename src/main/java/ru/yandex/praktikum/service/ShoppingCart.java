package ru.yandex.praktikum.service;

import ru.yandex.praktikum.model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double totalWithoutDiscount() {
        double totalWithoutDiscount = 0;

        for (Food food : foods) {
            totalWithoutDiscount += food.getPrice() * food.getAmount();
        }
        return totalWithoutDiscount;
    }

    public double totalWithDiscount() {
        double totalWithDiscount = 0;

        for (Food food : foods) {
            double discount = (100.0 - food.getDiscount()) / 100.0;
            totalWithDiscount += (food.getPrice() * food.getAmount()) * discount;
        }
        return totalWithDiscount;
    }

     public double totalVegetarianWithoutDiscount() {
         double totalVegetarian = 0;

        for (Food food : foods) {
            if (food.getVegetarian()) {
                totalVegetarian += food.getPrice() * food.getAmount();
            }
        }
        return totalVegetarian;
     }

}
