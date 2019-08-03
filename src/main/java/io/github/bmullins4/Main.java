
package io.github.bmullins4;

import java.util.HashMap;
import java.util.Map;
import static spark.Spark.*;


public class Main {
    
    public static void main(String[] args) {
        
        get("/message/:id/:msg", (req, res) -> {
            //Map<String, Object> data = new HashMap<String, Object>();
            final String id = req.params(":id");
            final String msg = req.params(":msg");
            
            return null;
        });
    }
}
