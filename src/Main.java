public class Main {
    public static void main(String[] args) {
        int n = 100;    //program umożliwiający przechowywanie 100 firm, gdy przekroczę tę liczbę firm, pojawi się błąd, chyba, że dodamy IF w Repo wiersz 10.
        CompanyRepo companyRepo = new CompanyRepo(n);

        char[] street = {'p','o','l','n','a'};
        Address address = new Address (street, 3, 2);   //adres też trzeba zdefiniować,żeby dodać go do c1,a żeby adres, to wcześniej char street, numery mogę wpisać od razu

        //stworzenie pierwszej firmy
        char[] name = {'l','u','f','t','h','a','n','s','a'};//żeby dodać nazwę do c1, musze zdefiniować name
        // dodanie firmy c1 do repo
        Company c1 = new Company(name, 1222141411, address);  //tworzę Company c1

        //przekazanie firmy c1 do metody dodaj .add
        companyRepo.add(c1);   //dodajemy nową firmę do repo, to musimy dodać metodę dodaj, czyli add.

        //stworzenie innej firmy pod tym samym adresem
        char[] name2 = {'b','i','e','d','r','o','n','k','a'};//żeby dodać nazwę do c2, musze zdefiniować name
        Company c2 = new Company(name2, 1112223331, address);  //tworzę Company c2
        // dodanie firmy c2 do repo
        companyRepo.add(c2);

        //dodanie trzeciej firmy
        char[] name3 = {'a', 'b', 'c'};
        Address address2 = new Address (street, 5, 1);
        Company c3 = new Company(name3,1121111111, address);
        companyRepo.add(c3);

        //wyświetlenie wszystkich firm --w tym celu tworzymy metodę displayAll w companyRepo:
        companyRepo.displayAll();
    }
}
