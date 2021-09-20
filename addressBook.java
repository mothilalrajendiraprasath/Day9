package addressBook;

import java.util.ArrayList;
import java.util.Scanner;

    public class addressBook{

        public static ArrayList<details> array=new ArrayList<details>();


    public static void add() {

        Scanner sc = new Scanner(System.in);
        System.out.println("first name:");
        String fname = sc.next();
        System.out.println("first name:");
        String lname = sc.next();
        System.out.println("address:");
        String address = sc.next();
        System.out.println("city:");
        String city = sc.next();
        System.out.println("State:");
        String state = sc.next();
        System.out.println("zip:");
        int zip = sc.nextInt();
        System.out.println("phone:");
        long phone = sc.nextLong();
        System.out.println("Email:");
        String email = sc.next();

        System.out.println("fname:" + fname);
        System.out.println("lname:" + lname);
        System.out.println("address:" + address);
        System.out.println("city:" + city);
        System.out.println("State:" + state);
        System.out.println("zip:" + zip);
        System.out.println("phone:" + phone);
        System.out.println("email:" + email);

    }

    public static void edit() {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter first name to start editing: ");
        String ename = a.next();
        for(int i=0;i<9;i++){
        if(array.get(i).getfname().equals(ename)){
        System.out.println("Options to edit :1) fname 2)lname 3)address 4)city 5)state 6)zip 7)phone 8)email ");
        System.out.println("select the options:");
        int choice = a.nextInt();
        switch (choice) {
            case 1:
                System.out.println("fname:");
                String fname = a.next();
                array.get(i).setFname(fname);
                break;
            case 2:
                System.out.println("lname:");
                String lname = a.next();
                array.get(i).setLname(lname);
                break;
            case 3:
                System.out.println("Address:");
                String address = a.next();
                array.get(i).setAddress(address);
                break;
            case 4:
                System.out.println("City:");
                String city = a.next();
                array.get(i).setCity(city);
                break;
            case 5:
                System.out.println("State:");
                String state = a.next();
                array.get(i).setState(state);
                break;
            case 6:
                System.out.println("Zip:");
                int zip = a.nextInt();
                array.get(i).setZip(zip);
                break;
            case 7:
                System.out.println("Phone:");
                long phone = a.nextLong();
                array.get(i).setPhone(phone);
                break;
            case 8:
                System.out.println("Email:");
                String email = a.next();
                array.get(i).setEmail(email);
                break;
        }}}
    }
        public static void delete(){
            Scanner a = new Scanner(System.in);
            System.out.println("Enter first name to get it deleted: ");
            String ename = a.next();
            for(int i=1;i<8;i++){
                if(array.get(i).getfname().equals(ename)){
                    array.remove(i);
                }
            }
        }



    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Options : 1)add  2)edit  3)delete ");
        int option = s.nextInt();
        switch (option) {
            case 1:
                add();
                break;
            case 2:
                edit();
                break;
            case 3 : delete();
                break;
        }
    }
}
