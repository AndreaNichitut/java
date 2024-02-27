package isp.lab10.raceapp;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Race!");
        JFrame frame = new JFrame("Semaphore");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SemaphorePanel semaphorePanel = new SemaphorePanel();

        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);

        JFrame frame1 = new JFrame("Car Race");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarPanel carPanel = new CarPanel();

        frame1.getContentPane().add(carPanel);
        frame1.pack();
        frame1.setSize(500,300);
        frame1.setVisible(true);
        Car car1 = new Car("Red car", carPanel);
        Car car2 = new Car("Blue car", carPanel);
        Car car3 = new Car("Green car", carPanel);
        Car car4 = new Car("Yellow car", carPanel);
        PlaySound playSound = new PlaySound();
        frame.getContentPane().add(semaphorePanel);
        frame.pack();
        frame.setVisible(true);
        semaphoreThread.start();
        semaphoreThread.join();
        playSound.playSound();
        //Thread.sleep(15000);
        playSound.playSound();
        RaceTimer timer = new RaceTimer();
        timer.setRaceStarted(true);
        timer.start();
        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car1.join();
        car2.join();
        car3.join();
        car4.join();
        timer.setRaceStarted(false);
        playSound.stopSound();
        timer.join();
        System.out.println("The race took "+timer.getTime());
        for(int i=0;i<4;i++)
            System.out.println((i + 1) + ". " + CarPanel.getPositions().get(i) + " with time: " + CarPanel.getTimes().get(i) + " seconds;");
    }
}
