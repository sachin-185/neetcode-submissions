public class Solution {
    private static final String DELIMITER = "\u001f";

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "\u001e";
        return String.join(DELIMITER, strs);
    }

    public List<String> decode(String str) {
        if (str.equals("\u001e")) return new ArrayList<>();
        return Arrays.asList(str.split(DELIMITER, -1));
    }
}
