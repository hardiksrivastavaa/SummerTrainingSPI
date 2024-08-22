document.addEventListener('DOMContentLoaded', () => {
    const questions = [
        { question: "What is Control Panel?", answer: "The Control Panel is a Windows feature that allows users to modify system settings and control hardware and software features." },
        { question: "What is Debugging?", answer: "Debugging is the process of identifying, analyzing, and removing errors or bugs in software or hardware systems." },
        { question: "What is an Algorithm?", answer: "An algorithm is a step-by-step procedure or formula for solving a problem, often used in computer programming and data processing." },
        { question: "What is Cloud Computing?", answer: "Cloud computing refers to delivering computing services like storage, processing, and networking over the internet." },
        { question: "What is a Firewall?", answer: "A firewall is a security system that monitors and controls incoming and outgoing network traffic based on predetermined security rules." },
        { question: "What is Artificial Intelligence?", answer: "Artificial Intelligence (AI) is the simulation of human intelligence in machines programmed to think and learn." },
        { question: "What is SEO?", answer: "Search Engine Optimization (SEO) is the process of improving the visibility of a website or a web page in a search engine's unpaid results." },
        { question: "What is a Compiler?", answer: "A compiler is a program that translates code written in a high-level programming language into machine code executable by a computer." },
        { question: "What is an Interpreter?", answer: "An interpreter is a program that directly executes the instructions in a high-level programming language without requiring them to be compiled." },
        { question: "What is a Link in HTML?", answer: "A link in HTML is a reference to another document or resource, typically used to navigate between different web pages." }
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
