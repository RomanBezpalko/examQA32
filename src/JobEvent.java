class JobEvent extends LifeEvent {
    public JobEvent() {
        super("You got a job!", 3);
    }

    protected void applyEffect(Person person) {
        person.increaseAge();
        person.earnMoney();
    }
    
}
