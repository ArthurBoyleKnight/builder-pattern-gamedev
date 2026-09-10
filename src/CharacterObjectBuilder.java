public class CharacterObjectBuilder implements CharacterBuilder {
    private String name;
    private String jobClass;
    private int health;

    public CharacterObjectBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CharacterObjectBuilder setJobClass(String jobClass) {
        this.jobClass = jobClass;
        return this;
    }

    public CharacterObjectBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    public GameCharacter getResult() {
        if (name == null || health <= 0) {
            throw new IllegalStateException("Name required and Health must be over 0!");
        }
        return new GameCharacter(name, jobClass, health);
    }
}