package BuilderPattern.FinalApproach;

public class Car {
    public String name;
    public int length;
    public String company;
    public boolean isReleased;

    Car(Builder builder) {
        this.name = builder.name;
        this.length = builder.length;
        this.company = builder.company;
        this.isReleased = builder.isReleased;
    }

    public int getLength() {
        return length;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }


    public static class Builder {
        public String name;
        public int length;
        public String company;
        public boolean isReleased;

        private Builder() {
        }

        public static Builder newInstance() {
            return new Builder();
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLength(int length) {
            this.length = length;
            return this;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Builder setIsReleased(Boolean isReleased) {
            this.isReleased = isReleased;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }
}

