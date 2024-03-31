package org.binarfood.view;

import org.binarfood.model.Model;

import java.util.List;
import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu(List<Model> menu) {
        System.out.println("Menu:");
        int index = 0;
        for (Model item : menu) {
            System.out.println(index + ". " + item.getName() + " - $" + item.getPrice());
            index++;
        }
    }

    public int selectItem() {
        System.out.print("Enter the item number to select: ");
        return scanner.nextInt();
    }

    public void displaySelection(Model item) {
        System.out.println("Selected: " + item.getName() + " - $" + item.getPrice());
    }

    public void displayReceipt(List<Model> order) {
        double total = 0;
        System.out.println("Receipt:");
        for (Model item : order) {
            System.out.println(item.getName() + " - $" + item.getPrice());
            total += item.getPrice();
        }
        System.out.println("Total: $" + total);
    }
}
