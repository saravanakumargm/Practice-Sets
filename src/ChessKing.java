public class ChessKing {
    public void findPath(int sourceX, int sourceY, int destX, int destY){
        while (sourceX<destX || sourceY<destY){
            if(sourceX<=destX){
                sourceX++;
            }
            if(sourceY<=destY){
                sourceY+=1;
            }
            if(sourceX>destX){
                sourceX = destX;
            }
            System.out.println(sourceX + "," + sourceY);

        }
    }

    public static void main(String[] args) {
        new ChessKing().findPath(1,1,2,8);
    }
}
