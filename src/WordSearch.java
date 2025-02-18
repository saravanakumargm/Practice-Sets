public class WordSearch {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]==word.charAt(0)){
                    boolean result = backtrack(board,word,visited,i,j,0);
                    if(result) return true;
                }
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, String word, boolean[][] visited, int i, int j, int i1) {
        if(i1==word.length()) return true;
        if(i<0 || j>=board[0].length || j<0 || i>=board.length){
            return false;
        }
        visited[i][j] = true;
        if(backtrack(board,word,visited,i+1,j,i1+1) ||
                backtrack(board,word,visited,i,j+1,i1+1) ||
                backtrack(board,word,visited,i-1,j,i1+1) ||
                backtrack(board,word,visited,i,j-1,i1+1)
        ) return true;
        visited[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        char[][] arr = {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
        System.out.println(new WordSearch().exist(arr,"ABCCED"));
    }
}
