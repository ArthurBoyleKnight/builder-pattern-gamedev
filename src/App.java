public class App {
    public static void main(String[] args) {
        CharacterDirector director = new CharacterDirector();

        CharacterObjectBuilder objectBuilder = new CharacterObjectBuilder();
        director.makeKnight(objectBuilder);
        GameCharacter knight = objectBuilder.getResult();

        CharacterTextBuilder textBuilder = new CharacterTextBuilder();
        director.makeWizard(textBuilder);
        String wizardTextCard = textBuilder.getResult();

        System.out.println("The Hero:");
        System.out.println(knight);

        System.out.println("\nThe main character:");
        System.out.println(wizardTextCard);
    }
}