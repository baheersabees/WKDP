package a1;

public class Cell implements Locatable {
    private boolean alive;
    private int row, col;
    private Cell north, south, east, west;
    private Board board;

    public Cell(int row, int col, Board board) {
        this.row = row;
        this.col = col;
        this.board = board;
    }

    public boolean getAlive() {
        return this.alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String printCell() {
        if (this.alive) {
            return "1";
        } else {
            return "0";
        }
    }

    public Cell getNorth() {
        return this.north;
    }

    public Cell getSouth() {
        return this.south;
    }

    public Cell getEast() {
        return this.east;
    }

    public Cell getWest() {
        return this.west;
    }

    public void setNeighbors(Cell north, Cell south, Cell east, Cell west) {
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
    }

    public boolean isCorner() {
        return (
            this.row == 0 && this.col == 0 ||
            this.row == 0 && this.col == this.board.getCols() - 1 ||
            this.row == this.board.getRows() - 1 && this.col == 0 ||
            this.row == this.board.getRows() - 1 && this.col == this.board.getCols() - 1
        );
    }

    public boolean isEdge() {
        return (
            this.row == 0 ||
            this.row == this.board.getRows() - 1 ||
            this.col == 0 ||
            this.col == this.board.getCols() - 1
        );
    }
}
