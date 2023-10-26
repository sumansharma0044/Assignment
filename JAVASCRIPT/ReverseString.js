function reverseWords(sentence) {
    let words = sentence.split(' ');
    let reversedSentence = '';

    for (let i = 0; i < words.length; i++) {
        let reversedWord = reverseString(words[i]);
        reversedSentence += reversedWord + ' ';
    }

    return reversedSentence.trim();
}

function reverseString(str) {
    let reversed = '';
    for (let i = str.length - 1; i >= 0; i--) {
        reversed += str[i];
    }
    return reversed;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);

console.log(reversedSentence);
