import java.util.*;



public class Main {
    public static void main(String[] args) {
        List<Firm> listFirmNot = new ArrayList<>();
        List<Firm> listFirmDolgDo = new ArrayList<>();
        List<Firm> listFirmDolgbolee = new ArrayList<>();
        Firm ff = new Firm(1, "FF", "строительная", 0);
        listFirmNot.add(ff);
        Firm bil = new Firm(2, "bil", "торговая", 2000);
        listFirmDolgDo.add(bil);
        Firm ryb = new Firm(3, "Реб", "рыбная", 15000);
        listFirmDolgbolee.add(ryb);
        Firm crec = new Firm(4, "Кряк", "кондитерская", 0);
        listFirmDolgDo.add(crec);
        Firm MMM = new Firm(5, "MMM", "экономическая", 1000);
        listFirmDolgbolee.add(MMM);
        Firm frko = new Firm(6, "Frok", "IT", 250);
        listFirmNot.add(frko);
        Firm kepar = new Firm(7, "Kepar", "cc", 0);
        listFirmDolgDo.add(kepar);
        Firm vfr = new Firm(8, "vfr", "медицина", 10500);
        listFirmNot.add(vfr);
        Firm mamba = new Firm(9, "Mamba", "строительная", 15000);
        listFirmDolgDo.add(mamba);
        Firm Kriplah = new Firm(10, "FFfd", "строительная", 5000);
        listFirmNot.add(Kriplah);

        Map<String, Collection<Firm>> tax = new HashMap<>();
        tax.put("нет долга", listFirmNot);
        tax.put("долг до 10000", listFirmDolgDo);
        tax.put("долг более 10000", listFirmDolgbolee);
        System.out.println(tax.toString());
        transfer( listFirmNot,listFirmDolgDo,listFirmDolgbolee);
        System.out.println(tax.toString());

    }
    //метод который сортирует фирмы в зависимости от долга перед налоговой
        public static void transfer( List<Firm> listFirmNot,List<Firm> listFirmDolgDo,List<Firm> listFirmDolgbolee){
            for(int i=0;i<listFirmNot.size();i++){
                if(listFirmNot.get(i).getDuty()>0 && listFirmNot.get(i).getDuty()<=10000){
                    listFirmDolgDo.add(listFirmNot.get(i));
                    listFirmNot.remove(listFirmNot.get(i));
                    i--;
                } else if (listFirmNot.get(i).getDuty()>10000) {
                    listFirmDolgbolee.add(listFirmNot.get(i));
                    listFirmNot.remove(listFirmNot.get(i));
                    i--;
                }
            }
            for(int i=0;i<listFirmDolgDo.size();i++){
                if(listFirmDolgDo.get(i).getDuty()==0){
                    listFirmNot.add(listFirmDolgDo.get(i));
                    listFirmDolgDo.remove(listFirmDolgDo.get(i));
                    i--;
                } else if (listFirmDolgDo.get(i).getDuty()>10000) {
                    listFirmDolgbolee.add(listFirmDolgDo.get(i));
                    listFirmDolgDo.remove(listFirmDolgDo.get(i));
                    i--;
                }
            }
            for(int i=0;i<listFirmDolgbolee.size();i++){
                if(listFirmDolgbolee.get(i).getDuty()==0){
                    listFirmNot.add(listFirmDolgbolee.get(i));
                    listFirmDolgbolee.remove(listFirmDolgbolee.get(i));
                    i--;
                } else if (listFirmDolgbolee.get(i).getDuty()>0 && listFirmDolgbolee.get(i).getDuty()<=10000) {
                    listFirmDolgDo.add(listFirmDolgbolee.get(i));
                    listFirmDolgbolee.remove(listFirmDolgbolee.get(i));
                    i--;
                }
            }
    }

    }

