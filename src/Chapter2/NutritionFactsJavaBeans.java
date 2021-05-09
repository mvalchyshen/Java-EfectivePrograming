package Chapter2;

public class NutritionFactsJavaBeans {
    private int servingSize = -1; //necessary
    private int servings = -1; //necessary
    private int fat = 0;
    private int calories = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    @Override
    public String toString() {
        return "NutritionFactsJavaBeans{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", fat=" + fat +
                ", calories=" + calories +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }

    public static void main(String[] args) {
        NutritionFactsJavaBeans cocaCola = new NutritionFactsJavaBeans();
        cocaCola.setCalories(10);
        cocaCola.setCarbohydrate(100);
        cocaCola.setFat(10);
        cocaCola.setServings(1);
        cocaCola.setServingSize(500);
        cocaCola.setSodium(5000);
        System.out.println(cocaCola);
    }
}
