public abstract class AbstractEngine implements Engine {
    private int size;//엔진 크기
    private boolean turbo;//터보 충전 유무

    public AbstractEngine(int size,boolean turbo){
        this.size =size;
        this.turbo =turbo;
    }
    public int getSize(){ return this.size; }
    public  boolean isTurbo(){
        return this.turbo;
    };

}
