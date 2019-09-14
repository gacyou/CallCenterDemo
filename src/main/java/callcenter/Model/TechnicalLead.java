package callcenter.Model;

public class TechnicalLead extends Employee {

    private static class SingletonHolder{
        private static TechnicalLead INSTANCE = new TechnicalLead();
    }

    private TechnicalLead(){
    }

    public static TechnicalLead getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void handleRequest(boolean isHandle) {
        if(isHandle){
            System.out.println("我是TL,您的問題已經處理完畢,感謝您");
        } else{
            System.out.println("我是TL,正在幫您連絡相關主管,請稍等");
            ProductManager.getInstance().handleRequest(ProductManager.roll());
        }
    }
}
