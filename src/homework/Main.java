package homework;

import java.util.*;

public class Main {

    //1.
    public static void main(String[] args) {
    Map<String,String>mapAB=new HashMap<>();
    mapAB.put("a","Hi");
    mapAB.put("b","There");
        System.out.println(ab(mapAB));


        //2.
     String[]strings= {"a", "b", "a", "c", "b"};
        System.out.println(booleanMap(strings));


        //3.

        List<String>list=List.of("Peter","vasili","vasili","Maria","vasili");
        System.out.println(nameToNumberOccurence(list,"vasili"));


        // 1. {a=Hi, ab=HiThere, b=There}

        // 2. {a=true, b=true, c=false}

        //3. {vasili=3, Peter=1, Maria=1}



    }
    /*
    1.  Дана Map map, написать метод, который вернет мапу, такую, что если в исходной map есть ключи ‘a’ и ‘b’,
    то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b в качестве значения.
    Если нет, ничего не менять
Примеры:
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
     */
    public static Map<String,String>ab(Map<String,String>mapAB){
    if(mapAB.containsKey("a")&&mapAB.containsKey("b")){
        String key="ab";
        mapAB.put("ab",mapAB.get("a")+(mapAB.get("b")));

    }return mapAB;


    }
    /*
    2.Дан массив строк (не пустой). Написать метод, возвращающий мапу Map где каждая строка является ключем,
     а значением является true если строка в массиве встречается больше одного раза и false,
     если только один раз.


Примеры:
wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true} */


    public static Map<String,Boolean> booleanMap(String[] strings){
        Map<String,Boolean>booleanMap1= new HashMap<>();
        for(String string:strings){
            if (booleanMap1.containsKey(string)){
                booleanMap1.put(string,true);
            }else{
                booleanMap1.put(string,false);
            }
        }return booleanMap1;
    }
 /*
3.Дан список имен, где некоторые имена повторяются.
Написать метод,который по имени вернет количество вхождений
этого имени в список.
Пример: nameToNumberOccurence(List list, String name)
Vasia -> 3
     */
public static Map<String,Integer>nameToNumberOccurence(List <String>list,String name) {
    Map<String, Integer> nameOccurence = new HashMap<>();
    for (String s:list){
        if (nameOccurence.keySet().contains(s)){
            nameOccurence.put(s,nameOccurence.get(s)+1);
        }else {
            nameOccurence.put(s,1);
        }

    }return nameOccurence;

}

}
