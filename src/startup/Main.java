package startup;

/**
 * Starts the application.
 */
public class Main {

    /**
     * This is the application's main method, which starts the entire car inspection system.
     *
     * @param args The are no command line parameters.
     */
    public static void main(String[] args) {
        DisplayManager displayManager = new DisplayManager();
        Display display = new Display(displayManager);
        Garage garage = new Garage();
        CashRegister cashRegister = new CashRegister();
        CreditCardMachine creditCardMachine = new CreditCardMachine();
        InspectionDTO brakes = new inspectionDTO("How to control brakes");
        InspectionDTO suspension = new inspectionDTO("How to control suspension");
        InspectionDTO stearing = new inspectionDTO("How to control stearing");
        InspectionDTO wheels = new inspectionDTO("How to control wheels");
        InspectionDTO lights = new inspectionDTO("How to control lights");
        InspectionDTO windShieldWipers = new inspectionDTO("How to control windshield wipers");
        InspectionDTO gears = new inspectionDTO("How to control gears");
        InspectionDTO fumesControl = new inspectionDTO("How to control fumes");
        InspectionDTO corrosion = new inspectionDTO("How to control corrosion");
        InspectionDTO propellersAndLeggings = new inspectionDTO("How to control propellers and leggings");
        Printer printer = new Printer();
        Vehicle vehicle = new Vehicle();
        ExternalPaymentAuthorization externalPaymentAuthorization = new ExternalPaymentAuthorization();
        Controller contr = new Controller();
        View view = new View(contr);
    }
}
