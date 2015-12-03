package com.synd.application.oes.coreapp.endpoint;

import com.synd.application.oes.coreapp.constant.OesConstants;
import com.synd.application.oes.coreapp.endpoint.model.EPIndex;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public EPIndex index() {
        EPIndex epIndex = new EPIndex();
        epIndex.setName(OesConstants.APP_NAME);
        List<String> owners = new ArrayList<String>();
        owners.add(OesConstants.ARAFAT);
        owners.add(OesConstants.SHAJIB);
        owners.add(OesConstants.SHUVO);
        epIndex.setOwners(owners);
        return epIndex;
    }
}
