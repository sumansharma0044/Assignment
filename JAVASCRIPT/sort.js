function sortDescending(arr) {
    return arr.sort(function(a, b) {
        return b - a;
    });
}

const originalArray = [5, 2, 9, 1, 5, 6];
const sortedArray = sortDescending(originalArray);

console.log(sortedArray);
