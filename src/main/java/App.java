import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import java.util.ArrayList;
import java.util.*;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("cds", request.session().attribute("cds"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/result", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      ArrayList<CdOrganizer> cds = request.session().attribute("cds");
      if(cds == null) {
        cds = new ArrayList<CdOrganizer>();
        request.session().attribute("cds", cds);
      }
      String artist = request.queryParams("artist");
      String title = request.queryParams("title");
      int price = Integer.parseInt(request.queryParams("price"));
      CdOrganizer newCdOrganizer = new CdOrganizer(artist, title, price);
      cds.add(newCdOrganizer);

      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
