package Chapter2;

public class NutritionFacts {
    private int servingSize; //necessary
    private int servings; //necessary
    private int fat;
    private int calories;
    private int sodium;
    private int carbohydrate;

    // телескопический конструктор
    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }
    public NutritionFacts(int servingSize, int servings, int fat) {
        this(servingSize, servings, fat, 0);
    }
    public NutritionFacts(int servingSize, int servings, int fat, int calories) {
        this(servingSize, servings, fat, calories, 0);
    }
    public NutritionFacts(int servingSize, int servings, int fat, int calories, int sodium) {
        this(servingSize, servings, fat, calories, sodium, 0);
    }

    public NutritionFacts(int servingSize, int servings, int fat, int calories, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.fat = fat;
        this.calories = calories;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
