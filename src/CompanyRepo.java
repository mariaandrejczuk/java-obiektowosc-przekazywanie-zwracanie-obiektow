public class CompanyRepo {
    Company[] companies;
    int iterator = 0; //iterator musi trafić wyżej jako pole, żeby był widoczny w całym obiekcie, nie może być tuż nad companies[iterator] = company;

    CompanyRepo(int size) {
        companies = new Company[size];
    }

    void add(Company company) {  //metoda dodająca element repo, nie ma nic zwracać (dlatego void)
        if (iterator < companies.length) {
            companies[iterator] = company;  //dodaję do tablicy, podajac nazwę tablicy, index i zwykłe przypianie
            iterator++;
        }else{
            System.out.println();
            System.out.println("Brak miejsc dla firmy: ");
            System.out.println();
            company.display();
        }
    }

    //metoda wyświetlająca wszystkie firmy: nie potrzebuje parametrówm, ani też nic nie zwraca:

    void displayAll() {
        System.out.println();
        System.out.println("*********** wszystkie firmy ************");
        for (int i = 0; i < companies.length && companies[i] != null; i++) {
            companies[i].display(); //żeby wyświetlić konktetną firmę company, potrzebuję dodatkowo metody display ale w Company
            System.out.println();
        }
    }

}
