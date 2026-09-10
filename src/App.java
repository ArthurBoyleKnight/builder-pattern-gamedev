public class App {
    public static void main(String[] args) {
        CharacterDirector director = new CharacterDirector();
        CharacterObjectBuilder objBuilder = new CharacterObjectBuilder();
        director.makeKnight(objBuilder);
        GameCharacter knight = objBuilder.getResult();
        System.out.println(knight);
        CharacterTextBuilder textBuilder = new CharacterTextBuilder();
        director.makeKnight(textBuilder);
        String textCard = textBuilder.getResult();
        System.out.println(textCard);
    }
}