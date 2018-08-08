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

