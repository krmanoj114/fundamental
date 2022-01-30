package Interview;

public class FindUniqueCharInString {
    public static void main(String[] args) {
        String s = "hheelloworld";
        uniqueCharacterss(s);

    }

    private static void uniqueCharacterss(String test){
        String temp = "";
        int count=0;
        char[] ch = test.toCharArray();
        for(int i = 0; i <test.length(); i++) {
            count = 1;
            for(int j = i+1; j <test.length(); j++) {
                if(ch[i] == ch[j] && ch[i] != ' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    ch[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if(count == 1 && ch[i] != '0')
                System.out.println("Index :"+i+" Chracter :"+ch[i]);
        }

    }




    private static void find(String str) {
        int[] count = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (count[(int) str.charAt(i)] == 1) {
                System.out.print(str.charAt(i));
            }
        }

    }
}
