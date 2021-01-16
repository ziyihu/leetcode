package leetcode.dfs;

public class _17_LetterCombinationsOfAPhoneNumber {
    String[] array = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits==null || digits.length()==0) return res;
        String[] answer = new String[digits.length()];
        
        dfs(0, digits, res, answer);
        return res;
    }
    
    public void dfs(int index, String digits, List<String> res, String[] answer) {
        if(index==digits.length()) {
            
            StringBuilder builder = new StringBuilder();
            for(String s : answer) {
                builder.append(s);
            }
            String str = builder.toString();
            res.add(str);
            return;
        }
        for(int i=0; i <array[digits.charAt(index)-'0'].length(); i++) {
            answer[index] = String.valueOf(array[digits.charAt(index)-'0'].charAt(i));
            dfs(index+1, digits, res,answer);
            
        }
        return;
    }
}
