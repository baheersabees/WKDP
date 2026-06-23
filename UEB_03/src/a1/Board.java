package a1;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Board {
    private Cell grid[][];
    private int rows, cols;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new Cell[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.grid[i][j] = new Cell(i, j, this);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Cell self = this.grid[i][j];
                Cell north = (i-1 < 0) ? self : this.grid[i-1][j];
                Cell south = (i+1 >= rows) ? self : this.grid[i+1][j];
                Cell east = (j-1 < 0) ? self : this.grid[i][j-1];
                Cell west = (j+1 >= cols) ? self : this.grid[i][j+1];
                self.setNeighbors(north, south, east, west);
            }
        }
    }

    public Cell[][] getGrid() {
        return this.grid;
    }

    public int getRows() {
        return this.rows;
    }

    public int getCols() {
        return this.cols;
    }

    private boolean allAlive() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                if (!this.grid[i][j].getAlive()) {return false;}
            }
        }
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            System.out.println(" ");
            for (int j = 0; j < cols; j++) {
                System.out.print(" ");
                System.out.print(this.grid[i][j].printCell());
                System.out.print(" ");
            }
        }
    }

    public int spreadLife(Queue<Cell> startCells) {
        if (startCells == null || startCells.isEmpty()) {
            return 0;
        }

        // 1. Erstes Erwecken zählt als erster Schritt
        int schritte = 1;
        Queue<Cell> currentLevel = new ArrayDeque<>();
        
        for (Cell cell : startCells) {
            cell.setAlive(true);
            currentLevel.add(cell);
        }
        
        // 2. BFS: solange wir noch nicht alle lebendig haben, weiten wir eine Ebene aus
        while (!this.allAlive() && !currentLevel.isEmpty()) {
            Queue<Cell> nextLevel = new ArrayDeque<>();
            
            // Arbeite alle aktuell lebendigen Zellen DIESER Ebene ab
            while (!currentLevel.isEmpty()) {
                Cell currentCell = currentLevel.poll();
                
                // Packe tote Nachbarn in die nächste Ebene und erwecke sie
                Cell[] neighbors = {
                    currentCell.getNorth(), currentCell.getSouth(),
                    currentCell.getEast(), currentCell.getWest()
                };
                
                for (Cell neighbor : neighbors) {
                    if (neighbor != null && !neighbor.getAlive()) {
                        neighbor.setAlive(true);
                        nextLevel.add(neighbor);
                    }
                }
            }
            
            // Bereite die nächste Ebene vor
            currentLevel = nextLevel;
            schritte++;
        }

        return schritte;
    }
}
