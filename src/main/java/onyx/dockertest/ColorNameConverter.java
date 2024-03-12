package onyx.dockertest;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ColorNameConverter {
    private static final Map<String, String> colorMap = new HashMap<>();

    static {
        colorMap.put("BLACK", "검은색");
        colorMap.put("BLUE", "파란색");
        colorMap.put("GREEN", "초록색");
        colorMap.put("RED", "빨간색");
        colorMap.put("WHITE", "흰색");
        colorMap.put("YELLOW", "노란색");
    }

    public String convertToKorean(String colorInEnglish) {
        return colorMap.getOrDefault(colorInEnglish, "노란색");
    }

}
