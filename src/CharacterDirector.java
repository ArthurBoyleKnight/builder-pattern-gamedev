public class CharacterDirector {
    
    public void makeKnight(CharacterBuilder builder) {
        builder.setName("Link")
               .setJobClass("Triforce of Courage")
               .setHealth(100);
    }

    public void makeWizard(CharacterBuilder builder) {
        builder.setName("Cloud")
               .setJobClass("mercenary ")
               .setHealth(50);
    }
}