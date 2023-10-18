/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import menu.Menu;
import model.CalculateList;
import model.Circle;
import model.Rectangle;
import model.Triangle;

/**
 *
 * @author son
 */
public class CaculateManager extends Menu{
    private Triangle triangle;
    private Circle circle;
    private CalculateList calculateList;

    public CaculateManager(String title, String[] s, Triangle triangle, Circle circle) {
        super(title, s);
        this.triangle = triangle;
        this.circle = circle;
        this.calculateList = new CalculateList();
    }

    @Override
    public void execute(int choice) {
         switch (choice) {
            case 1:
                Triangle inputTriangle = calculateList.inputTriangle();
                Rectangle inputRectangle = calculateList.inputRectangle();
                Circle inputCircle = calculateList.inputCircle();

                calculateList.display(inputTriangle, inputRectangle, inputCircle);
                break;

            case 2:
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
    }
    
}
