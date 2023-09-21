package fa.dfa;
import fa.State;
import java.util.HashMap;

public class DFAState extends State {
    private HashMap<Character,DFAState> transitionList;
    public DFAState(String name) {
        this.name = name;
        transitionList = new HashMap<Character,DFAState>();
    }
    public DFAState() {
        //super(name);
    }
}
