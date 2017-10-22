
final String HUMAN = "M";
final String DWARF = "D";
final String ELF = "E";
final String HALFLING = "H";
final String NEGATIVE_DEXTERITY = "-";
final String POSITIVE_DEXTERITY = "+";
final int HUMAN_DEXTERITY_INCREASE = 1;
final int DWARF_DEXTERITY_INCREASE = 0;
final int ELF_DEXTERITY_INCREASE = 2;
final int HALFLING_DEXTERITY_INCREASE = 2;

...

if (chosenRace.equals(HUMAN))
{
    raceModifier = HUMAN_DEXTERITY_INCREASE;
    modifiedRacialNote = ("Note: applied racial modifier (+1)");
    chosenRace = "HUMAN";
}

else if (chosenRace.equals(DWARF))
{
    raceModifier = DWARF_DEXTERITY_INCREASE;
    modifiedDexterity = ("");
    chosenRace = "DWARF";
}
else if (chosenRace.equals(ELF))
{
    raceModifier = ELF_DEXTERITY_INCREASE;
    modifiedRacialNote = ("Note: applied racial modifier (+2)");
    chosenRace = "ELF";
}
else if (chosenRace.equals(HALFLING))
{
    raceModifier = HALFLING_DEXTERITY_INCREASE;
    modifiedRacialNote = ("Note: applied racial modifier (+2)");
    chosenRace = "HALFLING";
}


