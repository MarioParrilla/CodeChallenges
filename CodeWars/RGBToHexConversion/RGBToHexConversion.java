package RGBToHexConversion;

public class RGBToHexConversion {
    public static void main(String[] args) {
        System.out.println(RgbToHex.rgb(0,0,0));
        System.out.println(RgbToHex.rgb(255,255,255));
        System.out.println(RgbToHex.rgb(148, 0, 211));
        System.out.println(RgbToHex.rgb(-20, 275, 125));
    }

    public class RgbToHex {

        public static String rgb(int r, int g, int b) {
            String R = getValidValue(r);
            String G = getValidValue(g);
            String B = getValidValue(b);
            return ((R.length() < 2 ? "0"+R : R) +
                    (G.length() < 2 ? "0"+G : G) +
                    (B.length() < 2 ? "0"+B : B)).toUpperCase();
        }

        private static String getValidValue(int v) {
            if (v < 0)
                return Integer.toHexString(0);
            else if (v > 255)
                return Integer.toHexString(255);
            return Integer.toHexString(v);
        }
    }

}
