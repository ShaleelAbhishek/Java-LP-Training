public class Main {
    public static void main(String[] args) {

        Vat vat = new Vat();
        Nbt nbt = new Nbt();
        Btt btt = new Btt();

        Tax tax = new Tax();

        tax.setSuccesor( vat);
        vat.setSuccesor(nbt);
        nbt.setSuccesor(btt);

        Invoice invoice1 = new Invoice(1, 100);
        System.out.println("Tax for "+invoice1.getAmount()+ " is "+tax.applyTax(invoice1));

        System.out.println();

        Invoice invoice2 = new Invoice(2, 750);
        System.out.println("Tax for "+invoice2.getAmount()+ " is "+tax.applyTax(invoice2));

        System.out.println();

        Invoice invoice3 = new Invoice(3, 2000);
        System.out.println("Tax for "+invoice3.getAmount()+ " is "+tax.applyTax(invoice3));

    }
}
