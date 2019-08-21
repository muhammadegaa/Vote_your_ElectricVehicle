package com.example.electricvehicle;

import java.util.ArrayList;

public class CarsData {
    public static String[][] data = new String[][]{
            {"Audi e-tron (2018)", "200 km/h (124 mph) top speed, 6.6 s acceleration, 5 persons capacity and 8.5 hours of charging time", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Audi_e-tron%2C_Paris_Motor_Show_2018%2C_IMG_0442.jpg/420px-Audi_e-tron%2C_Paris_Motor_Show_2018%2C_IMG_0442.jpg"},
            {"BMW i3", "With 150 km/h (93 mph) top speed, 8 s acceleration, 4 persons capacity and 4-6 hours of charging time with the 240 V charging unit", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/2018_BMW_i3_facelift_%281%29.jpg/420px-2018_BMW_i3_facelift_%281%29.jpg"},
            {"BMW Zinoro 1E", "With 130 km/h (81 mph) top speed, 7.6 s acceleration, 4 or 5 persons capacity depending on size of passenger", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b3/Zinoro_1E.jpg/180px-Zinoro_1E.jpg"},
            {"BYD e6", "With 140 km/h (87 mph) top speed, 8 s acceleration, 5 persons capacity and 2 hours of charging time (VTOG 30 kW AC charging) \n" +
                    "8—9h (SAE Level 2 AC charging)", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/2014_BYD_E6.jpg/800px-2014_BYD_E6.jpg"},
            {"Chevrolet Bolt EV", "With 150 km/h (93 mph) top speed, 6.5 s acceleration, 5 persons capacity ", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/2017_Chevrolet_Bolt_EV_Premier_front_6.20.18.jpg/420px-2017_Chevrolet_Bolt_EV_Premier_front_6.20.18.jpg"},
            {"Citroën C-Zero", "130 km/h (81 mph) top speed, 15.9 s acceleration, 4 persons capacity and 7 hours when charged from household; 30 minutes when charging from a quick charger system", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/2010_Mitsubishi_i-MiEV_%28GA_MY10%29_hatchback_%282015-11-11%29_01.jpg/420px-2010_Mitsubishi_i-MiEV_%28GA_MY10%29_hatchback_%282015-11-11%29_01.jpg"},
            {"Fiat 500e", "142 km/h (88 mph) top speed and 8.5 s acceleration", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/2013-03-05_Geneva_Motor_Show_8283_Fiat_500e.jpg/420px-2013-03-05_Geneva_Motor_Show_8283_Fiat_500e.jpg"},
            {"Ford Focus Electric", "135 km/h (84 mph) top speed, 9.9 s acceleration, 5 persons capacity and 30 hours when charged from 120 V, 5.5 hours of charging time when charged from 240 V and 0.5 hours charge to 80% with DC Fast Charge", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cb/2012_Ford_Focus_Electric_2011_LA_Auto_Show.jpg/420px-2012_Ford_Focus_Electric_2011_LA_Auto_Show.jpg"},
            {"Honda Fit EV", "148 km/h (92 mph) top speed and 9.5 s acceleration", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Honda_Fit_EV_2011_LA_Auto_Show.jpg/330px-Honda_Fit_EV_2011_LA_Auto_Show.jpg"},
            {"Tesla Model X", "210 km/h (130 mph) (60D) - 261 km/h (162 mph) (P100D) top speed, 4.7s (100D) - 2.9s (P100D) acceleration, 5-7 persons capacity and 8 hours of charging time", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/2017_Tesla_Model_X_100D_Front.jpg/420px-2017_Tesla_Model_X_100D_Front.jpg"},
    };
    public static ArrayList<Car> getListData(){
        ArrayList<Car> list = new ArrayList<>();
        for (String[] aData : data) {
            Car car = new Car();
            car.setName(aData[0]);
            car.setDetail(aData[1]);
            car.setPhoto(aData[2]);
            list.add(car);
        }
        return list;
    }
}
