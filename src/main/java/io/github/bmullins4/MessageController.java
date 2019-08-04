
package io.github.bmullins4;

import java.util.HashMap;
import java.util.Map;


public class MessageController {
    
    private static long totWords = 0;
    private static Map<Long, Integer> processedMsgs = new HashMap<Long, Integer>();
    
    public static long countWords(final Message msg) {

        if(msg == null) 
            return totWords;
        else {
            if(!processedMsgs.containsKey(msg.getID())) {
                String[] words = msg.getMessage().split(" ");
                processedMsgs.put(msg.getID(), words.length);
                totWords += words.length;
                return totWords;
            } else return totWords;
        }
    }
    
    public static Map<String, Object> getOutput(Message msg) {
        
        totWords = countWords(msg);
        Map<String, Object> output = new HashMap<String, Object>();
        output.put("count", totWords);
        return output;
    }
}
