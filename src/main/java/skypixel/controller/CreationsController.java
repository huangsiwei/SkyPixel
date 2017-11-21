package skypixel.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import skypixel.dao.HotMediaResourceRepository;
import skypixel.domain.HotMediaResource;
import skypixel.util.ResourceType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hsw11 on 2017/11/11.
 */
@Controller
public class CreationsController {

    @Autowired
    private HotMediaResourceRepository hotMediaResourceRepository;

    @RequestMapping("/creations/loadHotCreations")
    public @ResponseBody
    String loadHotCreations(@RequestParam("resourceType") ResourceType resourceType) {
        List<HotMediaResource> resourceList = hotMediaResourceRepository.findAllByResourceType(resourceType);
        Map<String, Object> resultData = new HashMap<>();
        resultData.put("resourceList", resourceList);
        return JSON.toJSONString(resultData);
    }
}
