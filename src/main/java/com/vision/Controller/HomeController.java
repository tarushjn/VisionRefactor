package com.vision.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by saurabhnagpal on 30/06/17.
 */
@Controller
public class HomeController {@RequestMapping(value="/")
public String index() {
    return "index";

    }
}
