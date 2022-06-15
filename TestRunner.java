

import java.io.*;
import java.util.ArrayList;


public class TestRunner extends FileImporter {


    private static String[] args;

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Iporter> pp = new ArrayList<Iporter>();
        Iporter d = new Iporter("Osem", "Eli", "025898565", 1);
        Iporter e = new Iporter("Elit", "Eli", "0532894600", 2);
        Iporter l = new Iporter("Liman", "Avi", "0505050254", 3);
        Iporter c = new Iporter("Coca Cola", "Noam", "0526589755", 4);
        Iporter t = new Iporter("Tempo", "Yair", "0526589755", 4);

//        Product d1 = new Product("Bamba", 2520, 7.9);
//        Product d2 = new Product("BisliGril", 2521, 6.9);
//        Product d3 = new Product("BisliOnion", 2522, 6.9);
//        Product d4 = new Product("BisliFalafel", 2523, 6.9);
//        Product d5 = new Product("BisliPizza", 2524, 6.9);
//        Product d6 = new Product("BambaNugat", 2525, 7.9);
//        Product d7 = new Product("Pasta", 2526, 4.9);
//        Product d8 = new Product("ManaHamaTahiland", 2527, 5.9);
//        Product d9 = new Product("ManaHamaCoscos", 2528, 5.9);
//        Product d10 = new Product("ManaHamaSpageti", 2529, 5.9);
//        Product d11 = new Product("HargliotChocolat", 25210, 9.9);
//        Product d12 = new Product("HargliotStrobarry", 25211, 9.9);
//        Product d13 = new Product("BambaBig", 25212, 9.9);
//        Product d14 = new Product("BisliGrilBig", 25213, 9.9);
//        Product d15 = new Product("BisliOnionBig", 25214, 9.9);
//        Product d16 = new Product("BisliFalafelBig", 25215, 9.9);
//        Product d17 = new Product("BisliPizzaBig", 25216, 9.9);
//        d.AddProduct(d1);
//        d.AddProduct(d2);
//        d.AddProduct(d3);
//        d.AddProduct(d4);
//        d.AddProduct(d5);
//        d.AddProduct(d6);
//        d.AddProduct(d7);
//        d.AddProduct(d8);
//        d.AddProduct(d9);
//        d.AddProduct(d10);
//        d.AddProduct(d11);
//        d.AddProduct(d12);
//        d.AddProduct(d13);
//        d.AddProduct(d14);
//        d.AddProduct(d15);
//        d.AddProduct(d16);
//        d.AddProduct(d17);
//
//        Product e1 = new Product("chipsOri", 1111, 5.9);
//        Product e2 = new Product("chipsOnion", 1112, 5.9);
//        Product e3 = new Product("chipsGril", 1113, 5.9);
//        Product e4 = new Product("chipsBarbiq", 1114, 5.9);
//        Product e5 = new Product("chipsCrahnch", 1115, 5.9);
//        Product e6 = new Product("chipsCrahnchGril", 1116, 5.9);
//        Product e7 = new Product("Thami", 1117, 5.9);
//        Product e8 = new Product("CifCaf", 1118, 5.9);
//        Product e9 = new Product("Egozi", 1119, 5.9);
//        Product e10 = new Product("PasekZmanOrgi", 1116, 5.9);
//        Product e11 = new Product("Mecopelet", 1120, 5.9);
//        Product e12 = new Product("SababaBarbiqu", 1121, 5.9);
//        Product e13 = new Product("Tortit", 1122, 5.9);
//        Product e14 = new Product("DoritosGril", 1123, 5.9);
//        Product e15 = new Product("DoritosDip", 1124, 5.9);
//        Product e16 = new Product("DoritosHot", 1125, 5.9);
//        Product e17 = new Product("DoritosHotCheese", 1126, 5.9);
//        Product e18 = new Product("Sababa", 1127, 5.9);
//        e.AddProduct(e1);
//        e.AddProduct(e2);
//        e.AddProduct(e3);
//        e.AddProduct(e4);
//        e.AddProduct(e5);
//        e.AddProduct(e6);
//        e.AddProduct(e7);
//        e.AddProduct(e8);
//        e.AddProduct(e9);
//        e.AddProduct(e10);
//        e.AddProduct(e11);
//        e.AddProduct(e12);
//        e.AddProduct(e13);
//        e.AddProduct(e14);
//        e.AddProduct(e15);
//        e.AddProduct(e16);
//        e.AddProduct(e17);
//        e.AddProduct(e18);
//
//
//
//        Product l1 = new Product("Boten",3001 , 11.9);
//        Product l2 = new Product("Kabokim",3002 , 11.9);
//        Product l3 = new Product("Nuts", 3003, 11.9);
//        Product l4 = new Product("MentosStrobery", 3004, 11.9);
//        Product l5 = new Product("MentosMint", 3005, 11.9);
//        Product l6 = new Product("MentosWaterMelon",3006 , 11.9);
//        Product l7 = new Product("MentosMintHard",3007 , 11.9);
//        Product l8 = new Product("LoakerWhite", 3008, 14.9);
//        Product l9 = new Product("LoakerDark",3009 , 14.9);
//        Product l10 = new Product("LoakerMilk", 3010, 14.9);
//        Product l11 = new Product("LoakerCoconut",3011 , 14.9);
//        l.AddProduct(l1);
//        l.AddProduct(l2);
//        l.AddProduct(l3);
//        l.AddProduct(l4);
//       l.AddProduct(l5);
//        l.AddProduct(l6);
//        l.AddProduct(l7);
//        l.AddProduct(l8);
//        l.AddProduct(l9);
//        l.AddProduct(l10);
//        l.AddProduct(l11);
//
//        Product c1 = new Product("ColaZero-1.5L", 4001, 11.9);
//        Product c2 = new Product("Cola-1.5L", 4002, 11.9);
//        Product c3 = new Product("ColaZero-1L", 4003, 9.9);
//        Product c4 = new Product("ColaZero-0.5L", 4004, 8.5);
//        Product c5 = new Product("Cola-1L", 4005, 9.9);
//        Product c6 = new Product("Cola-0.5L", 4006, 8.5);
//        Product c7 = new Product("ColaCan-0.3L", 4007, 8);
//        Product c8 = new Product("ColaZeroCan-0.3L", 4008, 8);
//        Product c9 = new Product("SpriteZero-1.5L", 4009, 11.9);
//        Product c10 = new Product("SpriteZero-0.5L", 4010, 8.5);
//        Product c11 = new Product("SpriteCan-0.3L", 4011, 8);
//        Product c12 = new Product("Sprite-1.5L", 4012, 11.9);
//        Product c13 = new Product("Sprite-0.5L", 4013, 8.5);
//        Product c14 = new Product("Sprite-0.3L", 4014, 8);
//        Product c15 = new Product("FantaOrange-1.5L", 4015, 11.9);
//        Product c16 = new Product("FantaOrange-0.5L", 4016, 8.5);
//        Product c17 = new Product("FantaOrangeZero-1.5L", 4017, 11.9);
//        Product c18 = new Product("PrigatGrap-1.5L", 4018, 12.9);
//        Product c19 = new Product("PrigatGrap-0.5L", 4019, 8.9);
//        Product c20 = new Product("PrigatOrange-1.5L", 4020, 12.9);
//        Product c21 = new Product("PrigatOrange-0.5L", 4021, 8.9);
//        Product c22 = new Product("WaterNeviot-1.5L", 4022, 8.9);
//        Product c23 = new Product("WaterNeviot-1L", 4023, 8);
//        Product c24 = new Product("WaterNeviotSport-0.5L", 4024, 7);
//        Product c25 = new Product("WaterNeviot-0.5L", 4025, 7);
//
//        c.AddProduct(c1);
//        c.AddProduct(c2);
//        c.AddProduct(c3);
//        c.AddProduct(c4);
//        c.AddProduct(c5);
//        c.AddProduct(c6);
//        c.AddProduct(c7);
//        c.AddProduct(c8);
//        c.AddProduct(c9);
//        c.AddProduct(c10);
//        c.AddProduct(c11);
//        c.AddProduct(c12);
//        c.AddProduct(c13);
//        c.AddProduct(c14);
//        c.AddProduct(c15);
//        c.AddProduct(c16);
//        c.AddProduct(c17);
//        c.AddProduct(c18);
//        c.AddProduct(c19);
//        c.AddProduct(c20);
//        c.AddProduct(c21);
//        c.AddProduct(c22);
//        c.AddProduct(c23);
//        c.AddProduct(c24);
//        c.AddProduct(c25);
//

        Product t1 = new Product("XL", 5001, 7.9);
        Product t2 = new Product("SapaApple-0.3L", 5002, 9.9);
        Product t3 = new Product("SapaPeach-0.3L", 5003, 9.9);
        Product t4 = new Product("SapaMelon-0.3L", 5004, 9.9);
        Product t5 = new Product("SapaApple-1L", 5005, 15.9);
        Product t6 = new Product("SapaPeach-1L", 5006, 15.9);
        Product t7 = new Product("SapaMelon-1L", 5007, 15.9);
        Product t8 = new Product("Pepsi-1.5L", 5008, 11.9);
        Product t9 = new Product("Pepsi-0.5L", 5009, 7.9);
        Product t10 = new Product("PepsiMax-1.5L", 5010, 11.9);
        Product t11 = new Product("PepsiMax-0.5L", 5011, 7.9);
        Product t12 = new Product("Soda-1.5L", 5012, 6.9);
        Product t13 = new Product("Soda-0.3L", 5013, 5.9);
        Product t14 = new Product("ArizonaPeach-0.5L", 5014, 9.9);
        Product t15 = new Product("ArizonaTea-0.5L", 5015, 9.9);
        Product t16 = new Product("JumexMango", 5016, 5.9);
        Product t17 = new Product("JumexPeach", 5017, 5.9);
        Product t18 = new Product("JumexPinnapple", 5018, 5.9);
        t.AddProduct(t1);
        t.AddProduct(t2);
        t.AddProduct(t3);
        t.AddProduct(t4);
        t.AddProduct(t5);
        t.AddProduct(t6);
        t.AddProduct(t7);
       t.AddProduct(t8);
        t.AddProduct(t9);
        t.AddProduct(t10);
        t.AddProduct(t11);
        t.AddProduct(t12);
        t.AddProduct(t13);
        t.AddProduct(t14);
        t.AddProduct(t15);
        t.AddProduct(t16);
        t.AddProduct(t17);
        t.AddProduct(t18);


//        initFileIporter("Liman",l);
//        initFileIporter("Osem",d);
        //     initFileIporter("Coca Cola",c);
            initFileIporter("Tempo",t);

        Stock s = new Stock();
        // FileStock.initFileStock(s);
        // s.AddIporterFromFile("Coca Cola");

//        s.AddIporterFromFile("Osem");
//        s.AddIporterFromFile("Elit");
//        s.AddIporterFromFile("Liman");
//        s.AddIporterFromFile("Tempo");

        //   s.UpdateProductToFileStock(1,2525,10);

    }


}



