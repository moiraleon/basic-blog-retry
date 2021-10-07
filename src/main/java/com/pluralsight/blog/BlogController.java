package com.pluralsight.blog;

import com.pluralsight.blog.data.LoginUser;
import com.pluralsight.blog.data.NewDevice;
import com.pluralsight.blog.data.PostRepository;
import com.pluralsight.blog.model.Post;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BlogController {
    private PostRepository postRepository;


    public BlogController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    @RequestMapping("/")
    public String listPosts(ModelMap modelMap) {
        List<Post> posts = postRepository.getAllPosts();
        modelMap.put("posts", posts);
        return "home";
    }

    @RequestMapping("/post/{id}")
    public String postDetails(@PathVariable Long id, ModelMap modelMap) {
        Post post = postRepository.findById(id);
        modelMap.put("post", post);
        return "post-details";

    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String init(Model model) {
        model.addAttribute("loginUser", new LoginUser());
        model.addAttribute("msg", "Please Enter Your Login Details");
        return "login";
    }

    @PostMapping(value = "/login")
    public String getNewPage(Model model, @ModelAttribute LoginUser loginUser) {
        if (loginUser.getUserName().equals("username") && loginUser.getPassword().equals("password")) {
            model.addAttribute("msg", "Please Enter Smart Device Details");
            model.addAttribute("error", " ");
            return "add-smart-washer";

        } else {
            model.addAttribute("error", "Invalid Login Information. Please try again.");
            return "login";
        }
    }

    @RequestMapping("/new-device")
    public String addNewDevicePage(Model model) {
        model.addAttribute("newDevice", new NewDevice());
        return "new-device";
    }

    @PostMapping(value = "/new-device")
    public String listDevices(Model model, @ModelAttribute NewDevice newDevice) {
        if (newDevice.getMake().equals("make") && newDevice.getModel().equals("model")) {
            model.addAttribute("msg","Please enter device credentials");
            model.addAttribute("error"," ");
            return "new-device";
        }
        else{
            model.addAttribute("error", "Invalid Device Entry. Please try again.");
            return "new-device";
        }
    }

    @RequestMapping("/profile")
    public String profilePage(Model model) {
        return "profile";
    }

}
