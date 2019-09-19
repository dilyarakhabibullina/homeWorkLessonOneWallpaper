public class Main {
    public static void main(String[] args) {
        int roomWidth = 4;
        int roomHeight = 3;
        int roomLength = 6;
        int rollWidthInSm = 53;
        int rollLengthInSm = 1000;
        int roomPerimetr = (roomLength + roomWidth) * 2;
        int rollPieces = roomPerimetr * 100 / rollWidthInSm + 1;
        int piecesInOneRoll = rollLengthInSm / 100 / roomHeight;
        int rollAmount = rollPieces / piecesInOneRoll;
        System.out.println("Вам нужно купить " + rollAmount + " рулонов обоев");
    }
}
