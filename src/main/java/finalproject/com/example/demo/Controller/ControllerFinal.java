package finalproject.com.example.demo.Controller;


import finalproject.com.example.demo.Entity.EntityFinal;
import finalproject.com.example.demo.Service.FinalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
public class ControllerFinal {

   private final FinalService finalService;

    public ControllerFinal(FinalService finalService) {
        this.finalService = finalService;
    }


    @GetMapping("/index")
    String Gitpls(Model model){
     model.addAttribute("git","gittim");
     model.addAttribute("finals",finalService.getAll());

     return "index";

 }
  @GetMapping("/getall")
  public List<EntityFinal> Getallperson(){
        return finalService.getAll();
   }

    @GetMapping("/{id}")
    public ResponseEntity<EntityFinal> findById(@PathVariable Integer id){
        Optional<EntityFinal> userEntity=finalService.findbyid(id);
        return userEntity.map(response->ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/register")
    public String showsingUpForm(Model model){
        model.addAttribute("user",new EntityFinal());

        return "register";
    }

    @GetMapping("/list_usersnew")
    public String viewUserList(Model model){
        List<EntityFinal> listusers=finalService.getAll();
        model.addAttribute("users",listusers);

        return "list_usersnew";
    }

    @PostMapping("/process_register")
    public String processRegister(EntityFinal entityFinal) {
     finalService.saveuser(entityFinal);

        return "redirect:/list_usersnew";
    }

    @PostMapping("/delete_final/{id}")
    public String delete(@PathVariable Integer id, Model model){
        finalService.deletebyid(id);
       // model.addAttribute("todos", finalService.getAll());

        return "redirect:/list_usersnew";
    }






}


