package yourOrderPls;

public class YourOrderPls {
    //With the best solution I have learned a lot how work with Strings :), Improve our skills is a process
    public static void main(String[] args) {
        System.out.println(Order.order("is2 Thi1s T4est 3a"));
    }

    public static class Order {
        public static String order(String words) {
            String[] arr = words.split(" ");
            int pos = 0;
            String current = null;

            for (int i = 0; i < arr.length; i++)
            {
                pos = i;
                current = arr[i];

                while ((pos > 0) && (getInt(arr[pos - 1]) > getInt(current)))
                {
                    arr[pos] = arr[pos - 1];
                    pos--;
                }
                arr[pos] = current;
            }
            StringBuilder result = new StringBuilder();
            for (String s : arr)
                result.append(s+" ");
            return result.toString().trim();
        }

        private static int getInt(String s) {
            for (int i = 0; i < s.length(); i++) {
                try {
                    return Integer.parseInt(s.substring(i, i+1));
                } catch (Exception e) {}
            }
            return -1;
        }
    }
}
