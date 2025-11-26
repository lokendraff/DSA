class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        helper(s, 0, new StringBuilder(), list);
        return list;
    }
    
    private void helper(String s, int i, StringBuilder sb, List<String> list) {
        if (i == s.length()) {
            list.add(sb.toString());
            return;
        }

        char ch = s.charAt(i);

        if (Character.isLetter(ch)) {
            sb.append(Character.toLowerCase(ch));
            helper(s, i + 1, sb, list);
            sb.deleteCharAt(sb.length() - 1);

            sb.append(Character.toUpperCase(ch));
            helper(s, i + 1, sb, list);
            sb.deleteCharAt(sb.length() - 1);

        } else {
            sb.append(ch);
            helper(s, i + 1, sb, list);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
