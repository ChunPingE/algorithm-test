package leetcode.d20231229;

public class logestcommonprefix14 {
	public String longestCommonPrefix(String[] strs) {
		String prefix = "";
		if (strs.length == 0)
			return prefix;
		prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {
			String cur = strs[i];
			while (cur.indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		return prefix;
	}
}
