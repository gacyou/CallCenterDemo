package callcenter.Model;

public abstract class Employee {

    private Employee next;

    public void setNext(Employee next) {
        this.next = next;
    }

    public Employee getNext() {
        return next;
    }

    //處理請求
    public abstract void handleRequest(boolean isHandle);
    //擲骰子(1~3),大於1為不能處理,需上報
    public static boolean roll(){

        boolean isHandle;
        int rand = (int)(Math.random() * 2 +1);
        switch (rand){
            case 1:
                isHandle = false;
                break;
            default:
                isHandle = true;
                break;
        }
        return isHandle;
    }
}
