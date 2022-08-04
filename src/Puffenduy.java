public class Puffenduy extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;

    public  void compare(Puffenduy two){
        if (two == null) {
            System.out.println("объект не может быть null");
        } else {int powerOneStudent= this.diligence + this.loyalty + this.honesty+ this.getPowerOfMagic()+ this.getAbilityToTransgress();
            int powerTwoStudent= two.diligence + two.loyalty + two.honesty+ two.getPowerOfMagic()+ two.getAbilityToTransgress();
            if(powerOneStudent<powerTwoStudent){
                System.out.println("Cтудент два лучше, чем студент один ");
            } else if (powerOneStudent>powerTwoStudent) {
                System.out.println("Cтудент один лучше , чем студент два ");
            }else{
                System.out.println("Оба студента равны по силе");
            }
        }
    }
    public Puffenduy(int powerOfMagic, int abilityToTransgress, int diligence, int loyalty, int honesty) {
        super(powerOfMagic, abilityToTransgress);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Puffenduy{" +
                "diligence = " + diligence +
                ", loyalty = " + loyalty +
                ", honesty = " + honesty + ", PowerOfMagic = "+getPowerOfMagic()+ ", AbilityToTransgress = "+ getAbilityToTransgress() +
                '}';
    }
}


