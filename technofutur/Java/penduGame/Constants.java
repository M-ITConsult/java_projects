package technofutur.Java.penduGame;

public class Constants {
    private Constants() {

    }

    private static final String[] MAN = {
            """
               ------
               |    |
               |    
               | 
               |    
               |   
               |   
               |
               --------""",
            """
               ------
               |    |
               |    0
               | 
               |    
               |   
               |   
               |
               --------""",
               """
               ------
               |    |
               |    0
               |    | 
               |    |
               |   
               |   
               |
               --------""",
               """
               ------
               |    |
               |    0
               | -- | 
               |    |
               |   
               |   
               |
               --------""",
               """
               ------
               |    |
               |    0
               | -- | --
               |    |
               |   
               |   
               |
               --------""",
               """
               ------
               |    |
               |    0
               | -- | --
               |    |
               |   |
               |   |
               |
               --------""",
            """
               ------
               |    |
               |    X
               | -- | --
               |    |
               |   | |
               |   | |
               |
               --------""",
    };

    public static String[] getMan() {
        return MAN;
    }
}
