package rota.projeto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
/* import org.springframework.web.bind.annotation.RequestMapping;*/
import org.springframework.web.bind.annotation.RestController;
/* import org.springframework.web.servlet.ModelAndView;*/


@SpringBootApplication
@RestController
public class Application{

    @Autowired
    @Qualifier("appName")
    private String appName;

    @Autowired
    @Qualifier("appName2")
    private String appName2;

    @Autowired
    @Qualifier("appName3")
    private String appName3;

    @Autowired
    @Qualifier("appName4")
    private String appName4;

    @Autowired
    @Qualifier("appName5")
    private String appName5;

    @GetMapping("/")
    public String index(){
        return appName;
    }

    @GetMapping("/404")
    public String erro(){
        return appName2;
    }

    @GetMapping("/integrante")
    public String integrante(){
        return appName3;
    }

    @GetMapping("/cep")
    public String cep(){
        return appName4;
    }

    @GetMapping("/notas")
    public String notas(){
        return appName5;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
