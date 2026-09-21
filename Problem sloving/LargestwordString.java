
class LargestwordString {

    public static void main(String[] args) {
        String str = "Java Program is Hard";
        
        String words[] = str.split(" ");

        String max = "";

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > max.length()) {
                max = words [i];
            }
        }

        System.out.println(max);

    }
}
