//Creating a new sub class
package cardgame;

/**
 Group#2
 * @author Arshdeep Singh Khosa 
 * @author Nishant Choudary (Leader)
 * @author Sakshi Sakshi
 * @author Sukhvir Singh
 */
public class CardHand {

    //private class
    //HSize==Handsize
    private int HSize=60;

    //public class for cards
    public Card[] Patte=new Card[HSize];
    
    //Used for overall cards
    
    //creating a new void
    public void generateHand()
    {   
        //declaring int value
        //ccd==counting number of cards
        int CCD=0;


        //creating for loop
        for(Card.BellBott F:Card.BellBott.values())
        {   
            //nested loop 
            for(Card.merit X: Card.merit.values() )
            {
                Patte[CCD]=(new Card(F,X));
                CCD++;            
            }
        
        }
    
        
    }
    
}
