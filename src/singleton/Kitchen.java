package singleton;

public class Kitchen {

    public static Kitchen kitchen = null;

    private int burnerCount;

    public Kitchen(int burnerCount) {
        this.burnerCount = burnerCount;
    }

    public static Kitchen getInstance(){
        if(kitchen==null){
            kitchen = new Kitchen(3);
        }
        return kitchen;
    }


}

/*
if there exist a class, for which at any point in time, only 1 object exists
then it is called a singleton class
 */

class Demo{
    public static void main(String[] args) {
        Kitchen k1 = new Kitchen(3);
        Kitchen k2 = new Kitchen(3);

    }
}
