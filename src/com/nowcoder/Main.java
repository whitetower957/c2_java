package com.nowcoder;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    /**
     * 打印参数
     *
     * @param index
     * @param obj
     */
    public static void print(int index, Object obj) {
        System.out.println(
                String.format("{%d},%s", index, obj.toString())
        );
    }

    public static void demoOperation() {
//        因为是整数，所以5/2 = 2
        print(1, 5 / 2);
        print(2, 5 * 2);
        print(3, 5 + 2);
        print(4, 5 - 2);
        print(5, 5 >> 2);
        print(6, 5 << 2);
        print(7, 5 & 2);
        print(8, 5 | 2);
        print(9, 5 ^ 2);
        print(10, 5 == 2);
        print(11, 5 != 2);
    }

    public static void demoControlFlow() {

    }
    public static void demoString(){
        String str = "hello nowcoder";
        print(1,str.indexOf('e'));
//        返回6位置字符
        print(2,str.charAt(6));
//        返回1位置字符的ASCII码
        print(3,str.codePointAt(1));
//        返回第一个不相等字符的ASCII码差距,大于0排后面，小于0排前面
        print(4,str.compareTo("hello mowcoder"));
        print(5,str.compareTo("hello powcoder"));
//      比较的同时忽略大小写
        print(6,str.compareToIgnoreCase("Hello Nowcoder"));
//        连接在字符串后面
        print(7,str.concat("~~"));
//        是否包含
        print(8,str.contains("now"));
//        是否以某个为结尾
        print(9,str.endsWith("ner"));
//        是否以某个为开头
        print(10,str.startsWith("he"));
//       最后一个出现该字符的位置,字符串中空格算一个字符
        print(11,str.lastIndexOf('o'));
//        字符串转化为大写
        print(12,str.toUpperCase());
//        将某个字符替换为另一个字符
        print(13,str.replace('o','e'));
//      还可以用正则表达式
        print(14,str.replaceAll("o|l","a"));
//        将某个字符串替换为另一个字符串
        print(15,str.replaceAll("now","coco"));
    }
    public static void demoList(){
        List<String> strList = new ArrayList<String>();
        for (int i = 0; i < 4; i++){
//            valueOf(),将整数类型转化为字符串类型
            strList.add(String.valueOf(i));
        }
        print(1,strList);
        List<String> strListB = new ArrayList<String>();
        for (int i = 0; i < 4; i++){
            strListB.add(String.valueOf(i * i));
        }
        strList.addAll(strListB);
        print(2,strList);
        strList.remove(0);
        print(3,strList);
        strList.remove(String.valueOf(1));
        print(4,strList);
        print(5,strList.get(1));

//        集合排序
        Collections.sort(strList);
        print(6,strList);
//        集合逆序(重写比较器)
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(7,strList);
//        集合逆序
        Collections.reverse(strList);
        print(8,strList);

    }
    public static void demoSet(){
        Set<String> strSet = new HashSet<String>();
        for (int i = 0; i < 3; i++){
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
        }
        print(1,strSet);
        strSet.remove("1");
        print(2,strSet);
        print(3,strSet.contains(4));
//        添加数组列表
        strSet.addAll(Arrays.asList(new String[] {"A","B","C"}));
        print(4,strSet);
//        遍历集合
        for (String value : strSet){
            print(5,value);
        }
        print(6,strSet.isEmpty());
        print(7,strSet.size());
    }
    public static void demoKeyValue(){
        Map<String,String> map = new HashMap<String, String>();
        for (int i = 0; i < 4; i++){
            map.put(String.valueOf(i),String.valueOf(i * i));
        }
        print(1,map);
//        遍历map中的元素
        for (Map.Entry<String,String> entry : map.entrySet()){
            print(2,entry.getKey() + ":" + entry.getValue());
        }
        print(3,map.keySet());
        print(4,map.values());
        print(5,map.containsKey("2"));
        print(6,map.get("2"));
//        替换value的值
        map.replace("1","a");
        print(7,map);
    }
    public static void demoCommon(){
//        产生的伪随机数
        Random random = new Random();
//        设定种子数后，产生的随机数不再变化
        random.setSeed(1);
        for (int i = 0; i < 4; i++){
            print(1,random.nextInt(100));
            print(2,random.nextDouble());
        }
        List<Integer> array = Arrays.asList(new Integer[]{1,2,3,4,5});
        print(3,array);
//        集合随机
        Collections.shuffle(array);
        print(4,array);
    }
    public static void demoDate(){
        Date date = new Date();
        print(1,date);
//        java中getTime()的值返回的是距离1970.7.1凌晨的时间差
        print(2,date.getTime());
//        时间格式化
       DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        print(3,df.format(date));
//        只显示时间的日期
        print(4, DateFormat.getDateInstance(DateFormat.FULL).format(date));
    }
    public static void main(String[] args) {
        // write your code here
//        System.out.println("hsf");
//        print(1, "xiye");
//        demoOperation();
//        demoString();
//        demoList();
//        demoSet();
//        demoKeyValue();
//        demoCommon();
        demoDate();
    }
}
