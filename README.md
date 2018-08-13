## Day 0 - Hello World
```java
System.out.println(inputString);
```

## Day 1 - Data Types
```java
Scanner scan = new Scanner(System.in);
System.out.println(i+scan.nextInt());
System.out.println(d+scan.nextDouble());
System.out.println(s+scan.next()+scan.nextLine());
scan.close();
```

## Day 2 - Operators
```java
double cost = meal_cost + meal_cost * tip_percent / 100 + meal_cost * tax_percent / 100;
System.out.format("The total meal cost is %d dollars.", Math.round(cost));
```

## Day 3 - Intro to conditional statements
```java
System.out.println(
  N%2 != 0 ? "Weird" : 
  N >= 2 && N <= 5 ? "Not Weird" :
  N >= 6 && N <= 20 ? "Weird" : "Not Weird"
);
```

## Day 4 - Class vs. Instance
```java
// Constructor
if (initialAge > 0) age = initialAge;
else {
    System.out.println("Age is not valid, setting age to 0.");
    age = 0;
}
// amIOld()
System.out.println(
  age < 13 ? "You are young." : 
  age >= 13 && age < 18 ? "You are a teenager." :
  "You are old."
);

// yearPasses()
age++;
```

## Day 5 - Loops
```java
for (int i = 1; i <= 10; i++) 
  System.out.format("%d x %d = %d", n, i, n*i).println();
```

## Day 6 - Let's Review
```java
int n = scan.nextInt();
String a;
for (int i = 0; i < n; i++) {
    a = scan.next();
    for (int j = 0; j < a.length(); j++)
    if (j%2==0) System.out.print(a.charAt(j));
    System.out.print(' ');
    for (int j = 0; j < a.length(); j++)
    if (j%2!=0) System.out.print(a.charAt(j));
    System.out.println();
}
```

## Day 7 - Arrays
```java
for (int i = arr.length - 1; i >= 0; i--)
  System.out.print(arr[i] + " ");
```

## Day 8 - Dictionaries and Maps
```java
HashMap<String,Integer> map = new HashMap<String,Integer>();

// In the for loop
in.nextLine();
map.put(name, phone);

// In the while loop
System.out.println(map.get(s) == null ? "Not found" : s + "=" + map.get(s));
```

## Day 9 - Recursion
```java
if (n <= 1) return 1;
return n * factorial(n-1);
```

## Day 10 - Binary Numbers
```java
int r = 0;
for (String b : Integer.toString(n, 2).split("0"))
  if (r < b.length()) r = b.length();
System.out.println(r);
```

## Day 11 - 2D Arrays
```java
ArrayList<Integer> sum = new ArrayList<Integer>();
for (int i = 1; i < arr.length - 1; i++)
  for (int j = 1; j < arr[i].length - 1; j++) {
    sum.add(arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1]
                            + arr[i][j]
            +arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1]);
  }
System.out.println(Collections.max(sum));
```

## Day 12 - Inheritance
```java
// Constructor
Student(String f, String l, int i, int[] s) {
  super(f, l, i);
  testScores = s;
}

// Calculate
double a = Arrays.stream(testScores).average().orElse(Double.NaN);
return a > 89 ? 'O' : a > 79 ? 'E' : a > 69 ? 'A' : a > 54 ? 'P' : a > 39 ? 'D' : 'T';
```

## Day 13 - Abstract Classes
```java
// Display
System.out.format("Title: %s", title).println();
System.out.format("Author: %s", author).println();
System.out.format("Price: %d", price);
```

## Day 14- Scope
```java
// computeDifference
Arrays.sort(elements);
maximumDifference = Math.abs(elements[elements.length-1] - elements[0]);
```

## Day 15 - Linked List
```java
if (head == null) return new Node(data);
head.next = insert(head.next, data);
return head;
```

## Day 16 - Exceptions - String to Integer
```java
try { System.out.println(Integer.parseInt(S)); }
catch (NumberFormatException e) { System.out.println("Bad String"); }
```

## Day 17 - More Exceptions
```java
int power(int n, int p) throws Exception {
  if (n < 0 || p < 0)
   throw new Exception("n and p should be non-negative");
  return (int) Math.pow(n, p);
}
```

## Day 18 - Queues and Stacks
```java
Stack<Character> stack = new Stack<>();
Queue<Character> queue = new LinkedList<>();
void enqueueCharacter(char c) { queue.add(c); }
void pushCharacter(char c) { stack.add(c); }
char dequeueCharacter() { return queue.remove(); }
char popCharacter() { return stack.pop(); }
```

## Day 19 - Interfaces
```java
int sum = n;
for (int i = 1; i <= n / 2; i++)
   if (n % i == 0) sum += i;
return sum;
```






