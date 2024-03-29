package academy.devdojo.javaoneforall.javacore.Gassociation.domain;

public class School {
    private String name;
    Professor01[] professors;

    public School(String name){
        this.name = name;
    }

    public School(String name, Professor01[] professors){
        this(name);
        this.professors = professors;
    }

    public void print(){
        System.out.println(this.name);
        if (professors != null) {
            for (Professor01 professor : professors) {
                System.out.println(professor.getName());
            }
        }
    }

    public String getName() {
        return this.name;
    }

    public Professor01[] getProfessors() {
        return this.professors;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setProfessors(Professor01[] professors) {
        this.professors = professors;
    }
}
