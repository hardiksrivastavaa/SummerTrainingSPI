document.addEventListener('DOMContentLoaded', () => {
    const questions = [
        { question: "What is a Class? Explain with an example.", answer: "A class in Java is a blueprint for creating objects. It defines the properties and behaviors that the objects created from the class can have. Example: `class Car { int speed; void accelerate() { speed += 10; } }`." },
        { question: "What is OOPs? Write its pillars.", answer: "OOPs (Object-Oriented Programming) is a programming paradigm based on the concept of objects. The four pillars of OOPs are Encapsulation, Inheritance, Polymorphism, and Abstraction." },
        { question: "What is a package in Java? Explain with an example.", answer: "A package in Java is a namespace that organizes classes and interfaces. Example: `package mypackage; class MyClass { }`." },
        { question: "What is Decision Control? Describe each decision control.", answer: "Decision control structures in Java include `if`, `else`, `else if`, and `switch` statements, which allow you to control the flow of execution based on certain conditions." },
        { question: "What is a string in Java? Explain.", answer: "A string in Java is a sequence of characters, represented by the `String` class. Strings are immutable, meaning they cannot be changed after they are created." },
        { question: "What is Java? Write difference between C, C++ and Java.", answer: "Java is a high-level, object-oriented programming language. Differences: C is procedural, C++ supports both procedural and object-oriented programming, and Java is fully object-oriented and platform-independent." },
        { question: "Why Java is Platform Independent?", answer: "Java is platform-independent because of its bytecode and the Java Virtual Machine (JVM). The bytecode can be executed on any platform that has a JVM." },
        { question: "Describe JDK, JRE and JVM.", answer: "JDK (Java Development Kit) is used for developing Java applications. JRE (Java Runtime Environment) provides libraries to run Java applications. JVM (Java Virtual Machine) is the engine that runs the Java bytecode." },
        { question: "What is class and object?", answer: "A class is a blueprint for creating objects (instances of the class). An object is an instance of a class, containing properties and behaviors defined by the class." },
        { question: "Describe public static void main().", answer: "The `public static void main(String[] args)` method is the entry point of any Java program. It's where the program starts executing." },
        { question: "What is difference between next() and nextLine() method?", answer: "The `next()` method reads input until a space is encountered, while `nextLine()` reads the entire line, including spaces." },
        { question: "What is difference between print() and println() method?", answer: "`print()` outputs text without a newline, while `println()` outputs text and then moves to the next line." },
        { question: "What are loop controls? Explain its types.", answer: "Loop controls in Java include `for`, `while`, and `do-while` loops. These allow repeated execution of a block of code until a specified condition is met." },
        { question: "What is Array? How to declare and initialize array?", answer: "An array in Java is a collection of elements of the same type. Declaration: `int[] numbers;` Initialization: `numbers = new int[5];`" },
        { question: "What is String? How to take String Input in Java?", answer: "A `String` in Java is an object that represents a sequence of characters. String input can be taken using `Scanner sc = new Scanner(System.in); String str = sc.nextLine();`" },
        { question: "What is Difference between equals() and equalsIgnoreCase() methods?", answer: "`equals()` compares two strings for content equality, considering case, while `equalsIgnoreCase()` compares two strings for content equality, ignoring case differences." },
        { question: "What is method in Java? Why method is important?", answer: "A method in Java is a block of code that performs a specific task. Methods are important for code reusability and modularity." },
        { question: "Write difference between static and non-static method.", answer: "A static method belongs to the class and can be called without creating an object. A non-static method belongs to an instance of the class and requires an object to be called." },
        { question: "What is Ternary Operator?", answer: "The ternary operator in Java is a shorthand for `if-else` statements. It has the form `condition ? expression1 : expression2`." }
    ];

    const accordionContainer = document.getElementById('accordion');

    questions.forEach((item, index) => {
        const accordionItem = document.createElement('div');
        accordionItem.classList.add('border-b', 'border-gray-300', 'pb-4');

        const header = document.createElement('button');
        header.classList.add('w-full', 'flex', 'justify-between', 'items-center', 'text-left', 'py-4', 'text-lg', 'font-medium', 'text-blue-500', 'hover:text-blue-700', 'focus:outline-none');
        
        const headerText = document.createElement('span');
        headerText.innerHTML = `${index + 1}. ${item.question}`;
        
        const icon = document.createElement('i');
        icon.classList.add('fas', 'fa-chevron-down', 'transition-transform', 'duration-300');
        
        header.appendChild(headerText);
        header.appendChild(icon);
        
        const content = document.createElement('div');
        content.classList.add('hidden', 'pt-2', 'text-gray-700', 'pl-4');
        content.innerHTML = `<p>${item.answer}</p>`;
        
        header.addEventListener('click', () => {
            content.classList.toggle('hidden');
            if (!content.classList.contains('hidden')) {
                gsap.fromTo(content, { height: 0 }, { height: 'auto', duration: 0.5, ease: 'power2.out' });
                icon.classList.add('transform', 'rotate-180');
            } else {
                icon.classList.remove('transform', 'rotate-180');
            }
        });
        
        accordionItem.appendChild(header);
        accordionItem.appendChild(content);
        accordionContainer.appendChild(accordionItem);
    });
});
