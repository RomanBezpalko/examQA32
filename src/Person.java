class Person {
    private String name;
    private int age;
    private int budget;

    public Person(String name) {
        this.name = name;
        this.age = 20; // Starting age
        this.budget = 50; // Starting budget
    }

    public int getAge() {
        return age;
    }

    public int getBudget() {
        return budget;
    }

    public void increaseAge() {
        age++;
    }

    public void decreaseAge() {
        age--;
    }

    public void earnMoney() {
        budget += 10; // Earn 10 money
    }

    public void payForEducation(Education education) {
        budget -= education.getYears(); // Spend money for education
    }

    public void liveMonth(Activity activity) {
        activity.perform(this);
        System.out.println("Current age: " + getAge() + ", Budget: " + getBudget());
    }

    public boolean isAlive() {
        return age < 100;
    }
}

