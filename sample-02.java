
System.out.println("Are the lives of the car's occupants be valued over the lives of the pedestrians?");
char choosePassOverPed = kbd.next().charAt(0);

if (Character.toUpperCase(choosePassOverPed) == 'Y'){
    passengerPoints = passengerPoints + toughCallThresholdPoints;
}
else{
    pedestrianPoints = pedestrianPoints + toughCallThresholdPoints;    
}

if (passengerPoints > pedestrianPoints){
    System.out.println("Fatality Group: PEDESTRIANS");        
    System.out.printf("Number of adult fatalities: %d%n", numAdultPedestrians);
    System.out.printf("Number of child fatalities: %d%n", numChildPedestrians);
}
else {
    System.out.println("Fatality Group: OCCUPANTS");
    System.out.printf("Number of adult fatalities: %d%n", numAdultPassengers);
    System.out.printf("Number of child fatalities: %d%n", numChildPassengers);
}

