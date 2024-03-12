package onyx.dockertest;

import org.springframework.stereotype.Service;

@Service
public class MainViewResourceService {
    public String getBackgroundImagePath(String envColor) {

        return switch (envColor) {

            case "BLACK" -> "black";
            case "BLUE" -> "blue";
            case "GREEN" -> "green";
            case "RED" -> "red";
            case "WHITE" -> "white";

            default -> "yellow";
        };
    }
}
