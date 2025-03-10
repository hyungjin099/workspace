
const arr1 = [1, 2, 3];
const arr2 = [4, 5];

//[1, 4, 5, 2, 3];
const arr4 = [1, ...arr2, 2, 3];


const arr3 = [1, 2, 3, ...arr2];


//[1,2,3,4,5]
arr1[3] = arr2; // [1, 2, 3, [4, 5]]
//arr1.push(arr2);
console.log(arr1);


const person = {
  name : 'kim',
  age : 20
};

const score = {
  korScore : 80,
  mathScore : 100
};

const student = {
  ...person,
  ...score
};

const student1 = {
  person,
  score
};