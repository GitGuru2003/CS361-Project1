package fa.dfa;
import fa.State;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class DFA implements DFAInterface{
    private Set<DFAState> states;
    private Set<DFAState> finalStates;
    private DFAState startState;
    private Set<Character> alphabet;

    public DFA() {
        startState = null;
        states = new HashSet<>();
        finalStates = new HashSet<>();
        alphabet = new HashSet<>();

    }


    @Override
    public boolean addState(String name) {
        DFAState newState = new DFAState(name);
        states.add(newState);

        return false;
    }

    @Override
    public boolean setFinal(String name) {
        return false;
    }

    @Override
    public boolean setStart(String name) {
        return false;
    }

    @Override
    public void addSigma(char symbol) {

    }

    @Override
    public boolean accepts(String s) {
        return false;
    }

    @Override
    public Set<Character> getSigma() {
        return null;
    }

    /**
     * Returns state with the given name, or null if none exists
     * @param name of a state
     * @return state object or null
     */
    public State getState(String name) {
        for(DFAState checking: states) {
            if(Objects.equals(checking.getName(), name)) {
                return checking;
            }else{
                return null;
            }
        }


    }

    @Override
    //FIXME
    public boolean isFinal(String name) {
        for(DFAState c: states) {
            if(c == name) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isStart(String name) {
        return false;
    }

    @Override
    public boolean addTransition(String fromState, String toState, char onSymb) {
        return false;
    }

    @Override
    public DFA swap(char symb1, char symb2) {
        return null;
    }
}