public class App {
    public static void main(String[] args) {

        character knight = new character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();

        character mage = new character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();

        character thief = new character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();

        character marksman = new character();

        marksman.strength = 5;
        marksman.agility = 10;
        marksman.intelligence = 0;
        marksman.name = "Kardel Sharpeye";
        marksman.sayMyName();
        marksman.sayMyStrength();
        marksman.sayMyAgility();
        marksman.sayMyIntelligence();

    }
}
