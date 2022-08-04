public class Kogtewran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public void compare(Kogtewran two) {
        if (two == null) {
            System.out.println("объект не может быть null");
        } else {
            int powerOneStudent = this.smart + this.wise + this.witty + this.fullOfCreativity + this.getPowerOfMagic() + this.getAbilityToTransgress();
            int powerTwoStudent = two.smart + two.wise + two.witty + two.fullOfCreativity + two.getPowerOfMagic() + two.getAbilityToTransgress();
            if (powerOneStudent < powerTwoStudent) {
                System.out.println("Cтудент два лучше, чем студент один ");
            } else if (powerOneStudent > powerTwoStudent) {
                System.out.println("Cтудент один лучше , чем студент два ");
            } else {
                System.out.println("Оба студента равны по силе");
            }
        }
    }

    public Kogtewran(int powerOfMagic, int abilityToTransgress, int smart, int wise, int witty, int fullOfCreativity) {
        super(powerOfMagic, abilityToTransgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public String toString() {
        return "Kogtewran{" +
                "smart =" + smart +
                ", wise = " + wise +
                ", witty = " + witty +
                ", fullOfCreativity = " + fullOfCreativity + ", PowerOfMagic = " + getPowerOfMagic() + ", AbilityToTransgress = " + getAbilityToTransgress() +
                '}';
    }
}


