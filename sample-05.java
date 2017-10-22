

int valueTotalInCar = valueAdultInCar + valueChildInCar;
int valueTotalCrossing = valueAdultCrossing + valueChildCrossing;
int valueDifference = Math.abs(valueTotalInCar - valueTotalCrossing);

boolean withinTolerance = valueDifference <= TOLERANCE;
boolean userPreferOccupants = false;
if (withinTolerance) {
    System.out.print("Are the lives of the occupants more valuable than the lives of the pedestrians? ");
    char userDecision = keyboard.next().toUpperCase().charAt(0);
    userPreferOccupants = userDecision == 'Y';
}

boolean saveOccupants = valueTotalInCar > valueTotalCrossing;
boolean killPedestrians = (withinTolerance && userPreferOccupants) || (!withinTolerance && saveOccupants); 

if (killPedestrians) {
    System.out.printf("PEDESTRIANS will be killed%n");
    System.out.printf("%d Adults killed%n", numAdultCrossing);
    System.out.printf("%d Children killed%n", numChildCrossing);
} else {
    System.out.printf("OCCUPANTS will be killed%n");
    System.out.printf("%d Adults killed%n", numAdultInCar);
    System.out.printf("%d Children killed%n", numChildInCar);
}

