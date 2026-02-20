package org.example.stream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiProgramming {
    public static void main(String[] args) {
        level1();
        System.out.println("---------------------------------------");
        Level2();
        System.out.println("---------------------------------------");
        level3();
    }

    private static void level3() {
        List<String> names = Arrays.asList("tharun", "java", "stream","api","API");

//        ⭐ Find Duplicate Elements

        Set<Integer> seen = new HashSet<>();

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,2,3,1,7,6);
        List<Integer> duplicates=nums.stream().filter( n -> !seen.add(n))
                .toList();
        System.out.println(duplicates);

//        ⭐ Find First Non-Repeated Character
        String input = "jhavahj";
        Character result = input.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),LinkedHashMap :: new, Collectors.counting()
                ))
                .entrySet().stream().filter(e -> e.getValue() ==1)
                .map(Map.Entry:: getKey)
                .findFirst()
                .get();
        System.out.println(result);

//        ⭐ Convert List to Map
        Map<String, Integer> map=names.stream().collect(Collectors.toMap(s -> s,
                String:: length));
        System.out.println(map);
    }

    private static void Level2() {
        //        1️⃣1️⃣ Find Second Highest Number
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,18,10);
        List<String> names = Arrays.asList("tharun", "java", "stream","api","API");


        int secondHighestSalary= nums.stream().distinct().sorted(Collections.reverseOrder())
                .skip(1).findFirst().get();
        System.out.println(secondHighestSalary);

//        1️⃣2️⃣ Find Frequency of Each Element
        List<String> lowerCase=names.stream().map(String :: toLowerCase).toList();
        Map<Integer,Long> freq=nums.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting())
        );

        Map<String,Long> freq2=names.stream().collect(
                Collectors.groupingBy(String :: toLowerCase, Collectors.counting())
        );
        System.out.println(freq+", "+freq2);

//        1️⃣3️⃣ Flatten Nested List
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4,5)
        );

        List<Integer> flat = list.stream().flatMap(Collection :: stream).toList();
        System.out.println(flat);

//        1️⃣4️⃣ Partition Data (True / False Split)
        Map<Boolean, List<Integer>> partition = nums.stream().collect(Collectors.partitioningBy(n -> n >3)) ;

        System.out.println(partition);

//        1️⃣5️⃣ Get Top 3 Highest Numbers
        List<Integer> top3= nums.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(top3);
    }

    private static void level1() {
        // 1️⃣ Convert List to Uppercase
        List<String> names = Arrays.asList("tharun", "java", "stream");
        List<String> result= names.stream().map(String :: toUpperCase)
                .toList();
        System.out.println(result);

//        2️⃣ Filter Even Numbers
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,2,3,1,7,6);
        List<Integer> result1 = nums.stream().filter(n-> n%2 == 0).toList();
        System.out.println(result1);

//        3️⃣ Count Elements
        int target=5;
        long cnt=nums.stream().filter(n -> n > target).count();
        System.out.println(cnt);

//        4️⃣ Find First Element
        System.out.println(names.stream().findFirst().orElse("-"));

//        5️⃣ Sort a List
        List<Integer> sortedlist=nums.stream().sorted().toList();
        System.out.println(sortedlist);

//        6️⃣ Remove Duplicates
        List<Integer> duplicate=nums.stream().distinct().toList();
        System.out.println(duplicate);

//        7️⃣ Sum of All Numbers
        int sum=nums.stream().reduce(0, Integer :: sum);
        System.out.println(sum);

//        8️⃣ Find Max / Min
        int max=nums.stream().min(Integer :: compare).get();
        System.out.println(max);

//        9️⃣ Convert List<String> to Single String
        String joined=names.stream().collect(Collectors.joining(","));
        System.out.println(joined);

//        🔟 Group Elements
        Map<Integer, List<Integer>> grouped = nums.stream().collect(Collectors.groupingBy(n -> n%2));

        System.out.println(grouped);
    }
}
