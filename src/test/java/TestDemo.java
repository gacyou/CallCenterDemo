import callcenter.Model.Employee;
import callcenter.Model.Fresher;
import callcenter.Model.ProductManager;
import callcenter.Model.TechnicalLead;

import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args)
    {
        //建立員工
        Employee fresher = new Fresher();
        //設定階層
        fresher.setNext(TechnicalLead.getInstance());
        TechnicalLead.getInstance().setNext(ProductManager.getInstance());
        //模擬客戶來電
        Scanner scanner = new Scanner(System.in);
        System.out.print("客服中心你好,請問你有什麼需求呢?:(隨意輸入) ");
        System.out.printf("已收到您的需求: %s ,%s", scanner.next(), "請稍等\n");

        fresher.handleRequest(fresher.roll());
    }
}
