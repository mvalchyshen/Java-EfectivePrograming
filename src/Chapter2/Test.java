package Chapter2;

import Chapter2.Pizza.Calzone;
import Chapter2.Pizza.NyPizza;
import Chapter2.Pizza.Pizza;

import static Chapter2.Pizza.NyPizza.Size.SMALL;
import static Chapter2.Pizza.Pizza.Topping.ONION;
import static Chapter2.Pizza.Pizza.Topping.SAUSAGE;

public class Test {

    public static void main(String[] args) {
        //BuilderTest
        NutritionFactsBuilderTest cocaCola = new NutritionFactsBuilderTest.Builder(240, 8)
                .calories(100)
                .fat(10)
                .sodium(20)
                .carbohydrate(100)
                .build();
        //Builder иерархия классов
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .sauceInside()
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();
        System.out.println(pizza);
        System.out.println(calzone);
    }
}
