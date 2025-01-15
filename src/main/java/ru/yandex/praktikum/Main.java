package ru.yandex.praktikum;

import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.service.ShoppingCart;

import static ru.yandex.praktikum.model.constants.Colour.RED;
import static ru.yandex.praktikum.model.constants.Colour.GREEN;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100.0, false);
        Food redApples = new Apple(10, 50.0, RED);
        Food greenApples = new Apple(8, 60.0, GREEN);

        Food[] foods = {meat, redApples, greenApples};

        ShoppingCart cart = new ShoppingCart(foods);
        System.out.println("Общая сумма товаров без скидки: " +  cart.totalWithoutDiscount() + " руб.");
        System.out.println("Общая сумма товаров со скидкой: " + cart.totalWithDiscount() + " руб.");
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.totalVegetarianWithoutDiscount() + " руб.");

    }
}
