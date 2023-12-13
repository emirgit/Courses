public class Floor {

    private double length;
    private double width;

    public Floor(double length, double width) {
        this.width = (width > 0 ? width : 0);
        this.length = (length > 0 ? length : 0);
    }

    public double getArea(){
        return this.width * this.length;
    }


}
