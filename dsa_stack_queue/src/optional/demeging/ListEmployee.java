package optional.demeging;

import java.io.*;
import java.util.*;

public class ListEmployee {
    static ArrayList listSt = new ArrayList();

    public static void main(String[] args) {
        createFile("ql.txt");
        createFile("ql1.txt");
        Queue queue = new LinkedList ();
        Queue queueMale = new LinkedList();

        try {
            File myObj = new File("ql.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] words=data.split(",");

                Employee employee = new Employee();
                for (int i = 0; i < words.length; i++) {
                    switch (i){
                        case 0:
                            employee.setName(words[0]);
                            break;
                        case 1:
                            employee.setBirthday(words[1]);
                            break;
                        case 2:
                            if (Objects.equals(words[2], "Male")){
                                employee.setMale(true);
                            }
                            break;
                    }
                }
                listSt.add(employee);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        for (int i = 0; i < listSt.size(); i++) {
            Employee employee = (Employee) listSt.get(i);
            if (employee.isMale())
                queueMale.add(employee.getAllInfor());
            else
                queue.add(employee.getAllInfor());
        }

        listSt.clear();

        while (true){
            if(queue.isEmpty()){
                break;
            }
            listSt.add(queue.poll());
        }

        while (true){
            if(queueMale.isEmpty()){
                break;
            }
            listSt.add(queueMale.poll());
        }

        try {
            FileWriter myWriter = new FileWriter("ql1.txt");
            String strTemp = "";
            for (int j = 0; j < listSt.size(); j++) {
                strTemp += listSt.get(j) + "\n";
            }
            myWriter.write(strTemp);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void createFile(String fileName) {
        try {
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

