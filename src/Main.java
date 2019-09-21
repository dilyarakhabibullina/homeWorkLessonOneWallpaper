public class Main {
    public static void main(String[] args) {
        int roomWidthInSm = 400;
        int roomHeightInSm = 300;
        int roomLengthInSm = 600;
        int rollWidthInSm = 53;
        int rollLengthInSm = 1000;
        int roomPerimetr = (roomLengthInSm + roomWidthInSm) * 2;
        int rollPieces = roomPerimetr / rollWidthInSm + 1;
        int piecesInOneRoll = rollLengthInSm / roomHeightInSm;
        int rollAmount = rollPieces / piecesInOneRoll;
        System.out.println("Вам нужно купить " + rollAmount + " рулонов обоев");
    }
}
