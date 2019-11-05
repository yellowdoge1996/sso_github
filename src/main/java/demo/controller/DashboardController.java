package demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;

/**
 * <p>
 * 無
 * </p>
 *
 * @author NWT)hxl
 * @version 1.0
 * <p>
 * 変更履歴:
 * 2019/11/05 ： NWT)hxl ： 新規作成
 * @date 2019/11/05 9:39
 */
@RestController
public class DashboardController {
    @RequestMapping("/dashboard/message")
    public Map<String, Object> dashboard() {
        return Collections.<String, Object> singletonMap("message", "Yay!");
    }

    @RequestMapping("/dashboard/user")
    public Principal user(Principal user) {
        return user;
    }

    @Controller
    public static class LoginErrors {

        @RequestMapping("/dashboard/login")
        public String dashboard() {
            return "redirect:/#/";
        }

    }
    @RestController
    public static class Test{
        @RequestMapping("/dashboard/test")
        public String test(){
            return "123456";
        }
    }

}
