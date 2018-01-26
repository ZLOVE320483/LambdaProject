# LambdaProject
Simple Lambda Sample

# 项目说明
此项目展示了java8中lambda表达式的简单运用

### 例1 用lambda表达式实现Runnable
>
     public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("This is Lambda Test!");
        Thread thread = new Thread(runnable);
        thread.start();
    } 
### 例2 使用Java 8 lambda表达式进行事件处理
>
     public static void main(String[] args) {
        JButton show = new JButton("Show");
        show.addActionListener((e) -> {
            System.out.println("This is Lambda Sample For Action");
        });
    }
### 例3 使用lambda表达式对列表进行迭代
>
     public static void main(String[] args) {
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n -> System.out.println(n));
    }
### 例4 使用lambda表达式和函数式接口Predicate
>
     public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
  
        System.out.println("Languages which starts with J :");
        filter(languages, (str)->str.startsWith("J"));

        System.out.println("Languages which ends with a ");
        filter(languages, (str)->str.endsWith("a"));

        System.out.println("Print all languages :");
        filter(languages, (str)->true);

        System.out.println("Print no language : ");
        filter(languages, (str)->false);

        System.out.println("Print language whose length greater than 4:");
        filter(languages, (str)->str.length() > 4);
    }

    public static void filter(List<String> names, Predicate<String> condition) {
        names.stream().filter(name->condition.test(name)).forEach(name-> System.out.println(name));
    }
 ### 例5 如何在lambda表达式中加入Predicate
>
     public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Scala", "Basic", "Haskell", "Lisp");

        Predicate<String> startWithJ = n->n.startsWith("J");
        Predicate<String> fourLengthLetter = n->n.length() == 4;
        languages.stream().filter(startWithJ.and(fourLengthLetter)).forEach(n-> System.out.println("nName, which starts with 'J' and four letter long is : " + n));

        Predicate<String> endWithA = n->n.endsWith("a");
        Predicate<String> fiveLengthLetter = n->n.length() == 5;
        languages.stream().filter(endWithA.or(fiveLengthLetter)).forEach(n-> System.out.println("nName, which end with 'a' or five letter long is : " + n));
    }
### 例6 Java 8中使用lambda表达式的Map和Reduce示例
>
     public static void main(String[] args) {
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400);
        costBeforeTax.stream().map(cost->cost + .12*cost).forEach(cost-> System.out.println(cost));
  
        double bill = costBeforeTax.stream().map(cost->cost + .12*cost).reduce((sum, cost)->sum + cost).get();
        System.out.println("Total:" + bill);
    }
### 例7 通过过滤创建一个String列表
>
     public static void main(String[] args) {
        List<String> strList = Arrays.asList("abcd", "abcde", "abc", "ab");
        List<String> filtered = strList.stream().filter(x->x.length()>2).collect(Collectors.toList());
        System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
    }
### 例8 对列表的每个元素应用函数
>
     public static void main(String[] args) {
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(G7Countries);
    }
### 例9 复制不同的值，创建一个子列表
>
     public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
        System.out.printf("Original List : %s,  Square Without duplicates : %s %n", numbers, distinct);
    }
### 例10 计算集合元素的最大值、最小值、总和以及平均值
>
     public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream().mapToInt(x->x).summaryStatistics();
        System.out.println("Highest prime number in List : " + stats.getMax());
        System.out.println("Lowest prime number in List : " + stats.getMin());
        System.out.println("Sum of all prime numbers : " + stats.getSum());
        System.out.println("Average of all prime numbers : " + stats.getAverage());
    }
