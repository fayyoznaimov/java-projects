import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ProductDemo {

    public static void main(String[] args) {
        ProductDemo myProduct = new ProductDemo();
        int i = 1;
        while (i != 0) {
            System.out.println("1)Tv\n" +
                    "2)Mobile\n" +
                    "0)Exit\n");
            Scanner input = new Scanner(System.in);
            int option;
            option = input.nextInt();
            if (option == 1)
                myProduct.TvBoot();
            else if (option == 2)
                myProduct.MobileBoot();
            else if (option == 0)
                i = 0;
            else System.out.println("Please, print the correct Numb!");
        }
    }

    public void TvBoot() {
        int i = 1;
        Scanner input = new Scanner(System.in);
        TV myTV = new TV();
        while (i != 0) {
            int choice;
            System.out.println("1)Tv's Details\n" +
                    "2)Set TV\n" +
                    "0)BACK\n");
            choice = input.nextInt();
            if (choice == 1) {

                System.out.println("Model:" + myTV.getModelName());
                System.out.println("Company:" + myTV.getCompanyName());
                System.out.println("ID:" + myTV.getProductID());
                if (myTV.getOn())
                    System.out.println("TV is ON!");
                else
                    System.out.println("TV is OFF!");
                if (myTV.getOn())
                    System.out.println("Volume:" + myTV.getVolume());
            } else if (choice == 2) {
                int i1 = 1;
                while (i1 != 0) {
                    int a;
                    System.out.println("1)Add a new TV!\n" +
                            "2)Change Volume/Channel\n" +
                            "0)Back\n");
                    a = input.nextInt();
                    if (a == 1) {
                        System.out.println("Set TV's ID");
                        int ID;
                        ID = input.nextInt();
                        myTV.setProductID(ID);
                        System.out.println("Set  TV's company");
                        String Company;
                        Company = input.next();
                        myTV.setCompanyName(Company);
                        System.out.println("Set  TV's model");
                        String Model;
                        Model = input.next();
                        myTV.setModelName(Model);
                    } else if (a == 2) {
                        int i2 = 1;
                        while (i2 != 0) {
                            System.out.println("To turn on the TV press 1\n" +
                                    "To increase Volume press 2\n" +
                                    "To decrease Voleme press 3\n" +
                                    "To Set Channel press 4\n" +
                                    "To go Back press 0\n");
                            int setting;
                            setting = input.nextInt();
                            if (setting == 1)
                                myTV.setOn(true);
                            else if (setting == 2)
                                myTV.increaseVolume();
                            else if (setting == 3)
                                myTV.decreaseVolume();
                            else if (setting == 4) {
                                int channel;
                                if (myTV.getOn()) {
                                    channel = input.nextInt();
                                    myTV.setChannel(channel);
                                } else
                                    System.out.println("Please, turn on Tv first!");

                            } else if (setting == 0)
                                i2 = 0;
                            else System.out.println("Please input the correct numb!");
                        }

                    } else if (a == 0)
                        i1 = 0;
                    else System.out.println("Please input the correct numb!");
                }

            } else if (choice == 0)
                i = 0;
            else
                System.out.println("Please, input the correct numb!");

        }
    }

    public void MobileBoot() {
        Mobile myMobile = new Mobile();
        int i = 1;
        int choice;
        Scanner input = new Scanner(System.in);
        while (i != 0) {
            System.out.println("1)Mobile's Details\n" +
                    "2)Set Mobile\n" +
                    "0)BACK\n");
            choice = input.nextInt();
            if (choice == 1) {

                System.out.println("Model:" + myMobile.getModelName());
                System.out.println("Company:" + myMobile.getCompanyName());
                System.out.println("ID:" + myMobile.getProductID());
                System.out.println("Sim No:" + myMobile.getSim());
                if (myMobile.getOn())
                    System.out.println("Mobile is ON!");
                else
                    System.out.println("Mobile is OFF!");
                if (myMobile.getOn())
                    System.out.println("Volume:" + myMobile.getVolume());
            } else if (choice == 2) {
                int i1 = 1;
                while (i1 != 0) {
                    int a;
                    System.out.println("1)Add a new Mobile!\n" +
                            "2)Change Volume/SimNo\n" +
                            "0)Back\n");
                    a = input.nextInt();
                    if (a == 1) {
                        System.out.println("Set Mobile's ID");
                        int ID;
                        ID = input.nextInt();
                        myMobile.setProductID(ID);
                        System.out.println("Set  Mobile's company");
                        String Company;
                        Company = input.next();
                        myMobile.setCompanyName(Company);
                        System.out.println("Set  Mobile's model");
                        String Model;
                        Model = input.next();
                        myMobile.setModelName(Model);
                    } else if (a == 2) {
                        int i2 = 1;
                        while (i2 != 0) {
                            System.out.println("To turn on the Mobile press 1\n" +
                                    "To increase Volume press 2\n" +
                                    "To decrease Voleme press 3\n" +
                                    "To Set SimNo press 4\n" +
                                    "To go Back press 0\n");
                            int setting;
                            setting = input.nextInt();
                            if (setting == 1)
                                myMobile.setOn(true);
                            else if (setting == 2)
                                myMobile.increaseVolume();
                            else if (setting == 3)
                                myMobile.decreaseVolume();
                            else if (setting == 4) {
                                int sim;
                                if (myMobile.getOn()) {
                                    sim = input.nextInt();
                                    myMobile.setSim(sim);
                                } else
                                    System.out.println("Please, turn on Tv first!");

                            } else if (setting == 0)
                                i2 = 0;
                            else System.out.println("Please input the correct numb!");
                        }

                    } else if (a == 0)
                        i1 = 0;
                    else System.out.println("Please, input the correct Numb!");

                }
            } else if (choice == 0)
                i = 0;
            else System.out.println("Please,input the correct Number!");
        }
    }

}


abstract class Product implements Operatable {
    private int productID;
    private String companyName;
    private String modelName;
    private Boolean on;
    private int volume;


    Product() {
        productID = 0;
        companyName = "none";
        modelName = "none";
        on = false;
        volume = 0;
    }

    Product(int productID, String companyName, String modelName, Boolean on, int volume) {
        this.productID = productID;
        this.companyName = companyName;
        this.modelName = modelName;
        this.on = on;
        this.volume = volume;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getProductID() {
        return productID;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setOn(Boolean on) {
        this.on = on;
    }

    public Boolean getOn() {
        return on;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 10)
            this.volume = volume;
        else {
            System.out.println("Range of volume is 0-10!");
        }
    }

    public int getVolume() {
        return volume;
    }
}

class TV extends Product {
    //TV myTV = new TV();
    private int channel;

    TV() {
        setOn(false);
        setVolume(0);
        setCompanyName("Samsung");
        setModelName("Smart TV");
        setProductID(1910071);
        int channel = 1;
    }

    TV(int channel) {
        this.channel = channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;

    }

    public int getChannel() {
        return channel;
    }

    @Override
    public void switchOff() {
        setOn(false);
    }

    @Override
    public void switchOn() {
        setOn(true);
    }

    @Override
    public void increaseVolume() {
        if (getOn())
            setVolume(getVolume() + 1);
        else
            System.out.println("Please, turn on Tv first!");

    }

    @Override
    public void decreaseVolume() {
        if (getOn())
            setVolume(getVolume() - 1);
        else
            System.out.println("Please, turn on Tv first!");
    }

    public void increaseChannel() {
        if (getOn() && channel <= 100 && channel >= 1)
            channel++;
        else
            System.out.println("Please, turn on Tv first!");
    }

    public void decreaseChannel() {
        if (getOn() && channel <= 100 && channel >= 1)
            channel--;
        else
            System.out.println("Please, turn on Tv first!");
    }
}

class Mobile extends Product {
    private int noOfSim;

    Mobile() {
        setOn(false);
        setVolume(0);
        setCompanyName("Xiaomi");
        setModelName("MI9");
        setProductID(1910071);
        noOfSim = 0000000;

    }

    Mobile(int noOfSim) {
        this.noOfSim = noOfSim;
    }

    public void setSim(int noOfSim) {
        this.noOfSim = noOfSim;
    }

    public int getSim() {
        return noOfSim;
    }

    public void changeSim(int a) {
        if (a < 1000000 && a > 9999999)
            System.out.println("Please, input the correct sim Number");
        else
            setSim(a);
    }


    @Override
    public void switchOn() {
        setOn(true);
    }

    @Override
    public void switchOff() {
        setOn(false);
    }

    @Override
    public void increaseVolume() {
        if (getOn())
            setVolume(getVolume() + 1);
        else
            System.out.println("Please, turn on Tv first!");
    }

    @Override
    public void decreaseVolume() {
        if (getOn())
            setVolume(getVolume() - 1);
        else
            System.out.println("Please, turn on Tv first!");
    }
}

interface Operatable {
    void increaseVolume();

    void decreaseVolume();

    void switchOn();

    void switchOff();
}
/*
ID:u1910071
Name:Fayyoz Naimov*/
