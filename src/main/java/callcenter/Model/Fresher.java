package callcenter.Model;

public class Fresher extends Employee {

    public void handleRequest(boolean isHandle) {
        if(isHandle){
            System.out.println("您的問題已經處理完畢,感謝您");
        } else{
            System.out.println("正在幫您連絡相關技術人員,請稍等");
            TechnicalLead.getInstance().handleRequest(TechnicalLead.roll());
        }
    }
}
