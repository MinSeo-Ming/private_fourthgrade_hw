package eight_1;

public class StandardEngine extends AbstractEngine{
    public StandardEngine(int size){
        super(size,false);
    }

    @Override
    public boolean inTurbo() {
        return false;
    }
}
