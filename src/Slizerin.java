public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public  void compare(Slizerin two){
        if (two == null) {
            System.out.println("объект не может быть null");
        } else {   int powerOneStudent= this.cunning + this.determination + this.ambition+this.resourcefulness+this.lustForPower+this.getPowerOfMagic()+ this.getAbilityToTransgress();
            int powerTwoStudent= two.cunning + two.determination + two.ambition+two.resourcefulness+two.lustForPower+two.getPowerOfMagic()+ two.getAbilityToTransgress();
            if(powerOneStudent<powerTwoStudent){
                System.out.println("Cтудент два лучше, чем студент один ");
            } else if (powerOneStudent>powerTwoStudent) {
                System.out.println("Cтудент один лучше , чем студент два ");
            }else{
                System.out.println("Оба студента равны по силе");
            }
        }
    }
    public Slizerin(int powerOfMagic, int abilityToTransgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(powerOfMagic, abilityToTransgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Slizerin{" +
                "cunning = " + cunning +
                ", determination = " + determination +
                ", ambition = " + ambition +
                ", resourcefulness = " + resourcefulness +
                ", lustForPower = " + lustForPower + ", PowerOfMagic = "+getPowerOfMagic()+ ", AbilityToTransgress="+ getAbilityToTransgress() +
                '}';
    }
}


