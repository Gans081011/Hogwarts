import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor(90, 80, 65, 80, 70);
        Griffindor germionaGreyndger = new Griffindor(80, 76, 68, 88, 99);
        Griffindor ronUisley = new Griffindor(24, 67, 43, 77, 33);
        Slizerin dgagoMalfoy = new Slizerin(32, 67, 36, 97, 45, 84, 33);
        Slizerin grahamMontegyu = new Slizerin(10, 34, 84, 48, 53, 80, 96);
        Slizerin gregoryGoyl = new Slizerin(45, 67, 75, 47, 44, 21, 18);
        Puffenduy zahariyaSmith = new Puffenduy(18, 74, 34, 78, 9);
        Puffenduy sedricDiggory = new Puffenduy(9, 21, 66, 34, 73);
        Puffenduy justinFinchFletchly = new Puffenduy(67, 34, 74, 32, 33);
        Kogtewran chzouChang = new Kogtewran(54, 67, 32, 22, 67, 84);
        Kogtewran padmaPatil = new Kogtewran(38, 99, 64, 45, 76, 44);
        Kogtewran marcusBelby = new Kogtewran(12, 75, 56, 45, 95, 66);

        System.out.println(dgagoMalfoy);
        System.out.println(harryPotter);
        System.out.println(chzouChang);
        System.out.println(germionaGreyndger);
        germionaGreyndger.compare(ronUisley);
        germionaGreyndger.compareStandartQuality(ronUisley);
        padmaPatil.compareStandartQuality(marcusBelby);
        sedricDiggory.compareStandartQuality(marcusBelby);
        germionaGreyndger.setBravery(22);
        gregoryGoyl.setAmbition(45);
    }
}
