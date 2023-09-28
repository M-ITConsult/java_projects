package technofutur.Java;

public class exo_oo {

    public static void clearConsole(){
            try {
                final String os = System.getProperty("os.name");

                if (os.contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                    new ProcessBuilder("clear").inheritIO().start().waitFor();
                }
            } catch (final Exception e) {
                System.out.println("Error while clearing the console: " + e.getMessage());
            }
    }
    public static void main(String[] args) {
        System.out.println("------------");
        System.out.println("------------");
        System.out.println("------------");
        System.out.println("------------");
        System.out.println("------------");
        clearConsole();
    }

}


