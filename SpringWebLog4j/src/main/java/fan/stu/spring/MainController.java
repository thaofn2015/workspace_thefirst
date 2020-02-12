package fan.stu.spring;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    private static final Logger logger = Logger.getLogger(MainController.class);

    @RequestMapping(value = {"/", "/index"})
    public String index() {

        logger.fatal("Log fatal");
        logger.error("Log error");
        logger.warn("Log warn");
        logger.debug("Log debug");

        return "index";
    }
}
