package com.hhit.service2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class WorldController {

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    @ResponseBody
    public String world() {
        return "world ";
    }

}