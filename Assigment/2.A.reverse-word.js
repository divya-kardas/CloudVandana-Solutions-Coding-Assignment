
//2 JavaScript  A. Take a sentence as an input and reverse every word in that sentence.
//a. Example - This is a sunny day > shiT si a ynnus yad.

function reverseWords(sentence) {
    let words = sentence.split(' ');
    let reversedWords = words.map(word => word.split('').reverse().join(''));
    return reversedWords.join(' ');
}

console.log(reverseWords("This is a sunny day"));
 // outputs: shiT si a ynnus yad.