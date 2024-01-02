class EducationEvent extends LifeEvent {
    private final Education education;

    public EducationEvent(Education education) {
        super("You pursued education!", education.getYears());
        this.education = education;
    }

    protected void applyEffect(Person person) {
        person.increaseAge();
        person.payForEducation(education);
    }
}
