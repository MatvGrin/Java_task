package father_task1;

public class Student {
    int id;
    String name;
    String surname;
    String birth_date;
    String address;
    long phone_number;
    String faculty;
    int course;
    int group;

    public String showNameAndSurname(String name, String surname){
        this.name = name;
        this.surname = surname;
        return name + " " + surname;
    }
    public String showAddressAndPhone(String address, long phone_number){
        this.address = address;
        this.phone_number = phone_number;
        return address + " " + phone_number;
    }
    public String showUniversityData(String faculty, int course, int group){
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        return faculty + " " + course + " " + group;
    }
    public String toString(int id,String name,String surname,String birth_date,String address,long phone_numbe,String faculty,int course,int group){
        this.id = id;
        return id + " " + name + " " + surname + " " + birth_date + " " + address + " " + phone_numbe + " " + faculty + " " + course + " " + group;
    }
    public String birth_date(String birth_date){
        this.birth_date = birth_date;
        return birth_date;
    }
}
