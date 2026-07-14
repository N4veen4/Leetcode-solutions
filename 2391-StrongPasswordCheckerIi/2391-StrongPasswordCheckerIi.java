// Last updated: 14/07/2026, 14:49:10
class Solution {
    public boolean strongPasswordCheckerII(String password) {
      
        if (password.length() < 8) {
            return false;
        }
        
        String specialCharacters = "!@#$%^&*()-+";
        
        boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;
        
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            
            if (Character.isLowerCase(currentChar)) {
                hasLower = true;
            } else if (Character.isUpperCase(currentChar)) {
                hasUpper = true;
            } else if (Character.isDigit(currentChar)) {
                hasDigit = true;
            } else if (specialCharacters.indexOf(currentChar) != -1) {
                hasSpecial = true;
            }
            
            if (i > 0 && password.charAt(i) == password.charAt(i - 1)) {
                return false;
            }
        }
        
        return hasLower && hasUpper && hasDigit && hasSpecial;
    }
}

