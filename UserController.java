package main.java.controller;

import com.alibaba.fastjson.JSON;
import main.java.entity.DevUser;
import main.java.service.UserService;
import main.java.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.HashMap;

@Controller
public class UserController extends BaseController {
    @Autowired
    UserService userService;

   @RequestMapping(value = "/add",method = RequestMethod.GET)
   public String add(DevUser devUser){
       System.out.println("进入addGet");
       return "add";
   }

    @RequestMapping(value = "/add",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Object addSave(@Valid DevUser devUser, BindingResult bindingResult,String kaikai,Integer aa){
       if (bindingResult.hasErrors()){
           System.out.println("数据验证出错");
            return "add";
       }
        System.out.println("进入addPost");
        System.out.println(kaikai);
        System.out.println(devUser+","+aa);
        HashMap<String,Object> stringObjectHashMap = new HashMap<>();
        stringObjectHashMap.put("user",devUser);
        stringObjectHashMap.put("name","马志凯");
        return JSON.toJSON(stringObjectHashMap);
    }




}
