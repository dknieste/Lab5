package pokerAction;

/**
 * Player action.
 * 
 */
public abstract class Action {
        
    /** Continue. */
    public static final Action CONTINUE = new ContinueAction();
    	
    /** Fold. */
    public static final Action FOLD = new FoldAction();
    
    /** Fold. */
    public static final Action START = new StartAction();
    
    /** Fold. */
    public static final Action END = new EndAction();
    
    /** Fold. */
    public static final Action DEAL = new DealAction();
    
    /** Discard */
    public static final Action DISCARD = new DiscardAction();
    
    /** Sit */
    public static final Action SIT = new SitAction();
    
    /** Leave */
    public static final Action LEAVE = new LeaveAction();
    
    /** Draw */
    public static final Action DRAW = new DrawAction();
    
    
    /** The action's name. */
    private final String name;
    
    /** The action's verb. */
    private final String verb;
        
    /**
     * Constructor.
     * 
     * @param name
     *            The action's name.
     * @param verb
     *            The action's verb.
     */
    public Action(String name, String verb) {
        this.name = name;
        this.verb = verb;
    }
    

    
    /**
     * Returns the action's name.
     * 
     * @return The action's name.
     */
    public final String getName() {
        return name;
    }
    
    /**
     * Returns the action's verb.
     * 
     * @return The action's verb.
     */
    public final String getVerb() {
        return verb;
    }
    
    
    /** {@inheritDoc} */
    @Override
    public String toString() {
        return name;
    }

}
