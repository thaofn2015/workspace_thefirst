package fan.stu.spring;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    private static final Logger logger = Logger.getLogger(MainController.class);

    @RequestMapping("/")
    public String index() {
        logger.info("Log info");
        return "index";
    }

    @RequestMapping("/error")
    public String error() throws Exception {
        throw new Exception("testing");
    }
}
