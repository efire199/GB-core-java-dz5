public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String [] header, int[][] data  ){
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public String[] toStringMass(){
        String[] result = new String[data.length+1];
        result[0] = header[0];
        for (int i=1; i < header.length;i++) {
            result[0] += ";" + header[i];
        }
        for (int i=0; i < data.length;i++){
            result[i+1] = String.valueOf(data[i][0]);
            for (int j=1; j<data[i].length;j++){
                result[i+1] += ";" + String.valueOf(data[i][j]);
            }
        }
        return result;
    }
}
