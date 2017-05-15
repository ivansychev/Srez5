package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ivans on 15/05/2017.
 */
@Controller
public class IndexServlet{

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String onGet()
    {
        return "login";
    }
}
