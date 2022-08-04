public class Hogwarts {
    private int powerOfMagic;
    private int abilityToTransgress;

    public void compareStandartQuality( Hogwarts two){
        if (two == null) {
            System.out.println("объект не может быть null");
        } else {       int powerOneStudent= this.getPowerOfMagic()+ this.getAbilityToTransgress();
            int powerTwoStudent= two.getPowerOfMagic()+ two.getAbilityToTransgress();
            if(powerOneStudent<powerTwoStudent){
                System.out.println("Cтудент два лучше, чем студент один ");
            } else if (powerOneStudent>powerTwoStudent) {
                System.out.println("Cтудент один лучше , чем студент два ");
            }else{
                System.out.println("Оба студента равны по силе");
            }
        }
    }
    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getAbilityToTransgress() {
        return abilityToTransgress;
    }

    public void setAbilityToTransgress(int abilityToTransgress) {
        this.abilityToTransgress = abilityToTransgress;
    }

    public Hogwarts(int powerOfMagic, int abilityToTransgress) {
        this.powerOfMagic = powerOfMagic;
        this.abilityToTransgress = abilityToTransgress;

    }
}


