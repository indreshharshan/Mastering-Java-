class RemoveDuplicateChar {
    public static void main(String[] args) {

        String str = "prooograammmmiiinnnggg";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < result.length(); j++) {

                if (str.charAt(i) == result.charAt(j)) {
                    count++;
                }
            }

            if (count == 0) {
                result = result + str.charAt(i);
            }
        }

        System.out.println(result);
    }
}