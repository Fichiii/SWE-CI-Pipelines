public class App {
    public static void main(String[] args) throws Exception {
        //Test für Multiplikation
        System.out.println("Starte Tests!");

        boolean allTestsPassed = true;
        //Test1: positive Zahlen
        if(multiply(3,4) == 12){
            System.out.println("Test1: 3 * 4 = 12 erfolgreich!");
        } else {
            System.out.println("Test1: 3 * 4 = 12 nicht erfolgreich!");
            allTestsPassed = false;
        }

        //Test2: negative Zahlen
        if(multiply(-5, -4) == 20){
            System.out.println("Test2: -5 * (-4) erfolgreich!");
        } else {
            System.out.println("Test2: -5 * (-4) nicht erfolgreich!");
            allTestsPassed = false;
        }

        //Test3: positiv und negative Zahlen
        if(multiply(-6, 3) == -18){
            System.out.println("Test3: -6 * 3 = -18 erfolgreich!");
        } else {
            System.out.println("Test3: -6 * 3 = -18 nicht erfolgreich!");
            allTestsPassed = false;
        }

        //Check if all tests passed
        if(allTestsPassed == true){
            System.out.println("Alle Tests bestanden!");
        } else {
            System.out.println("Nicht alle Tests bestanden!");
        }
    }

    public static int multiply(int a, int b){
        return a*b;
    }
}
