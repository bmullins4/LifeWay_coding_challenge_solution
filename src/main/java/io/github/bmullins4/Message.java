
package io.github.bmullins4;

import java.util.Optional;


public class Message {
    
    private final long id;
    private final String message;
    
    public Message(final long id, final String message) {
        
        this.id = id;
        this.message = message;
    }
    
    public final long getID() { return id; }
    public final String getMessage() { return message; }
}
