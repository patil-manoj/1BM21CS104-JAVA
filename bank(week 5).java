import java.util.Scanner;

public class bank {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

class Curacct extends bank {
    int balance = 0;
    int penalty = 0;

    void checkin(int o) {
        balance = balance + o;
    }

    void checkout(int p) {
        balance = balance - p;
    }

    void penalty() {
        if (balance < 2000) {
            penalty = penalty + 200;
        }
        System.out.println("your penalty" +penalty);
    }
}

class Savacct extends bank {
    double balance;
    int rate = 3;

    void deposit(int o) {
        balance = balance + (double) o;
        System.out.println(balance);
    }

    void withdraw(int p) {
        balance = balance - (double) p;
        System.out.println(balance);
    }

    void intr(int time) {
        double A = (double) balance *
                (Math.pow((1 + (double) rate / 100), (double) time));
        double CI = A - balance;
        System.out.println("your intrest " + CI);
    }
}

class man {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        bank h = new bank();
        System.out.println("enter your name");
        h.setName(s.nextLine());
        System.out.println("acount number pls ");
        h.setNum(s.nextInt());
        System.out.println("accont type either 1 for current or 2 for savings ");
        h.setType(sc.nextInt());
        if (h.type == 1) {
            
            Curacct po = new Curacct();
            for(;;){
            System.out.println(
                    "enter your choice \n 1.For check deposit \n 2.For check withdraw \n 3.to show penalty\n 4. to show balance \n 5. to exit");
            int bg = s.nextInt();
            switch (bg) {
                case 1:
                    po.checkin(s.nextInt());
                    break;
                case 2:
                    po.checkout(s.nextInt());
                    break;
                case 3:
                    po.penalty();
                    break;
                case 4:
                    System.out.println("your balance is   " + po.balance);
                    break;
                case 5:System.exit(0);
                break;
                default:
                    System.out.println("enter correct number ");
                    break;
            }
        }
        } else if (h.type == 2) {
            Savacct ui = new Savacct();
            for(;;){
            System.out.println(
                    "enter your choice \n 1.Yo deposit \n 2.To withdraw \n 3.to show Intrest \n 4. to show balance\n 5. to exit ");
            int uj = s.nextInt();
            switch (uj) {
                case 1:
                    ui.deposit(s.nextInt());
                    break;
                case 2:
                    ui.withdraw(s.nextInt());
                    break;
                case 3:
                    System.out.println("enter time for intrest ");
                    int gy = s.nextInt();
                    ui.intr(gy);
                    break;
                case 4:
                    System.out.println("your balance" + ui.balance);
                    break;
                    case 5:System.exit(0);
                break;
                default:
                    System.out.println("enter correct number ");
                    break;
            }
        }
        }

        s.close();
        sc.close();
    }
}
