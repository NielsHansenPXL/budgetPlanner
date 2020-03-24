package be.pxl.budget;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BudgetPlanner {
    public static void main(String[] args) {

        List<Payment> payments = new ArrayList<>();

        try (FileReader file = new FileReader("C:\\Users\\11800963\\Documents\\PXL S2IT 18-19\\Java Advanced 2\\account_payments.csv");
             BufferedReader reader = new BufferedReader(file)){
            String line = null;
            while((line = reader.readLine()) != null){
                String[] separatedLine = line.split(",");
                Payment payment = CreatePayment(separatedLine);
                payments.add(payment);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Payment CreatePayment(String[] separatedLine) {
        
    }
}
