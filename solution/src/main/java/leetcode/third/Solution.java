package leetcode.third;

import java.util.HashSet;

/**
 * @Author: ZiJian Hu
 * @Description:
 * @Date: Created in 9:07 PM 07/05/2018
 * @Modified By:
 */
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        char[] c = new char[s.length()];
        s.getChars(0, s.length(), c, 0);
        int max = 0;
        HashSet<Character> set = new HashSet<>(s.length());
        for (int i = 0, j = 0; j < c.length && i<c.length ; ) {
            if (!set.contains(c[j])) {
                set.add(c[j]);
                j++;
                max = Math.max(set.size(),max);
            } else {
                set.remove(c[i]);
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int asfwenclvdjlefskdjfs = lengthOfLongestSubstring("asfwenclvdjlefskdjfs");
        System.out.println(asfwenclvdjlefskdjfs);
        System.out.println(lengthOfLongestSubstring("bbbbb"));

    }
}
