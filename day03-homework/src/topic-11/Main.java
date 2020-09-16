import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        String path = Thread.currentThread().getContextClassLoader().
                getResource("emp.txt").getPath();
        File file = new File(path);
        //FileInputStream fis  = new FileInputStream(file);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String readLine = null;
        Map map = new HashMap();
        /*System.out.println(map.isEmpty());*/
        while (!((readLine = br.readLine()) == null)){
           // System.out.println(readLine);
            String[] strings = readLine.split(",");
           /*for (String string : strings){
                System.out.println(string);
            }*/
            String valueName = strings[0];
            String keyName = valueName.toLowerCase();
            String age = strings[1];
            String sex = strings[2];
            String salary = strings[3];
            String date = strings[4];
            /*System.out.println(name);
            System.out.println(age);
            System.out.println(sex);
            System.out.println(salary);
            System.out.println(date);*/
            map.put(keyName,new Emp(valueName,age,sex,salary,date));
        }
        //System.out.println(map.size());//11
        br.close();

        Scanner s = new Scanner(System.in);
        Object obj = map.get(s.next().toLowerCase());
        if (obj == null){
            System.out.println("查无此人");
        }else{
            System.out.println(obj);
        }

    }
}
