package com.composite;

public class CompositeTest {
    public static void main(String[] args) {
        Component hardDrive = new Leaf(4500, "HDD");
        Component ssd = new Leaf(5000, "SSD");
        Component keyboard = new Leaf(500, "Keyboard");
        Component mouse = new Leaf(200, "Mouse");
        Component monitor = new Leaf(12000, "Monitor");
        Component ram = new Leaf(6000, "Ram");
        Component cpu = new Leaf(15000, "CPU");

        Composite peripheral = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite storage = new Composite("Storage");
        Composite motherboard = new Composite("Mother Board");
        Composite computer = new Composite("Computer");

        peripheral.addComponent(keyboard);
        peripheral.addComponent(monitor);
        peripheral.addComponent(mouse);

        motherboard.addComponent(ram);
        motherboard.addComponent(cpu);

        storage.addComponent(hardDrive);
        storage.addComponent(ssd);

        cabinet.addComponent(storage);
        cabinet.addComponent(motherboard);


        computer.addComponent(cabinet);
        computer.addComponent(peripheral);

        computer.showPrice();


    }
}
