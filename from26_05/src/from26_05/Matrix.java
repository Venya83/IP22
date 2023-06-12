package from26_05;

import java.util.Iterator;

public class Matrix implements Iterable<Integer> {
    private int[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    public void setValueAt(int i, int j, int value) {
        matrix[i][j] = value;
    }

    public int getValueAt(int i, int j) {
        return matrix[i][j];
    }

    public void multiplyByScalar(int scalar) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] *= scalar;
            }
        }
    }

    public Matrix add(Matrix m) {
        if (rows != m.rows || cols != m.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions.");
        }

        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.setValueAt(i, j, matrix[i][j] + m.getValueAt(i, j));
            }
        }
        return result;
    }

    public Matrix transpose() {
        Matrix result = new Matrix(cols, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.setValueAt(j, i, matrix[i][j]);
            }
        }
        return result;
    }

    public Iterator<Integer> iterator() {
        return new MatrixIterator();
    }

    private class MatrixIterator implements Iterator<Integer> {
        private int currentRow = 0;
        private int currentCol = 0;

        public boolean hasNext() {
            return currentRow < rows && currentCol < cols;
        }

        public Integer next() {
            int value = matrix[currentRow][currentCol];
            if (currentCol < cols - 1) {
                currentCol++;
            } else {
                currentCol = 0;
                currentRow++;
            }
            return value;
        }
    }

    public static Matrix operatorPlus(Matrix m1, Matrix m2) {
        return m1.add(m2);
    }

    public static Matrix operatorMultiply(Matrix matrix, int scalar) {
        Matrix result = new Matrix(matrix.rows, matrix.cols);
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.cols; j++) {
                result.setValueAt(i, j, matrix.getValueAt(i, j) * scalar);
            }
        }
        return result;
    }
}
