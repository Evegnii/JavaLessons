public class HomeWork_ObjectCreation {

    class Object{
        int i=5;
    }
    Object o1=new Object();
    Object o2=new Object();
    public void result(){
        o1.i=10;
        o2.i=20;
        o1=o2;
        //теперь о1 имеет идентичную ссылку как и о2 равное  20
    }











}
