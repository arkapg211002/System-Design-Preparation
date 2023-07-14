package LowLevelDesign.DesignPatterns.AdapterDesignPattern.Client;

import LowLevelDesign.DesignPatterns.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import LowLevelDesign.DesignPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import LowLevelDesign.DesignPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String args[]){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
