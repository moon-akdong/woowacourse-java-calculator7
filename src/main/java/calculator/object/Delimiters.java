package calculator.object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Delimiters {
    public static final String SPECIALDELIMITER_END = "\\\\n";
    private final String[] basicDelimiters = {",", ":"};
    private final String specialDelimitersStart = "//";
    private final String specialDelimitersEnd = "\\n";
    private String inputStr;

    public Delimiters(String inputStr) {
        this.inputStr = inputStr;
    }
    private boolean findSpecialDelimiters() {
        if (inputStr.contains(specialDelimitersStart) &&
                inputStr.contains(specialDelimitersEnd)) {
            return true;
        }
        return false;
    }

    private String getSpecialDelimiter() {
        return inputStr.split(SPECIALDELIMITER_END)[0].split(specialDelimitersStart)[1];
    }

    public String getFilterString() {
        if (findSpecialDelimiters()) {
            return inputStr.split(SPECIALDELIMITER_END)[1];
        }
        return inputStr;
    }

    public List<String> getDelimiters() {
        List<String> delimiters = new ArrayList<>();

        if (findSpecialDelimiters()){
            String specialDelimiter = getSpecialDelimiter();
            delimiters.add(specialDelimiter);

        }
        delimiters.addAll(Arrays.asList(basicDelimiters));
        return delimiters;
    }

}
