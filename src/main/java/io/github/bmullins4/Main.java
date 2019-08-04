
package io.github.bmullins4;

import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.velocity.VelocityTemplateEngine;


public class Main {
    
    public static void main(String[] args) {
        
        get("/:id/:msg", (req, res) -> {
            
            final String id = req.params(":id");
            final String msg = req.params(":msg");
            
            Message message = new Message(Long.parseLong(id), msg);
            
            return new VelocityTemplateEngine().render(
                new ModelAndView(
                    MessageController.getOutput(message),
                    "json/output.vm"));
        });
    }
}
