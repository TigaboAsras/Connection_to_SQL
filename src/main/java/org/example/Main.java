package org.example;
/**
* @author :Tigabo
 * ID:329011274
**/
public class Main {
    public static void main(String[] args) {

        ConnectionToDB connectionMain=new ConnectionToDB();
        //connectionMain.insert("lsbv","zdvluvhd","ajebf");
        //connectionMain.veiwTable();
       /* connectionMain.Update("nehoraii","afaeg","46555",9);
        connectionMain.veiwTable();
        connectionMain.Update("tes","bule","67543",9);
        connectionMain.veiwTable();*/
        connectionMain.deleteRow(11);
        connectionMain.veiwTable();

    }
}
