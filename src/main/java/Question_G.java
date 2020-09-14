public class Question_G {
    public static class Shoe {
        int shoeSize;
        String primaryColor;
        String secondaryColor;
        String laceColor;
        String shoeType;
        boolean highTop;
        boolean nonSlip;

        public int getShoeSize() {
            return shoeSize;
        }

        public void setShoeSize(int shoeSize) {
            this.shoeSize = shoeSize;
        }

        public String getPrimaryColor() {
            return primaryColor;
        }

        public void setPrimaryColor(String primaryColor) {
            this.primaryColor = primaryColor;
        }

        public String getSecondaryColor() {
            return secondaryColor;
        }

        public void setSecondaryColor(String secondaryColor) {
            this.secondaryColor = secondaryColor;
        }

        public String getLaceColor() {
            return laceColor;
        }

        public void setLaceColor(String laceColor) {
            this.laceColor = laceColor;
        }

        public String getShoeType() {
            return shoeType;
        }

        public void setShoeType(String shoeType) {
            this.shoeType = shoeType;
        }

        public boolean isHighTop() {
            return highTop;
        }

        public void setHighTop(boolean highTop) {
            this.highTop = highTop;
        }

        public boolean isNonSlip() {
            return nonSlip;
        }

        public void setNonSlip(boolean nonSlip) {
            this.nonSlip = nonSlip;
        }

        public Shoe(int shoeSize, String primaryColor, String secondaryColor, String laceColor, String shoeType, boolean highTop, boolean nonSlip) {
            this.shoeSize = shoeSize;
            this.primaryColor = primaryColor;
            this.secondaryColor = secondaryColor;
            this.laceColor = laceColor;
            this.shoeType = shoeType;
            this.highTop = highTop;
            this.nonSlip = nonSlip;
        }

        @Override
        public String toString() {
            return "Question_G{" +
                    "shoeSize=" + shoeSize +
                    ", primaryColor='" + primaryColor + '\'' +
                    ", secondaryColor='" + secondaryColor + '\'' +
                    ", laceColor='" + laceColor + '\'' +
                    ", shoeType='" + shoeType + '\'' +
                    ", highTop=" + highTop +
                    ", nonSlip=" + nonSlip +
                    '}';
        }
    }

    public static void main(String[] args) {
        Shoe van = new Shoe(12, "gray", "white", "White", "Casual wear", true, false);
        Shoe work = new Shoe(12, "black", "black", "black", "work", false, false);
        Shoe boot = new Shoe(12, "brown,", "dark brown", "gray", "hiking boot", true, false);
        System.out.println(van.getPrimaryColor());
        System.out.println(work.getShoeSize());
        van.setPrimaryColor("red");
        work.setShoeSize(13);
        System.out.println(van);
        System.out.println(work);
        System.out.println();
        System.out.println(van);
        System.out.println(work);
        System.out.println(boot);
    }
}
