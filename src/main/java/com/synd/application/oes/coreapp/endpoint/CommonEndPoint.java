package com.synd.application.oes.coreapp.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * *****************************************************************
 *
 * @author - Md. Badi-Uz-Zaman Shajib
 * @copyright 2015.
 * @email - mbzshajib@gmail.com
 * @gitHub - https://github.com/mbzshajib
 * @date: 12/3/2015
 * @time: 11:59 PM
 * ****************************************************************
 */

@RestController
public class CommonEndPoint {
    @RequestMapping(path = "/",method = RequestMethod.GET)
    public String index() {
        return "Welcome to Online Examination System";
    }
}
