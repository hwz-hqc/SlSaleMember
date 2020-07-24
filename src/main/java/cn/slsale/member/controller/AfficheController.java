package cn.slsale.member.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author testpage
 * @since 2020-07-24
 */
@Controller
@RequestMapping("")
public class AfficheController {

    @RequestMapping("/index")
    public  String test(){
        return  "index";
    }

}
