// Perform Operations
// easy
// Problem Statement
// You will be given a list of employees with their information in a JSON format as an argument. Your task is to implement a JavaScript function, performEmployeeOperations, that performs the following tasks:


// Find the employee with the highest salary and store it in the highestSalaryEmployee. Note, the highestSalaryEmployee logic has already been provided in the boilerplate. For the rest of the operations, you might have to look into array loop methods, like reduce, filter, map, etc.


// The employeesByDepartment returns an object of employees grouped by department. The department should be the key and an array of employees with their information as value.


// The averageAgeByDepartment returns an object, with the department as key and the average age of that department as value.


// employeesWithLongestName returns an array with the employee(s) information having the longest name(s).




// Note:
// **Remove the extra spaces from the list while inserting the list of employees in the input section.**
// Input
// The performEmployeeOperations function will take in an array of objects in JSON format. Each Object will have a name, age, department, and salary property.
// Output
// The performEmployeeOperations function should return an object of highestSalaryEmployee, employeesByDepartment, averageAgeByDepartment, employeesWithLongestName.

// highestSalaryEmployee should store the object of the employee having the highest salary.

// employeesByDepartment should return an object.

// averageAgeByDepartment should return an object.

// employeesWithLongestName should return an array of object.
// Example
// const employees = [{"name":"John","age":30,"department":"HR","salary":50000},{"name":"Jane","age":28,"department":"IT","salary":60000},{"name":"Mark","age":35,"department":"HR","salary":55000},{"name":"Alice","age":32,"department":"Finance","salary":65000},{"name":"Charlie","age":40,"department":"IT","salary":70000}]

// const operations = performEmployeeOperations(employees);

// console.log(operations.highestSalaryEmployee); // Output: { name: 'Charlie', age: 40, department: 'IT', salary: 70000 }

// console.log(operations.employeesByDepartment);
// // Output:
// {
// HR: [
// { name: 'John', age: 30, department: 'HR', salary: 50000 },
// { name: 'Mark', age: 35, department: 'HR', salary: 55000 }
// ],
// IT: [
// { name: 'Jane', age: 28, department: 'IT', salary: 60000 },
// { name: 'Charlie', age: 40, department: 'IT', salary: 70000 }
// ],
// Finance: [ { name: 'Alice', age: 32, department: 'Finance', salary: 65000 } ]
// }

// console.log(operations.averageAgeByDepartment); //Output: { HR: 32.5, IT: 34, Finance: 32 }

// console.log(operations.employeesWithLongestName); //Output: [ { name: 'Charlie', age: 40, department: 'IT', salary: 70000 } ]









//your code is here

function performEmployeeOperations(employees) {
    let highestSalaryEmployee = employees.reduce(
      (highest, employee) => (employee.salary > highest.salary ? employee : highest),
      { salary: 0 }
    );
  
    let employeesByDepartment = employees.reduce((departments, employee) => {
      if (departments[employee.department]) {
        departments[employee.department].push(employee);
      } else {
        departments[employee.department] = [employee];
      }
      return departments;
    }, {});
  
    let averageAgeByDepartment = Object.keys(employeesByDepartment).reduce(
      (averages, department) => {
        let totalAge = employeesByDepartment[department].reduce(
          (sum, employee) => sum + employee.age,
          0
        );
        averages[department] = totalAge / employeesByDepartment[department].length;
        return averages;
      },
      {}
    );
  
    let employeesWithLongestName = employees
      .sort((a, b) => b.name.length - a.name.length)
      .filter(
        (employee, i, employees) =>
          employee.name.length === employees[0].name.length
      );
  
    return {
      highestSalaryEmployee,
      employeesByDepartment,
      averageAgeByDepartment,
      employeesWithLongestName
    };
  }