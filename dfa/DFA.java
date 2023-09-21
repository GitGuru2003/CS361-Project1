package fa.dfa;
import fa.State;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class DFA implements DFAInterface{
    private Set<DFAState> states;
    private Set<DFAState> finalStates;
    private DFAState startState;
    private Set<Character> alphabet;

    public DFA() {
        startState = null;
        states = new LinkedHashSet<>();
        finalStates = new LinkedHashSet<>();
        alphabet = new LinkedHashSet<>();

    }


    /**
     * Adds a state to the FA instance
     * @param name is the label of the state
     * @return true if a new state created successfully and false if there is already state with such name
     */

    public boolean addState(String name) {
        DFAState newState = new DFAState(name);
        states.add(newState);
        for(DFAState c: states) {
            return c.getName().equals(name);
        }
        return false;
    }

    /**
     * Marks an existing state as an accepting state
     * @param name is the label of the state
     * @return true if successful and false if no state with such name exists
     */
    public boolean setFinal(String name) {
        if(states.contains(name)) {
            DFAState temp = (DFAState) getState(name);
            finalStates.add(temp);
            return true;
        }
        return false;
    }

    /**
     * Adds the initial state to the DFA instance
     * @param name is the label of the start state
     * @return true if successful and false if no state with such name exists
     */
    public boolean setStart(String name) {
        if (startState == null) {
            startState = (DFAState) getState(name);
            return true;
        }
        return false;
    }

    /**
     * Adds a symbol to Sigma
     * @param symbol to add to the alphabet set
     */
    public void addSigma(char symbol) {
        alphabet.add(symbol);
    }

    /**
     * Simulates a DFA on input s to determine
     * whether the DFA accepts s.
     * @param s - the input string
     * @return true if s in the language of the DFA and false otherwise
     */
    public boolean accepts(String s) {
        DFAState currentState = startState;
        for(int i=0; i<s.length(); i++) {

        }
        if(finalStates.contains(currentState)) {
            return true;
        }
        return false;
    }

    /**
     * Getter for Sigma
     * @return the alphabet of FA
     */
    public Set<Character> getSigma() {
        return alphabet;
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


        return null;
    }

    /**
     * checks whether a state is a final state
     * @param name the name of the state
     * @return boolean - true if the state is a final state, false if not.
     */
    public boolean isFinal(String name) {
        for(DFAState c: states) {
            if(c.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    /**
     * checks whether a state is a start state or not.
     * @param name the name of the state
     * @return boolean true if the state is a start state, false if not.
     */
    public boolean isStart(String name) {
        return startState.getName().equals(name);
    }

    /**
     * Adds the transition to the DFA's delta data structure
     * @param fromState is the label of the state where the transition starts
     * @param toState is the label of the state where the transition ends
     * @param onSymb is the symbol from the DFA's alphabet.
     * @return true if successful and false if one of the states don't exist or the symbol in not in the alphabet
     */
    public boolean addTransition(String fromState, String toState, char onSymb) {

        for (DFAState state : states) {
            if(state.getName().equals(fromState)){
                state.addToState(onSymb, (DFAState) getState(toState));
            }
        }
        return false;
    }

    @Override
    public DFA swap(char symb1, char symb2) {
        return null;
    }

    /**
     * Construct the textual representation of the DFA, for example
     * A simple two state DFA
     * Q = { a b }
     * Sigma = { 0 1 }
     * delta =
     *		0	1
     *	a	a	b
     *	b	a	b
     * q0 = a
     * F = { b }
     *
     * The order of the states and the alphabet is the order
     * in which they were instantiated in the DFA.
     * @return String representation of the DFA
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();

        //Generating Q
        builder.append("Q = {");
        for(DFAState c: states) {
            builder.append(" " + c.getName());
        }
        builder.append(" }\n");

        //Generating Sigma
        builder.append("Sigma = {");
        for(Character c: alphabet) {
            builder.append(" " + c);
        }
        builder.append(" }\n");

        //Generating Delta
        builder.append("Delta =" + "\n");
        builder.append("\t");
        for(Character c: alphabet) {
            builder.append("\t" + c);
        }
        builder.append("\t\n");

        for(DFAState c: states) {
            builder.append("\t" + c.getName());
            for(Character d: alphabet) {
                //find transitions for all aphabet here and loop
                //builder.append("\t" + c.getToState(d));
            }
            builder.append("\n");
        }

        //Generating q0
        builder.append("q0 =");
        builder.append(" " + startState.getName() + "\n");

        //Generating F
        builder.append("F = {");
        for(DFAState c: finalStates) {
            builder.append(" " + c.getName());
        }
        builder.append(" }\n");

        return builder.toString();
    }
}
