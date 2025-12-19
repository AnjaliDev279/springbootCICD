@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Spring Boot + Docker + CI/CD 🚀";
    }
}
