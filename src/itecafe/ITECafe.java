package itecafe;

import java.util.Scanner;

public class ITECafe {

    public static void main(String[] args) {
        Item hotcoffee = new Item(1, "ホットコーヒー", 280);
        Item tea = new Item(2, "紅茶", 260);
        Item icecoffee = new Item(3, "アイスコーヒー", 200);
        Item icetea = new Item(4, "アイスティー", 260);
        Item shortcake = new Item(5, "ショートケーキ", 400);
        Item cheesecake = new Item(6, "チーズケーキ", 400);
        Item chocolatecake = new Item(7, "チョコレートケーキ", 450);
        Item chocolatebananaparfait = new Item(8, "チョコバナナパフェ", 390);
        Item strawberryparfait = new Item(9, "イチゴパフェ", 390);
        Item meatpasta = new Item(10, "ミートパスタ", 650);
        Item mixpizza = new Item(11, "ミックスピザ", 700);
        Item croissant = new Item(12, "クロワッサン", 180);
        Item toastsandwich = new Item(13, "トーストサンド", 200);
        Item frenchtoast = new Item(14, "フレンチトースト", 210);

        Item[] items = new Item[20];
        items[0] = hotcoffee;
        items[1] = tea;
        items[2] = icecoffee;
        items[3] = icetea;
        items[4] = shortcake;
        items[5] = cheesecake;
        items[6] = chocolatecake;
        items[7] = chocolatebananaparfait;
        items[8] = strawberryparfait;
        items[9] = meatpasta;
        items[10] = mixpizza;
        items[11] = croissant;
        items[12] = toastsandwich;
        items[13] = frenchtoast;

        Scanner scan = new Scanner(System.in);

        int inputNum = 0;
        int inputNumA = 0;
        int summoney = 0;
        int castmoney = 0;
        String inputStrcastmoney;
        
        System.out.println("■■■ITECafeシステム■■■");
        System.out.println(hotcoffee.getNo() + ":" + hotcoffee.getName());
        System.out.println(tea.getNo() + ":" + tea.getName());
        System.out.println(icecoffee.getNo() + ":" + icecoffee.getName());
        System.out.println(icetea.getNo() + ":" + icetea.getName());
        System.out.println(shortcake.getNo() + ":" + shortcake.getName());
        System.out.println(cheesecake.getNo() + ":" + cheesecake.getName());
        System.out.println(chocolatecake.getNo() + ":" + chocolatecake.getName());
        System.out.println(chocolatebananaparfait.getNo() + ":" + chocolatebananaparfait.getName());
        System.out.println(strawberryparfait.getNo() + ":" + strawberryparfait.getName());
        System.out.println(meatpasta.getNo() + ":" + meatpasta.getName());
        System.out.println(mixpizza.getNo() + ":" + mixpizza.getName());
        System.out.println(croissant.getNo() + ":" + croissant.getName());
        System.out.println(toastsandwich.getNo() + ":" + toastsandwich.getName());
        System.out.println(frenchtoast.getNo() + ":" + frenchtoast.getName());

        for (;;) {
            System.out.println("商品番号を入力してください:");
            try {
                String inputStr;
                inputStr = scan.next();
                inputNum = Integer.parseInt(inputStr);
                System.out.println(inputNum);

                if (inputNum == 0) {
                    break;
                }

                System.out.println(items[inputNum - 1].getNo() + ":" + items[inputNum - 1].getName() + "" + items[inputNum - 1].getPrice() + "円が入力されました");

            } catch (NumberFormatException e) {
                System.out.println("【入力エラー:数値を入力してください】");
                continue;
            }

            System.out.println("個数を入力してください:");

            try {
                String inputStrA;
                inputStrA = scan.next();
                inputNumA = Integer.parseInt(inputStrA);
                System.out.println(inputNumA);
            } catch (NumberFormatException e) {
                System.out.println("【入力エラー:数値を入力してください】");
                continue;
            }
            System.out.println(items[inputNum - 1].getPrice() * inputNumA + "円が入力されました");
            summoney += items[inputNum - 1].getPrice() * inputNumA * 1.08;
            System.out.println("合計金額は" + summoney + "円です");
        }

        System.out.println("会計に移ります");
        System.out.println("合計金額は" + summoney + "です。");
        
        try {
                String inputStr;
                inputStrcastmoney = scan.next();
                castmoney = Integer.parseInt(inputStrcastmoney);
                System.out.println(castmoney + "円、お預かりします");

            } catch (NumberFormatException e) {
                System.out.println("【入力エラー:数値を入力してください】");
            }
        
       int oturi = castmoney - summoney; 
        System.out.println(oturi+"円のお返しになります");
    }
}
