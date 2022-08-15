package cardgame;

//We Have added methods and attributes

/**
 * Group#2
 * @author Arshdeep Singh Khosa 
 * @author Nishant Choudary (Leader)
 * @author Sakshi Sakshi
 * @author Sukhvir Singh
 */

 //creating a new class
public class GamePlayer {

    //creating a void
    public static void main(String[] args) {

        //Scanner class
        CardHand PEEK=new CardHand();
        //generating numbers/Values
        PEEK.generateHand();
        
        //for loop 
        for(Card ZEE:PEEK.Patte)
        {
            //Printing Statement
            System.out.println(ZEE.getmerit()+" of "+ZEE.getBellBott());
        }
    }

}

//code ends here