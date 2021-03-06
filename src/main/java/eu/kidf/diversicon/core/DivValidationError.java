package eu.kidf.diversicon.core;

/**
 * @since 0.1.0
 */
public enum DivValidationError {

    /**
     * @since 0.1.0
     */    
    INVALID_INTERNAL_ID,    
    
    /**
     * @since 0.1.0
     */
    MISSING_INTERNAL_ID,

    /**
     * @since 0.1.0
     */    
    MISSING_EXTERNAL_ID,
    
    /**
     * @since 0.1.0
     */
    INVALID_PREFIX,
    
    /**
     * @since 0.1.0
     */
    UNDECLARED_NAMESPACE,
    
    /**
     * @since 0.1.0
     */    
    INVALID_DIVUPPER_NAMESPACE,

    /**
     * @since 0.1.0
     */    
    INVALID_NAMESPACE, 


    /**
     * A prefix should have length less or equal to {@link Diversicons#LEXRES_PREFIX_SUGGESTED_LENGTH} 
     * to prevent memory issues.
     * 
     * @since 0.1.0
     */    
    TOO_LONG_PREFIX, 
    
    /**
     * A LExicalResource needs a proper descriptive label (i.e. "Diversicon Wordnet 3.1")
     * 
     * @since 0.1.0
     */    
    INVALID_LABEL, 
        
    /**
     * @since 0.1.0
     */        
    NAMESPACE_CLASH,
    
    /**
     * Each resource must have a corresponding namespace associated to its prefix.
     * 
     * @since 0.1.0
     */
    MISSING_NAMESPACE_DECLARATION,
    
    /**
     * A Lexical resource must have a valid identifier, see {@link Diversicons#NAMESPACE_ID_PATTERN}
     * 
     * @since 0.1.0
     */
     INVALID_LEXRES_NAME;        
    
    /**
     * @since 0.1.0
     */
    public String toString(){
        return "DIV-" + ordinal() ;
    }

}
