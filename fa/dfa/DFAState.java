/**
 * @author jake lammers
 * @author munib ahmed
 * 9/27/23
 * 
 * The DFAState object is implemented here, the DFAState stores its name in the form of a String 
 * and it's list of transitions in a HashMap consisting of <Character,DFAState> key value pairs.
 */
package fa.dfa;
import fa.State;
import java.util.HashMap;

public class DFAState extends State {
    private HashMap<Character,DFAState> transitionList;

    /**
     * Constructs a DFAState object with a given name and an empty transition list.
     * @param name - given name of the DFAState
     */
    public DFAState(String name) {
        this.name = name;
        transitionList = new HashMap<Character,DFAState>();
    }

    /**
     * Constructs a DFAState object with a given name and an empty transition list.
     * @param name - given name of the DFAState
     */
    public DFAState() {
        //super(name);
    }

    /**
     * Adds a transition to the DFAState's transition list.
     * 
     * @param symb - Character to transition on
     * @param state - State to transition to
     */
    public void addToState(char symb, DFAState state) {
        transitionList.put(symb, state);
    }
    
    /**
     * Returns the toState in the HashMap associated with the imput transition character.
     *  
     * @param symb - Transition character
     * @return - The state that is paired to symb in the HashMap
     */
    public DFAState getToState(char symb) {
        DFAState rval = transitionList.get(symb);
        return rval;
    }

    /**
     * Returns the TransitionList for the associated DFAState.
     * @return - HashMap<Character, DFAState> transitionList
     */
    public HashMap<Character,DFAState> getTransitionList() {
        return this.transitionList;
    }
}
