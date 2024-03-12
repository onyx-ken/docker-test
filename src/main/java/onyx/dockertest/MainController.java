package onyx.dockertest;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    @Value("${app.env.color}")
    private String envColor;

    private final MainViewResourceService mainViewResourceService;

    private final ColorNameConverter colorNameConverter;

    @GetMapping("/")
    String viewMain(Model model) {
        model.addAttribute("envColor", colorNameConverter.convertToKorean(envColor));
        model.addAttribute("envBackgroundImage", mainViewResourceService.getBackgroundImagePath(envColor));

        return "index";
    }
}
