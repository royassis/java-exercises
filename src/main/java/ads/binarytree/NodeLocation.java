package ads.binarytree;

public class NodeLocation{
    Integer val=null;
    Integer leftOrRightChild = null;
    Integer xLoc = null;
    Integer level = null;
    
    public NodeLocation(Integer val, Integer leftOrRightChild, Integer xLoc, Integer level) {
        this.val = val;
        this.leftOrRightChild = leftOrRightChild;
        this.xLoc = xLoc;
        this.level = level;
    }

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    public Integer getLeftOrRightChild() {
        return leftOrRightChild;
    }

    public void setLeftOrRightChild(Integer leftOrRightChild) {
        this.leftOrRightChild = leftOrRightChild;
    }

    public Integer getXIdx() {
        return xLoc;
    }

    public void setxLoc(Integer xLoc) {
        this.xLoc = xLoc;
    }

    @Override
    public String toString() {
        // return "[y=" + level + ", v=" + val + ", x="+ xLoc + "]";
        return Integer.toString(val);
    }

    public Integer getLevel() {
        return level;
    }


    public void setLevel(Integer level) {
        this.level = level;
    }
    
}
