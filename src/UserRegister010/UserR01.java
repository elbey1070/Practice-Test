package UserRegister010;

public class UserR01 {

    private boolean validatePassword(String password){//Ja1234*
        boolean isValid;
        String upperLetters=password.replaceAll("[^A_Z]","");//J
        String lowerLetter=password.replaceAll("[^a-z]","");//as
        String digit=password.replaceAll("[\\D]","");//123
        String symbol=password.replaceAll("[\\P{Punct}]","");//*.


        boolean space=password.contains(" ");
        boolean lengthGtSix=password.length()>5;
        boolean existsUpperLetter=upperLetters.length()>0;
        boolean existsLower=lowerLetter.length()>0;
        boolean existsDigit=digit.length()>0;
        boolean existsSymbol=symbol.length()>0;



        if (space){
            System.out.println("Şifre boşluk içeremez.");
        }else if (!lengthGtSix){
            System.out.println("Şifre en az 6 karakter içermelidir!");
        } else if (!existsUpperLetter) {
            System.out.println("Şifre en az 1 tane büyük harf içermelidir!");
        } else if (!existsLower) {
            System.out.println("Şifre en az 1 tane küçük harf içermelidir!");
        } else if (!existsDigit) {
            System.out.println("Şifre en az 1 tane rakam içermelidir!");
        } else if (!existsSymbol) {
            System.out.println("Şifre en az 1 tane sembol içermelidir!");
        }

        isValid=!space && lengthGtSix && existsUpperLetter && existsLower && existsDigit && existsSymbol;//   T & T=T T & F=F

        if (!isValid){
            System.out.println("Geçersiz şifre, tekrar deneyiniz.");
        }
        return isValid;
    }
}
