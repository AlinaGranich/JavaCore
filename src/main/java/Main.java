import java.io.*;

public class Main {
    public static void main(String[] args) {
        AppData data = new AppData();
        data.setHeader(new String[] { "Color", "Size", "Weight" });
        data.addRow(new int[] { 0, 0, 0});
        data.addRow(new int[] { 4, 5, 6});
        data.addRow(new int[] { 1, 1, 1});
        data.addRow(new int[] { 3, 2, 2});
        data.info();

        System.out.println("=========================");

        save("output.csv", data);
        AppData data2 = load("input.csv");
        data2.info();
    }

    public static void save(String filename, AppData appData) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(String.join(";", appData.getHeader()) + "\n");
            for (int i = 0; i < appData.getData().length; i ++) {
                for (int j = 0; j < appData.getData()[i].length; j++) {
                    writer.write(Integer.toString(appData.getData()[i][j]));
                    if (j < (appData.getData()[i].length - 1)) {
                        writer.write(';');
                    }
                }
                writer.write('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData load(String filename) {
        AppData appData = new AppData();
        String str;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String[] headers = reader.readLine().split(";");
            appData.setHeader(headers);
            while ((str = reader.readLine()) != null) {
                String[] values = str.split(";");
                int[] intValues =  new int[values.length];
                for (int i = 0; i < values.length; i++) {
                    intValues[i] = Integer.parseInt(values[i]);
                }
                appData.addRow(intValues);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return appData;
    }
}
