package callcenter.Model;

public class ProductManager extends Employee {

    private static class SingletonHolder{
        private static ProductManager INSTANCE = new ProductManager();
    }

    private ProductManager(){
    }

    public static ProductManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void handleRequest(boolean isHandle) {
        if(isHandle){
            System.out.println("我是PM,您的問題已經處理完畢,感謝您");
        } else{
            System.out.println("我是PM,您的問題我們需要開會討論後才能決定,請過幾天再打來");
        }
    }
}
