
System.out.print("Choose your race: "); 
String choosenRace = in.next().toUpperCase();  
String raceName = "";
int raceModifier = 0; 

if (choosenRace.charAt(0) == 'M') { 
    raceModifier = HUMAN_DEXTERITY; 
    rollTotal += HUMAN_DEXTERITY; 
    raceName = "HUMAN"; 
}
else if (choosenRace.charAt(0) == 'D') { 
    raceModifier = DWARF_DEXTERITY;
    rollTotal += DWARF_DEXTERITY;
    raceName = "DWARF";
}
else if (choosenRace.charAt(0) == 'E') { 
    raceModifier = ELF_DEXTERITY; 
    rollTotal += ELF_DEXTERITY; 
    raceName = "ELF";
}
else { 
    raceModifier = HALFLING_DEXTERITY;
    rollTotal += HALFLING_DEXTERITY; 
    raceName = "HALFLING"; 
}

      