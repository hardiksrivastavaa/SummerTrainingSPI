function copyCode() {
    const codeBlock = document.getElementById('code-block');
    const codeText = codeBlock.innerText;
    navigator.clipboard.writeText(codeText).then(() => {
        alert("Code copied to clipboard!");
    }).catch(err => {
        alert("Failed to copy code: " + err);
    });
}