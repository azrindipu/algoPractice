package test;

import djkstra.Graph;

import java.text.ParseException;

public class MainClass {
    public static void main(String[] args) throws ParseException {
        //SortDateList sortDateList = new SortDateList();
        //sortDateList.sortDate();

        String string = "Org Name: ${orgName}\\nMerchant Name: ${merchantName}\\nDelivery Id: ${deliveryId}\\nDelivery Man's Name: ${deliveryManName}\\nDelivery Man's Phone: ${deliveryManPhone}\\nReceiver's Name: ${receiverName}\\nReceiver's Phone: ${receiverPhone}\\nAssigned";
        String newString = string.replaceAll("\\\\n", "\n");
        System.out.println(newString);
    }
}
