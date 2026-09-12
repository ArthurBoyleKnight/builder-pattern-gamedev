<strong>Game Character Creator</strong>
<br>A building battern design in context of game develeopment. It shows how to separate complex object construction from internal representations.

<br>GameCharacter: Immutable product class representing the character.
<br>CharacterBuilder: Interface that defies the step by step assembly protocol.
<br>CharacterObjectBuilder: Concrete builder that validates parameters and constructs a GameCharacter object.
<br>CharacterTextBuilder: Concrete builder that formats the character information into a text card.
<br>CharacterDirector: Controlls construction sequences.
<br>App: Client application that shows polymorphic character creation.

