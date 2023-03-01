public class Main {
    // diem trong mp 2D
    public class Point2D {
        private float x;
        public float getX() {
            return this.x;
        }
        private float y;
        public float getY() {
            return this.y;
        }
        public void getPoint2D(float x,float y) {
            getX();
            getY();
        }

    }
    
    // lop triangle
    public static void main(String[] args);
    public class Triangle {
        private float width;
        public float getWidth() {
            return this.width;
        }
        private float height;
        public float getHeight() {
            return this.height;
        }
        public void getTriangle(float width, float height) {
            getWidth();
            getHeight();
        }
        public void setWidth(float width) {
            this.width=width;
        }
        public void setHeight(float height) {
            this.height=height;
        }
        public String toString() {
            return width+" "+height;
        }
    }
    }
}

//Dinhnghiamotphanso;

public class Fraction {
    private int tuthuc;
    private int mauso;
    public Fraction() {
        tuthuc = 0;
        mauso = 1;
    }
    public Fraction(int tuthuc, int mauso) {
        if (mauso==0) {
            System.out.println("denominator are not equal to 0");
        }
        else {
            this.tuthuc = tuthuc;
            this.mauso = mauso;
        }
    }
    //Thêm phân số
    public Fraction add(Fraction f) {
        int nu = tuthuc * f.mauso + f.tuthuc * mauso;
        int de = mauso * f.mauso;
        return new Fraction(nu,de);
    }
    //Phân số phụ
    public Fraction sub(Fraction f) {
        int nu = tuthuc * f.mauso - f.tuthuc * mauso;
        int de = mauso * f.mauso;
        return new Fraction(nu,de);
    }
    public Fraction mul(Fraction f) {
        int nu = tuthuc * f.tuthuc;
        int de = mauso * f.mauso;
        return new Fraction(nu,de);
    }
    // chia phân số
    public Fraction div(Fraction f) {
        int t = f.tuthuc;
        f.tuthuc = f.mauso;
        f.mauso = t;
        int nu = tuthuc * f.tuthuc;
        int de = mauso * f.mauso;
        return new Fraction(nu,de);
    }
    public void reduce() {
        int a = tuthuc;
        int b = mauso;
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        tuthuc /= b;
        mauso /= b;
    }