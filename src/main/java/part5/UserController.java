package part5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/addUser1")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "userForm";
    }

    @RequestMapping(value = "/showUser")
    public String addUser(@ModelAttribute("user") User user){

        user.setId(3);
        user.setName("Bogdan");

        return "result";
    }
}
