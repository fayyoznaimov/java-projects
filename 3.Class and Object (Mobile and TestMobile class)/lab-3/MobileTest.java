import java.util.Scanner;

public class MobileTest  {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Mobile mobile = new Mobile();
        String company, model;
        boolean on, hC;
        double mmy;
        int volume;
        int situation;
        int i=0;

        while(i!=1){
            System.out.println("1. Input Fields");
            System.out.println("2. Show Fields");
            System.out.println("3. Increase Volume of mobile");
            System.out.println("4. Decrease Volume volume of mobile");
            System.out.println("5. ON Mobile");
            System.out.println("6. OFF Mobile");
            System.out.println("7. Quit Program");
            situation = input.nextInt();
            if(situation==1){
                System.out.print("Company : "); company=input.next();
                mobile.setCompany(company);
                System.out.print("Model : "); model=input.next();
                mobile.setModel(model);
                System.out.print("On(bool) : "); on=input.nextBoolean();
                mobile.setOn(on);
                System.out.print("Camera(bool) : " ); hC=input.nextBoolean();
                mobile.setHasCamera(hC);
                System.out.print("Memory(bool) : "); mmy=input.nextDouble();
                mobile.setMemory(mmy);
                System.out.print("Volume: " ); volume=input.nextInt();
                if (volume <= 10 && volume >= 0) {
                    mobile.setVolume(volume);
                }
                else{
                    System.out.println("Your input is not valid, program will consider volume as 0");
                    mobile.setVolume(0);
                }
            }
            if(situation==2){
                System.out.println("Company : " + mobile.getCompany());
                System.out.println("Model : " + mobile.getModel());
                System.out.println("On : " + mobile.getOn());
                System.out.println("Camera : " + mobile.getHasCamera());
                System.out.println("Memory : " + mobile.getMemory());
                System.out.println("Volume: " + mobile.getVolume());
            }
            if(situation==3){
                mobile.increaseVolume();
            }
            if(situation==4){
                mobile.decreaseVolume();
            }
            if(situation==5){
                mobile.switchOn();
            }
            if(situation==6){
                mobile.switchOff();
            }
            if(situation==7){
                i=1;
            }
            break;
        }
    }
}



class Mobile{
    Scanner input = new Scanner(System.in);
    String company, model;
    boolean on, hasCamera;
    double memory;
    int volume;

    Mobile(){
        company = "Mi";
        model = "9";
        on = true;
        hasCamera = true;
        memory = 64;
        volume = 10;
    }

    Mobile(String company1,String model1, boolean onOff, boolean hasCamera1, double memory1, int volume1){
        company = company1;
        model = model1;
        on = onOff;
        hasCamera = hasCamera1;
        memory = memory1;
        volume = volume1;
    }

    void setCompany(String company1){
        company = company1;
    }
    void setModel(String model1){
        model = model1;
    }
    void setOn(boolean onOff){
        on = onOff;
    }
    void setHasCamera(boolean hasCamera1){
        hasCamera = hasCamera1;
    }
    void setMemory(double mry){
        memory = mry;
    }
    void setVolume(int val){
        volume = val;
    }
    String getCompany(){
        return company;
    }
    String getModel(){
        return model;
    }
    boolean getOn(){
        return on;
    }
    boolean getHasCamera(){
        return hasCamera;
    }
    double getMemory(){
        return memory;
    }
    int getVolume(){
        return volume;
    }
    void switchOn(){
        on = true;
    }
    void switchOff(){
        on = false;
    }
    void increaseVolume(){
        if (volume< 10) {
            volume++;
        }
    }
    void decreaseVolume(){
        if (volume >= 1){
            volume--;
        }
    }
}
/*
Fayyoz Naimov
U1910071
*/