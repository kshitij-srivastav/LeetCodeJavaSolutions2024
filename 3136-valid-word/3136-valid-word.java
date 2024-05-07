import java.util.regex.*;
class Solution {
    public boolean isValid(String word) {
         String regex = "^(?=.*[aeiouAEIOU])(?=.*[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ])[a-zA-Z0-9]{3,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(word);
        if (matcher.matches()) {
           return true;
        } else {
           return false;
        }
    }
}