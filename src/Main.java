public class Main {
    public static void main(String[] args) {
        int value = 33;
        System.out.println(value);
        value = changeValue(value);
        System.out.println(value);
        Integer value1 = 33;
        System.out.println(value1);
        value1 = changeValue1(value1);
        System.out.println(value1);

        Integer[] values = {1, 2};
        for (Integer i : values) {
            System.out.print(i + " ");
        }
        System.out.println();
        values = changeValues(values);
        for (Integer i : values) {
            System.out.print(i + " ");
        }
        System.out.println();

        Integer[] valuesV2 = {99};
        for (Integer i : valuesV2) {
            System.out.print(i);
        }
        System.out.println();
        values = changeValuesV2(valuesV2);
        for (Integer i : valuesV2) {
            System.out.print(i + " ");
        }
        System.out.println();


        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println(person);
        person = changePerson(person);
        System.out.println(person);
    }

    public static int changeValue(int value){
        value = 22;
        return value;
    }
    public static Integer changeValue1(Integer value1){
        value1 = 22;
        return value1;
    }

    public static Integer[] changeValues(Integer[] values){
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] + 2;
        }
        return values;
    }

    public static Integer[] changeValuesV2(Integer[] valuesV2){
        valuesV2 = new Integer[]{3, 4};
        return valuesV2;
    }

    public static Person changePerson(Person person){
        person = new Person("Ilya", "Lagutenko");
        return person;
    }
}