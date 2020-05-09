package eight_1;

public class TurboEngine extends AbstractEngine {
    public TurboEngine(int size){
        super(size,true);
    }

    @Override
    public boolean inTurbo() {
        return true;
    }
}
