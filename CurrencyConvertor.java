import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConvertor implements ActionListener {

    JLabel header, lfrom, lto, lAmount, lResult, lResultAmount;
    JTextField tfAmount, tfResult;
    JComboBox cb, cb2;
    JButton btnResult;

    CurrencyConvertor(){
        JFrame frame = new JFrame("Currency Converter");
        frame.setLayout(null);
        frame.setSize(500, 570);
        frame.setLocation(800, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        header = new JLabel("Currency Converter");
        header.setBounds(100,20,280,30);
        header.setFont(new Font("Verdana", Font.PLAIN, 26));
        frame.add(header);

        lfrom = new JLabel("From");
        lfrom.setBounds(30,80,80,30);
        lfrom.setFont(new Font("Verdana", Font.PLAIN, 18));
        frame.add(lfrom);

        String[] from = {"Canadian Dollar",
                "Egyptian Pound",
                "Euro",
                "Hong Kong Dollar",
                "Indian Rupee",
                "Japanese Yen",
                "Nepalese Rupee",
                "Pakistani Rupee",
                "Russian Ruble",
                "South Africa Rand",
                "South Korean won",
                "UAE Dirham",
                "USD"
        };
        cb = new JComboBox(from);
        cb.setBounds(30,130,430,30);
        cb.setFont(new Font("Verdana", Font.PLAIN, 15));
        frame.add(cb);

        lto = new JLabel("To");
        lto.setBounds(30,200,50,30);
        lto.setFont(new Font("Verdana", Font.PLAIN, 18));
        frame.add(lto);

        String[] to = {"Canadian Dollar",
                "Egyptian Pound",
                "Euro",
                "Hong Kong Dollar",
                "Indian Rupee",
                "Japanese Yen",
                "Nepalese Rupee",
                "Pakistani Rupee",
                "Russian Ruble",
                "South Africa Rand",
                "South Korean won",
                "UAE Dirham",
                "USD"
        };
        cb2 = new JComboBox(to);
        cb2.setBounds(30,250,430,30);
        cb2.setFont(new Font("Verdana", Font.PLAIN, 15));
        frame.add(cb2);

        lAmount = new JLabel("Enter Amount");
        lAmount.setFont(new Font("Verdana", Font.PLAIN, 15));
        lAmount.setBounds(30,305,250,30);
        frame.add(lAmount);

        tfAmount = new JTextField();
        tfAmount.setBounds(30,345,430,30);
        frame.add(tfAmount);

        btnResult = new JButton("Convert");
        btnResult.setBounds(30,410,430,40);
        btnResult.setFont(new Font("Verdana", Font.PLAIN, 15));
        frame.add(btnResult);
        btnResult.addActionListener(this);

        lResult = new JLabel("Converted Amount: ");
        lResult.setFont(new Font("Verdana", Font.PLAIN, 15));
        lResult.setBounds(30,480,250,30);
        frame.add(lResult);

        lResultAmount = new JLabel("");
        lResultAmount.setBounds(200,480,100,30);
        lResultAmount.setFont(new Font("Verdana", Font.PLAIN, 20));
        frame.add(lResultAmount);

        frame.setVisible(true);
    }

    public static double CadToDollar(double n){
        double div = 1.36;
        return (n/div);
    }
    public static double EpToDollar(double n){
        double div = 46.91;
        return (n/div);
    }
    public static double EuroToDollar(double n){
        double div = 0.92;
        return (n/div);
    }
    public static double HdToDollar(double n){
        double div = 7.0;
        return (n/div);
    }
    public static double yenToDollar(double n){
        double div = 155.82;
        return (n/div);
    }
    public static double NrupeeToDollar(double n){
        double div = 133.71;
        return (n/div);
    }
    public static double rupeeToDollar(double n){
        double div = 83.55;
        return (n/div);
    } 
    public static double pakRupeeToDollar(double n){
        double div = 278.98;
        return (n/div);
    }
    public static double rubbleToDollar(double n){
        double div = 90.75;
        return (n/div);
    }
    public static double randToDollar(double n){
        double div = 18.20;
        return (n/div);
    }
    public static double wonToDollar(double n){
        double div = 1357.80;
        return (n/div);
    }
    public static double DirhamToDollar(double n){
        double div = 3.67;
        return (n/div);
    
    }

    // Dollar to ....
    public static double dollarToRupee(double n){
        return (83.49*n); 
    }
    public static double dollarToCAD(double n){
        return (1.36*n); 
    }
    public static double dollarToEP(double n){
        return (46.91*n); 
    }
    public static double dollarToEuro(double n){
        return (0.92*n); 
    }
    public static double dollarToHd(double n){
        return (7.0*n); 
    }
    public static double dollarToJYen(double n){
        return (155.82*n); 
    }
    public static double dollarToNrupee(double n){
        return (133.71*n); 
    }
    public static double dollarToPakRupee(double n){
        return (278.98*n); 
    }
    public static double dollarToRubble(double n){
        return (90.75*n); 
    }
    public static double dollarToRand(double n){
        return (18.20*n); 
    }
    public static double dollarToWon(double n){
        return (1354.77*n); 
    }
    public static double dollarToDirham(double n){
        return (3.67*n); 
    }
    public static double dollarToDollar(double n){
        return n; 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnResult)){

            String from = (String)cb.getSelectedItem();
            String to = (String)cb2.getSelectedItem();

            double inputMoney = Double.parseDouble(tfAmount.getText());

            double fromMoney= 0;
            double toMoney = 0;

            switch (from) {
                case "Canadian Dollar":
                fromMoney = CadToDollar(inputMoney);
                break;

                case "Egyptian Pound":
                fromMoney = EpToDollar(inputMoney);
                break;

                case "Euro":
                fromMoney = EuroToDollar(inputMoney);
                break;

                case "Hong Kong Dollar":
                fromMoney = HdToDollar(inputMoney);
                break;

                case "Indian Rupee":
                fromMoney = rupeeToDollar(inputMoney);
                break;

                case "Japanese Yen":
                fromMoney = yenToDollar(inputMoney);
                break;

                case "Nepalese Rupee":
                fromMoney = NrupeeToDollar(inputMoney);
                break;

                case "Pakistani Rupee":
                fromMoney = pakRupeeToDollar(inputMoney);
                break;

                case "Russian Ruble":
                fromMoney = rubbleToDollar(inputMoney);
                break;

                case "South Africa Rand":
                fromMoney = randToDollar(inputMoney);
                break;

                case "South Korean won":
                fromMoney = wonToDollar(inputMoney);
                break;

                case "UAE Dirham":
                fromMoney = DirhamToDollar(inputMoney);
                break;

                case "USD":
                fromMoney = dollarToDollar(inputMoney);
                break;
            }

            switch (to) {
                
                case "Canadian Dollar":
                toMoney = dollarToCAD(fromMoney);
                break;

                case "Egyptian Pound":
                toMoney = dollarToEP(fromMoney);
                break;

                case "Euro":
                toMoney = dollarToEuro(fromMoney);
                break;

                case "Hong Kong Dollar":
                toMoney = dollarToHd(fromMoney);
                break;

                case "Indian Rupee":
                toMoney = dollarToRupee(fromMoney);
                break;

                case "Japanese Yen":
                toMoney = dollarToJYen(fromMoney);
                break;

                case "Nepalese Rupee":
                toMoney = dollarToNrupee(fromMoney);
                break;

                case "Pakistani Rupee":
                toMoney = dollarToPakRupee(fromMoney);
                break;

                case "Russian Ruble":
                toMoney = dollarToRubble(fromMoney);
                break;

                case "South Africa Rand":
                toMoney = dollarToRand(fromMoney);
                break;

                case "South Korean won":
                toMoney = dollarToWon(fromMoney);
                break;

                case "UAE Dirham":
                toMoney = dollarToDirham(fromMoney);
                break;

                case "USD":
                toMoney = dollarToDollar(fromMoney);
                break;
            }

            lResultAmount.setText(String.format("%.2f", toMoney));
        }
    }

    
    public static void main(String[] args) {
        CurrencyConvertor cc = new CurrencyConvertor();
        
    }
    
}
