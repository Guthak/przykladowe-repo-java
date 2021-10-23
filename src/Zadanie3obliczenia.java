public class Zadanie3obliczenia {

    private float a;
    private float b;
    private float c;

    private float delta;

    public Zadanie3obliczenia(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = (float) Math.pow(b, 2) - 4 * a * c;
    }

    public Float cacluateX1() {
        if (delta < 0) {
            return null;
        } else {
            double x1 = -b - Math.sqrt(delta) / 2 * a;
        }


        public Float calcualteX2;
        {
            if (delta < 0) {
                return null;
            } else {
                double x2 = -b + Math.sqrt(delta) / 2 * a;
            }
        }
    }
}



