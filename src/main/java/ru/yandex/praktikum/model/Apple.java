package ru.yandex.praktikum.model;

import java.util.Objects;

import static ru.yandex.praktikum.model.constants.Discount.RED_APPLES_DISCOUNT;
import static ru.yandex.praktikum.model.constants.Colour.RED;


public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
       if (Objects.equals(colour, RED)) {
           return RED_APPLES_DISCOUNT;
        } else {
           return super.getDiscount();
       }
    }
}
