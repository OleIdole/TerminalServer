package no.ntnu.terminalserver;


/**
 * A dummy command that takes all the arguments and responds with 
 * "hei" + the passed arguments
 * 
 * @author Girts Strazdins, girts.strazdins@gmail.com, 2015-06-16
 */
public class HelloCommand implements ServerCommand {
    /** Uses this string as the prefix for response */
    private static final String RESPONSE_NAME = "hei";
    
    @Override
    public String getName() {
        return "hello";
    }

    @Override
    public String process(String[] arguments) {
        String joinedArguments = String.join(" ", arguments);
        return RESPONSE_NAME + " " + joinedArguments;
    }

    @Override
    public String getShortDesc() {
        return "Replies the same message";
    }

    @Override
    public String getLongDesc() {
        return "Replaces '" + this.getName() + "' with '" 
                + RESPONSE_NAME + "' and adds the same arguments, sends"
                + " it back in the response";
    }
    
}
