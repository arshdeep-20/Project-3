
package cardgame;

//We Have added methods and attributes

/**
 * Group#2
 * @author Arshdeep Singh Khosa 
 * @author Nishant Choudary (Leader)
 * @author Sakshi Sakshi
 * @author Sukhvir Singh
 */
public class Card {
    
    //Code Starts here

    //  Creating a special Class for Colours.
    public enum BellBott{
    Red,Yellow,Green,Blue
    }

    //  Creating a special Class for Cards.
    public enum merit{
        One, TWO, THREE,FOUR,FIVE,SIX,
        SEVEN,EIGHT,NINE,TEN,Skip,Reverse,
        Draw_two,Draw_four, wildcard
    }
    
    //Creating private classes
    private final BellBott bellbott;
    private final merit merit;

    //Creating a public classs for card
    public Card(BellBott bellbott,
                merit merit)
    

    //using this for constructor
    {
        this.bellbott=bellbott;
        this.merit=merit;
    }
   
    //Creating private classes
    public BellBott getBellBott() {
        //returing values for bellbott
        return bellbott;
    }

    //Creating private classes
    public merit getmerit() {
         //returing values for merit
        return merit;
    }
}

//code ends here