
package org.pattern.structural.DecoratorPattern;

import org.pattern.structural.DecoratorPattern.Pizza.BasePizza;
import org.pattern.structural.DecoratorPattern.Pizza.FarmHouse;
import org.pattern.structural.DecoratorPattern.Pizza.VegDelight;
import org.pattern.structural.DecoratorPattern.Topping.ExtraCheese;
import org.pattern.structural.DecoratorPattern.Topping.Mushroom;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        BasePizza pizza1 = new Mushroom(new ExtraCheese(new VegDelight()));
        BasePizza pizza2 = new Mushroom(new FarmHouse());

        System.out.println("Cost Pizza 1 :" + pizza1.cost());
        System.out.println("Cost Pizza 2 :" + pizza2.cost());
    }
}
