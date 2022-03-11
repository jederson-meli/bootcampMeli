package jungleRum;

public class Runner {
    private String rg;
    private String firstName;
    private String lastName;
    private int age;
    private String celPhone;
    private String emergencyNumber;
    private String bloodGroup;
    private String category;
    private float price;
    private int registrationNumber;

    public void showRunner() {
        System.out.println("Numero de registro: " + this.registrationNumber);
        System.out.println("RG: " + this.rg);
        System.out.println("Nome: " + this.firstName);
        System.out.println("Sobrenome: " + this.lastName);
        System.out.println("Idade: " + this.age);
        System.out.println("Telefone: " + this.celPhone);
        System.out.println("Numero de emergencia: " + this.emergencyNumber);
        System.out.println("Tipo sanguineo: " + this.bloodGroup);
        System.out.println("Categoria: " + this.category);
        System.out.println("Preço: " + this.price);
        System.out.println("\n");
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCelPhone() {
        return celPhone;
    }

    public void setCelPhone(String celPhone) {
        this.celPhone = celPhone;
    }

    public String getEmergencyNumber() {
        return emergencyNumber;
    }

    public void setEmergencyNumber(String emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice() {
        if (age > 18) {
            switch (category) {
                case "small":
                    this.price = 1300;
                    break;
                case "medium":
                    this.price = 2000;
                    break;
                default:
            }
        } else {
            switch (category) {
                case "small":
                    this.price = 1500;
                    break;
                case "medium":
                    this.price = 2300;
                    break;
                case "advanced":
                    this.price = 2800;
                    break;
                default:
            }
        }

    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

}
