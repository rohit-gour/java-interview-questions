public class Demo extends SingletonClassExample{

    private Demo demo;
    private Demo(){
        super();
    }
    public Demo getInstance(){
        if(demo == null){
            demo = new Demo();
            return demo;
        }
        return demo;
    }
}
