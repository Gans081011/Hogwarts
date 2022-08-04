public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(int powerOfMagic, int abilityToTransgress, int nobility, int honor, int bravery) {
        super(powerOfMagic, abilityToTransgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "nobility = " + nobility +
                ", honor = " + honor +
                ", bravery = " + bravery + ", PowerOfMagic = " + getPowerOfMagic() + ", AbilityToTransgress = " + getAbilityToTransgress() +
                '}';
    }

    public void compare(Griffindor two) {
        if (two == null) {
            System.out.println("объект не может быть null");
        } else {
            int powerOneStudent = this.nobility + this.honor + this.bravery + this.getPowerOfMagic() + this.getAbilityToTransgress();
            int powerTwoStudent = two.nobility + two.honor + two.bravery + two.getPowerOfMagic() + two.getAbilityToTransgress();
            if (powerOneStudent < powerTwoStudent) {
                System.out.println("Cтудент два лучше, чем студент один ");
            } else if (powerOneStudent > powerTwoStudent) {
                System.out.println("Cтудент один лучше , чем студент два ");
            } else {
                System.out.println("Оба студента равны по силе");
            }
        }
    }
}


