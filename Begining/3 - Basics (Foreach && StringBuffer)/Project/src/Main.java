public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Ítalo");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
        sb.append("Lemos");
        System.out.println(sb);

//		String str=sb.toString();

//		sb.deleteCharAt(2);
//		sb.insert(0,"Java");
//		sb.insert(6,"java");
//		sb.setLength(30);
        sb.ensureCapacity(100);

        System.out.println(sb);

        int numbers[] = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10};

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}