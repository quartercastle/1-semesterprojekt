package worldofzuul;

import java.util.HashMap;

/**
 * @author  Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */


public class CommandWords {
    private HashMap<String, CommandWord> validCommands;
    
    /**
     * Creating an instance of CommandWords
     * Creating an empty list 
     * Validating if the commandword is known
     * Storing if its valid
     */
    public CommandWords() {
        validCommands = new HashMap<String, CommandWord>();
        for(CommandWord command : CommandWord.values()) { 
            if(command != CommandWord.UNKNOWN) {   
                validCommands.put(command.toString(), command);
            }
        }
    }
    
    /**
     * Creating a getter method for CommandWord
     * @param commandWord
     * @return if command != null return command otherwise return unknown 
     */
    public CommandWord getCommandWord(String commandWord) {
        CommandWord command = validCommands.get(commandWord);
        if(command != null) {
            return command;
        } else {
            return CommandWord.UNKNOWN;
        }
    }
    
    /**
     * Creating a boolean expression 
     * @param aString
     * @return true if valid commands contains the given string
     */
    public boolean isCommand(String aString) {
        return validCommands.containsKey(aString);
    }
    
    /**
     * Printing all available commands
     */
    public void showAll() {
        for(String command : validCommands.keySet()) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
