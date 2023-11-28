import acm.program.ConsoleProgram;

public class test extends ConsoleProgram {
	public void run() {
		String haystack = readLine();
		String needle = readLine();
		println(strStr(haystack , needle));
		
	}
	public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;
        for(int i = 0; i < haystack.length(); i++) {
            int needleIndex = 0;
            if(haystack.charAt(i) == needle.charAt(needleIndex)){
                needleIndex++;
            }
             if(needleIndex == (needle.length()-1)) {
                    return (i - needleIndex);
             }
        }
        return -1;
    }
}
