package MatrixPackage;

public class MatrixEle {
    private Integer x;
    private Integer y;
    public MatrixEle(Integer newX, Integer newY){
        x = newX;
        y = newY;
    }
    public MatrixEle(MatrixEle matrixEle){
        x = matrixEle.getX();
        y = matrixEle.getY();
    }

    public Integer getX() {
        return x;
    }
    public void setX(Integer x) {
        this.x = x;
    }
    public Integer getY() {
        return y;
    }
    public void setY(Integer y) {
        this.y = y;
    }
    public void addX() {
        this.x++;
    }
    public void addY() {
        this.y++;
    }
    public void reduceX() {
        this.x--;
    }
    public void reduceY() {
        this.y--;
    }
    public String toString() {
        return String.format("(%d,%d)", getX(), getY());
    }

}
