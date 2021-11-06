public class AppData {
    private String[] header;
    private int[][] data;

    public void setHeader(String[] header) {
        this.header = header.clone();
    }

    public void addRow(int[] values) {
        int rowsNum = getDataRows() + 1;
        int [][] tmpData = new int[rowsNum][];
        for (int i = 0; i < getDataRows(); i++) {
            tmpData[i] = data[i].clone();
        }
        tmpData[rowsNum - 1] = values.clone();
        this.data = tmpData;
    }

    private int getDataRows() {
        if (data == null) {
            return 0;
        }

        return data.length;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public void info() {
        for (int i = 0; i < header.length; i++) {
            System.out.print(header[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
