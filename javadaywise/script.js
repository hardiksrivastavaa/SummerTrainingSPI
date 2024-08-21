function copyCode(id) {
    const codeBlock = document.getElementById(id);
    const codeText = codeBlock.innerText;
    navigator.clipboard.writeText(codeText).then(() => {
        alert("Code copied to clipboard!");
    }).catch(err => {
        alert("Failed to copy code: " + err);
    });
}