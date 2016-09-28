package no.ntnu.terminalserver;

import java.util.Collection;

/**
 * The main TerminalServer class which will run the whole application,
 * manage list of supported commands,
 * listen for client connections and create a new thread for each connection
 * Template author: Girts Strazdins, girts.strazdins@gmail.com, 2016-09-13
 * 
 * @author Ole Martin
 */
public class TerminalServer {
    // TODO - define default port here
    // TODO - define structure to hold commands
    // Hint: Map or List could be useful

    TerminalServer() {
        // TODO - initialize command storage (Hint: HashMap?)
    }
    
    /**
     * Start the server. One argument supported - optional port number.
     * When not specified, open connection on the default port
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO - parse command line arguments, find out which port to use
        int port = -1;
        
        // Create new server
        TerminalServer server = new TerminalServer();
        
        // TODO - Add supported commands (Hint: use server.addCommand())
        
        // Start the server
        server.run(port);
    }

    public void run(int port) {
        // TODO - start the server, listen on the given port. 
        // Create new thread for each client connection
        // Hint: you probably would need another class (TerminalThread?)
        // which would handle each connection
    }
    
    /**
     * Add a supported command
     * @param cmd 
     */
    public void addCommand(ServerCommand cmd) {
        // TODO - add the command to the list/map
    }
    
    /**
     * Get handler for a command with specified name
     * @param cmdName
     * @return ServerCommand handler or null if none found
     */
    public ServerCommand getCommandHandler(String cmdName) {
        // TODO - find the command with given name
        // TODO - remember to take care of case-insensitivity (HElp = help = heLp, etc)
        // return ...
        return null;
    }
    
    /**
     * Get all supported commands as a collection
     * @return 
     */
    public Collection<ServerCommand> getAllCommands() {
        // TODO - return all the supported commands as a collection 
        // Hint: (Map.values()?)
        return null;
    }
    
}
