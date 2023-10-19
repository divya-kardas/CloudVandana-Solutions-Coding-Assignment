//2 JavaScript B. Perform sorting of an array in descending order.

function sortDescending(arr) {
    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                let temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    return arr;
}

console.log(sortDescending([1, 3, 2, 5, 4])); 
// outputs: [5, 4, 3, 2, 1]