import java.util.Scanner;
public class Cosmetics
{
    public static void list()
    {
        System.out.println("-----Our Products-----");
        System.out.println("1.Primer             - 850/-");
        System.out.println("2.Foundation         - 920/-");
        System.out.println("3.Concealer          - 600/-");
        System.out.println("4.Blush              - 550/-");
        System.out.println("5.Highlighter        - 740/-");
        System.out.println("6.Eyeshadow Pallete  - 900/-");
        System.out.println("7.Lipstick           - 460/-");
        System.out.println("8.Nail Paint         - 300/-");
    }
    public static void buy()
    {
        Scanner sc=new Scanner(System.in);int pno,qty,pricep,amt=0;char ans;double gst;
        String [] pname = {"Primer           ","Foundation       ","Concealer        ","Blush            ","Highlighter      ","Eyeshadow Pallete","Lipstick         ","Nail Paint       "};
        int price[]=new int[]{850,920,600,550,740,900,460,300};
        int qtyp[]=new int[8];
        int amtp[]=new int[8];
        while(true)
        {
        System.out.println("Enter Product Number : ");
        pno=sc.nextInt();
        switch(pno)
        {
            case 1 : pricep=850;
                     price[pno-1]=pricep;
                     System.out.println("Enter Quantity : ");
                     qty=sc.nextInt();
                     qtyp[pno-1]=qty;
                     amt+=850*qty;
                     amtp[pno-1]=pricep*qty;break;
            case 2 : pricep=920;
                     price[pno-1]=pricep;
                     System.out.println("Enter Quantity : ");
                     qty=sc.nextInt();
                     qtyp[pno-1]=qty;
                     amt+=920*qty;
                     amtp[pno-1]=pricep*qty;break;
            case 3 : pricep=600;
                     price[pno-1]=pricep;
                     System.out.println("Enter Quantity : ");
                     qty=sc.nextInt();
                     qtyp[pno-1]=qty;
                     amt+=600*qty;
                     amtp[pno-1]=pricep*qty;break;
            case 4 : pricep=550;
                     price[pno-1]=pricep;
                     System.out.println("Enter Quantity : ");
                     qty=sc.nextInt();
                     qtyp[pno-1]=qty;
                     amt+=550*qty;
                     amtp[pno-1]=pricep*qty;break;
            case 5 : pricep=740;
                     price[pno-1]=pricep;
                     System.out.println("Enter Quantity : ");
                     qty=sc.nextInt();
                     qtyp[pno-1]=qty;
                     amt+=740*qty;
                     amtp[pno-1]=pricep*qty;break;
            case 6 : pricep=900;
                     price[pno-1]=pricep;
                     System.out.println("Enter Quantity : ");
                     qty=sc.nextInt();
                     qtyp[pno-1]=qty;
                     amt+=900*qty;
                     amtp[pno-1]=pricep*qty;break;
            case 7 : pricep=460;
                     price[pno-1]=pricep;
                     System.out.println("Enter Quantity : ");
                     qty=sc.nextInt();
                     qtyp[pno-1]=qty;
                     amt+=460*qty;
                     amtp[pno-1]=pricep*qty;break;
            case 8 : pricep=300;
                     price[pno-1]=pricep;
                     System.out.println("Enter Quantity : ");
                     qty=sc.nextInt();
                     qtyp[pno-1]=qty;
                     amt+=300*qty;
                     amtp[pno-1]=pricep*qty;break;
            default : System.out.println("Invalid Product Number ");
        }
        System.out.println("Do you want to Buy More Products ? : (y/n) : ");
        ans=sc.next().charAt(0);
        if(ans=='n')
        break;
        }
        System.out.println("\t\t----------INVOICE----------");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Items\t\t\tQuantity\tPrice");
        System.out.println("_________________________________________________________________");
        for(int i=0;i<8;i++)
        {
            if(qtyp[i]!=0)
            {
                System.out.println(pname[i]+"\t  "+qtyp[i]+"\t\t"+amtp[i]);
            }
        }
        System.out.println("\nTotal Price :                           "+amt);
        gst=0.28*amt;
        System.out.println("GST - 28% :                             "+gst);
        if(amt<1500)
        {
            double dis=0.1*amt;
            System.out.println("Discount - 10% :                        "+dis);
            System.out.println("Total Amount :                          "+(amt+gst-dis));
            System.out.println("\t\t  -------THANK YOU-------");
        }
        else if(amt>=1500 && amt<=3000)
        {
            double dis=0.2*amt;
            System.out.println("Discount - 20% :                        "+dis);
            System.out.println("Total Amount :                          "+(amt+gst-dis));
            System.out.println("\t\t  -------THANK YOU-------");
        }
        else if(amt>3000 && amt<=5000)
        {
            double dis=0.3*amt;
            System.out.println("Discount - 30% :                        "+dis);
            System.out.println("Total Amount :                          "+(amt+gst-dis));
            System.out.println("\t\t  -------THANK YOU-------");
        }
        else 
        {
            double dis=0.35*amt;
            System.out.println("Discount - 35% :                        "+dis);
            System.out.println("Total Amount :                          "+(amt+gst-dis));
            System.out.println("\t\t  -------THANK YOU-------");
        }
        System.out.println("-----------------------------------------------------------------");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);int ch;
        System.out.println("-----Welcome to Zara-----");
        while(true)
        {
        System.out.println("\nEnter: \n1.View List of Available Products\n2.Buy Products\n3.EXIT");
        System.out.println("Enter Your Choice : ");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1 : list();break;
            case 2 : buy();break;
            case 3 : System.exit(0);break;
            default : System.out.println("Invalid Choice");
        }
        }
    }
}
