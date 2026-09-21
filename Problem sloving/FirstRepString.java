class FirstRepString {
    public static void main(String[] args) {

        String str = "helweeelo";
        char rep = ' ';
                     
        for (int i = 0; i < str.length(); i++) {
                   
            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    rep = str.charAt(i);
                    break;
                }
            }

            if (rep != ' ') {
                break;
            }
        }

        System.out.println(rep);
    }
}