public class Company {
    char[] name;
    long nip;
    Address address;

    Company(char[] name, long nip, Address address) {
        this.name = name;
        this.nip = nip;
        this.address = address;
    }
    void display(){
        System.out.print("Name: "); //name jest tablicą, ktorą przechodzimy pętlą foreach
        for(char c : name){
            System.out.print(c);
        }
        System.out.println();

        System.out.println("NIP: "+nip);

        //adres jest obiektem, nie możemy go wydrukować przez sout, też potrzebujemy stworzyć metodę display
        address.display();

    }
}