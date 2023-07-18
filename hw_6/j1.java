package hw_6;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class j1 {
  static String filePathAction = "src/actions.txt";
    public static void main(String[] args) {

        Notebook nb1 = new Notebook("Huawei MateBook D 16", 16, 2.5, 8, 16, 512, "gray");
        Notebook nb2 = new Notebook("Huawei MateBook D 15", 15.6, 2.5, 4, 8, 256, "gray");
        Notebook nb3 = new Notebook("MSI GP66 Leopard 11UG-699XRU", 15.6, 4.2, 8, 16, 512, "black");
        Notebook nb4 = new Notebook("ASUS A516JP-EJ461", 15.6, 3.2, 4, 16, 512, "gray");
        Notebook nb5 = new Notebook("HIPER Expertbook MTL1577", 15.6, 1.7, 6, 8, 256, "gray");
        Notebook nb6 = new Notebook("HIPER DZEN MTL1569", 15.6, 2.7, 4, 8, 256, "gray");
        Notebook nb7 = new Notebook("MSI Sword 15 A12UE-487XRU", 15.6, 4.3, 14, 16, 512, "white");
        Notebook nb8 = new Notebook("MSI Modern 14 C5M-010XRU", 14, 1.4, 6, 16, 512, "black");
        Notebook nb9 = new Notebook("MSI GF63 Thin 11SC-623XRU", 15.6, 1.86, 6, 8, 256, "black");
        Notebook nb10 = new Notebook("Digma EVE 15 P417", 15.6, 1.54, 2, 8, 256, "black");
        Notebook nb11 = new Notebook("MSI Vector GP66 12UGSO-671RU", 15.6, 2.38, 14, 16, 1024, "black");
        Notebook nb12 = new Notebook("MSI Sword 17 A11UD-808XRU", 17.3, 2.6, 8, 16, 512, "white");
        Notebook nb13 = new Notebook("ADATA XPG Xenia 15KC", 15.6, 2.94, 8, 32, 1024, "black");
        Notebook nb14 = new Notebook("CHUWI Corebook Xpro", 15.6, 1.78, 4, 16, 512, "gray");
        Notebook nb15 = new Notebook("Xiaomi Redmibook Pro", 15.6, 1.9, 8, 16, 512, "gray");

        HashSet<Notebook> catalog = new HashSet<>();
        catalog.add(nb1);
        catalog.add(nb2);
        catalog.add(nb3);
        catalog.add(nb4);
        catalog.add(nb5);
        catalog.add(nb6);
        catalog.add(nb7);
        catalog.add(nb8);
        catalog.add(nb9);
        catalog.add(nb10);
        catalog.add(nb11);
        catalog.add(nb12);
        catalog.add(nb13);
        catalog.add(nb14);
        catalog.add(nb15);
        String text = readFileAction(filePathAction);

        HashMap<Integer, String> filters = new HashMap<>();
        filters = createFilters(text);

        HashSet<Notebook> filteredNotebook = new HashSet<>();
        filteredNotebook = filterNotebook(catalog, filters);
        if(filteredNotebook.isEmpty()){
            System.out.println("There are no notebooks' models with such characteristics");
        }else {
            for (Notebook nb : filteredNotebook
            ) {
                System.out.println(nb);
            }
        }


        }

        public static String readFileAction(String path){
            File file = new File(path);
            StringBuilder sbAction = new StringBuilder();

            try(Scanner scanFile = new Scanner(file)){
                while(scanFile.hasNextLine()){
                    sbAction.append(scanFile.nextLine());
                    sbAction.append("\n");
                }

            }catch (Exception e){
                e.printStackTrace();
            }

            return sbAction.toString();
        }

        public static HashMap<Integer, String> createFilters(String text){
            Scanner scan = new Scanner(System.in);
            HashMap<Integer, String> filters = new HashMap<>();

            int action = 0;
            while(true){
                System.out.println("Please, enter number of notebook's measure: ");
                System.out.println(text);
                System.out.print("Enter your number: ");
                action = scan.nextInt();
                if(action==8) break;
                if(action>8 | action<=0) {
                    System.out.println("You have entered wrong number.Please, try again!");
                    continue;
                }
                System.out.print("Enter the value: ");
                String value = scan.next();
                filters.put(action, value);
            }

        return filters;
        }

        public static HashSet<Notebook> filterNotebook(HashSet<Notebook> catalog, HashMap<Integer, String> filters){
            HashSet<Notebook> filterNotebook = new HashSet<>(catalog);
            for(Map.Entry<Integer, String> entry: filters.entrySet()){
                Integer action = entry.getKey();
                String value = entry.getValue();
                switch(action){

                    case 1:
                        HashSet<Notebook> case1 = new HashSet<>();
                        for (Notebook nb: catalog) {
                            if(nb.model.toLowerCase().contains(value.toLowerCase())) {
                                case1.add(nb);
                            }
                        }
                        filterNotebook.retainAll(case1);
                        break;
                    case 2:
                        HashSet<Notebook> case2 = new HashSet<>();
                        double valueScreenDouble = Double.parseDouble(value);
                        for (Notebook nb: catalog) {
                            if(nb.screen>=valueScreenDouble) case2.add(nb);
                        }
                        filterNotebook.retainAll(case2);
                        break;
                    case 3:
                        HashSet<Notebook> case3 = new HashSet<>();
                        double valueWeightDouble = Double.parseDouble(value);
                        for (Notebook nb: catalog) {
                            if(nb.weight>=valueWeightDouble) case3.add(nb);
                        }
                        filterNotebook.retainAll(case3);
                        break;
                    case 4:
                        HashSet<Notebook> case4 = new HashSet<>();
                        int valueCores = Integer.parseInt(value);
                        for (Notebook nb: catalog) {
                            if(nb.quantityCores>=valueCores) case4.add(nb);
                        }
                        filterNotebook.retainAll(case4);
                        break;
                    case 5:
                        HashSet<Notebook> case5 = new HashSet<>();
                        int valueRAM = Integer.parseInt(value);
                        for (Notebook nb: catalog) {
                            if(nb.RAM>=valueRAM) case5.add(nb);
                        }
                        filterNotebook.retainAll(case5);
                        break;
                    case 6:
                        HashSet<Notebook> case6 = new HashSet<>();
                        int valueHDD = Integer.parseInt(value);
                        for (Notebook nb: catalog) {
                            if(nb.capacityHardDrive>=valueHDD) case6.add(nb);
                        }
                        filterNotebook.retainAll(case6);
                        break;
                    case 7:
                        HashSet<Notebook> case7 = new HashSet<>();
                        for (Notebook nb: catalog) {
                            if(nb.colour.toLowerCase().contains(value.toLowerCase())) case7.add(nb);
                        }
                        filterNotebook.retainAll(case7);
                        break;


                }
            }
            return filterNotebook;
        }
}
