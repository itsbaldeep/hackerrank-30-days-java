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

## Day 20 - Sorting
```java
int swaps = 0;
for (int j = 0; j < n; j++) for (int i = 0; i < n - 1; i++)
  if (a[i] > a[i + 1]) {
    int temp = a[i];
    a[i] = a[i + 1];
    a[i + 1] = temp;
    swaps++;
  }
System.out.format("Array is sorted in %d swaps.", swaps).println();
System.out.format("First Element: %d", a[0]).println();
System.out.format("Last Element: %d", a[n - 1]);
```

## Day 21 - Generics
```java
// printArray(T[] arr)
for (T el : arr) System.out.println(el);
```

## Day 22 - Binary Search Trees
```java
if (root == null) return -1;
return 1 + Math.max(getHeight(root.left), getHeight(root.right));
```

## Day 23 - BST Level-Order Transversal
```java
Queue<Node> q = new LinkedList();
q.add(root);
while (!q.isEmpty()) {
  Node n = q.remove();
  System.out.print(n.data + " ");
  if (n.left != null) q.add(n.left);
  if (n.right != null) q.add(n.right);
}
```

## Day 24 - More Linked Lists
```java
if (head == null || head.next == null) return head;
if (head.data == head.next.data) {
  head.next = head.next.next;
  removeDuplicates(head);
} removeDuplicates(head.next);
return head;
```

## Day 25 - Running Time and Complexity
```java
int l = s.nextInt(); // s :Scanner
for (int j = 0; j < l; j++) {
  int n = s.nextInt();
  String res = "Prime";
  for (int i = 2; i*i <= n; i++)
    if (n % i == 0) res = "Not prime";
  System.out.println(n > 1 ? res : "Not prime");
}
```


## Day 26 - Nested Logic
```java
int fine = 0;
if (expectedYear < actualYear) fine = 10000;
else if (expectedYear == actualYear) {
  if (expectedMonth < actualMonth) fine = Math.abs(expectedMonth - actualMonth) * 500;
  else if (expectedMonth == actualMonth) {
    if (expectedDate < actualDate) fine = Math.abs(expectedDate - actualDate) * 15;
  }
}
System.out.println(fine);
```


## Day 27 - Testing
```java
// get_array()
return new int[]{}; // Empty Array
return new int[]{1,2,3}; // Unique Values
return new int[]{1,1,2,3}; // Two Minimums

// get_expected_result()
return minimum_index(get_array());
```


## Day 28 - RegEx, Patterns and Intro to Databases
```java
ArrayList<String> users = new ArrayList();

// Inside loop
Pattern p = Pattern.compile(".+@gmail\\.com$");
if (p.matcher(emailID).find()) users.add(firstName);

// Print
Collections.sort(users);
for (String user : users) System.out.println(user);
```


## Day 29 - Bitwise AND
```java
int a = k - 1;
int b = (~a) & -(~a);
System.out.println((a | b) > n ? a - 1 : a);
```
