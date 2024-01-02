class EngageEvent extends LifeEvent {
    public EngageEvent() {
        super("You got engaged!", 2);
    }

    protected void applyEffect(Person person) {
        person.increaseAge();
    }
    
}
