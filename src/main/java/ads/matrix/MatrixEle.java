package ads.matrix;

public class MatrixEle {

    private Integer x;
    private Integer y;

    public MatrixEle(Integer newX, Integer newY) {
        x = newX;
        y = newY;
    }

    public MatrixEle(MatrixEle matrixEle) {
        x = matrixEle.getX();
        y = matrixEle.getY();
    }

    public MatrixEle() {
        x = 0;
        y = 0;
    }

    public MatrixEle reset() {
        setX(0);
        setY(0);
        return this;
    }

    public MatrixEle getNextEle(Integer i, Integer j) {
        return new MatrixEle(this.getX() + i, this.getY() + j);
    }

    public Integer getX() {
        return x;
    }

    public MatrixEle setX(Integer x) {
        this.x = x;
        return this;
    }

    public Integer getY() {
        return y;
    }

    public MatrixEle setY(Integer y) {
        this.y = y;
        return this;
    }

    public MatrixEle addX() {
        this.x++;
        return this;
    }

    public MatrixEle addY() {
        this.y++;
        return this;
    }

    public MatrixEle reduceX() {
        this.x--;
        return this;
    }

    public MatrixEle reduceY() {
        this.y--;
        return this;
    }

    public String toString() {
        return String.format("(%d,%d)", getX(), getY());
    }

    public Boolean equals(MatrixEle matrixEle) {
        return this.x == matrixEle.x && this.y == matrixEle.y;
    }

}
