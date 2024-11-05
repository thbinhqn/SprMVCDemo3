package vn.itqnu.SprMVCDemo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String showLoginPage() {
		return "welcome";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("username") String username,
						@RequestParam("password") String password,
						Model model) {
		//if(userService.validateUser(username, password)) {
		if(true) {
			model.addAttribute("username", username);
			return "welcome";
		} else {
			model.addAttribute("error", "Invalid username or password");
			return "login";
		}
	}
}
