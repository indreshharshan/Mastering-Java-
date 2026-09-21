class FirstnonrepString {
    public static void main(String[] args) {

        String str = "Java is easy and Java is fun";

        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            int count = 0;

            for (int j = 0; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(words[i]);
            }
        }
    }
}