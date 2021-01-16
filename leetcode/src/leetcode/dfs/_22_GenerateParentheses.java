package leetcode.dfs;

public class _22_GenerateParentheses {
    List<String> result = new ArrayList<>();
    String[] s;
    public List<String> generateParenthesis(int n) {
        s = new String[n*2];
        dfs(0,n,n,n*2);
        return result;
    }
    public void dfs(int index, int leftLeft, int rightLeft, int count) {
        if(index == count) {
            StringBuilder builder = new StringBuilder();
            for(String sChar : s) {
                builder.append(sChar);
            }
            String str = builder.toString();
            result.add(str);
        }
        
        if(leftLeft >0) {
            s[index] = "(";
            dfs(index+1, leftLeft-1, rightLeft,count);
        }
        if(rightLeft>0 && leftLeft<rightLeft) {
            s[index] = ")";
            dfs(index+1, leftLeft, rightLeft-1,count);
        }
    }
}
