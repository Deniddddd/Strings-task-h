
public class StringBuild {
    public static void main(String[] args) {
        getOutput(getData(provideData()));
    }

    private static String[] provideData() {
        return new String[]{"brange", "plum", "tomato", "onibn", "grape"};
    }

    private static String getData(String[] items ){
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String name : items){
            count++;
            stringBuilder
                    .append(count)
                    .append(")")
                    .append(name)
                    .append("\n");
        }
        return stringBuilder.toString();
    }
    private static void getOutput(String output){
        System.out.println(output);
    }
}
