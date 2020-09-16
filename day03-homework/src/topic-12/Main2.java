import java.io.*;

public class Main2 {
    public static void main(String[] args)  {
        String path = Thread.currentThread().getContextClassLoader().getResource("emp.txt").getPath();
        System.out.println(path);
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(path,true));
            br = new BufferedReader(isr);
            String readLine = null;
            while((readLine = br.readLine()) != null){
                //System.out.println(readLine);
                String[] strings = readLine.split(",");
                String name = strings[0];
                String sex = strings[2];
                if (!(name.length() >= 1 && name.length() <= 20)){
                    continue;
                }
                if (!(sex.equals("男") || sex.equals("女"))){
                    continue;
                }
                System.out.println(readLine);

                bw.write(readLine);
                break;
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
