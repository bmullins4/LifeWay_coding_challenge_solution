
package io.github.bmullins4;

import java.util.HashMap;
import java.util.Map;


public class MessageController {
    
    public static long countWords(final Message msg) {
        
        long count = 0;
        
        if(msg == null) 
            return count;
        else {
            String[] words = msg.getMessage().split(" ");
            count = words.length;
            return count;
        }
    }
    
    public static Map<String, Object> getOutput(Message msg) {
        
        long count = countWords(msg);
        Map<String, Object> output = new HashMap<String, Object>();
        output.put("count", count);
        return output;
    }
}
