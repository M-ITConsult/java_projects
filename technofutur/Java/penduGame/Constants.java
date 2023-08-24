package technofutur.Java.penduGame;

public class Constants {
    private static String[] hangmanArt = {
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
        return hangmanArt;
    }
}
