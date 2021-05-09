package Chapter2.Pizza;

import java.util.Objects;

public class NyPizza extends Pizza{
    public enum Size {
        SMALL,
        MEDIUM,
        LARGE
    }
    private Size size;
    public static class Builder extends Pizza.Builder<Builder> {
        private Size size;

        public Builder (Size size) {
            this.size = Objects.requireNonNull(size);
        }
        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }
    }
    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return "NyPizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }
}
