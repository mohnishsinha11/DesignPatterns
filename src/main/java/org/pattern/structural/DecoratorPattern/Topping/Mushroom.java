package org.pattern.structural.DecoratorPattern.Topping;

import org.pattern.structural.DecoratorPattern.Pizza.BasePizza;

public class Mushroom extends ToppingDecorator{
    BasePizza basePizza;

    public Mushroom(BasePizza pizza) {
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 25;
    }
}
