abstract class LifeEvent implements Activity {
    private final String name;
    public LifeEvent(String name, int impact) {
        this.name = name;
    }

    public void perform(Person person) {
        System.out.println(name);
        applyEffect(person);
    }

    protected abstract void applyEffect(Person person);

}
