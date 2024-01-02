class AccidentEvent extends LifeEvent {
    public AccidentEvent() {
        super("You had an accident!", -5);
    }

    protected void applyEffect(Person person) {
        person.decreaseAge();
    }
}