// Get the Sudoku table element
const sudokuTable = document.getElementById('sudoku-table');

// Add event listeners to each input field
const inputFields = sudokuTable.getElementsByTagName('input');
for (let i = 0; i < inputFields.length; i++) {
  inputFields[i].addEventListener('input', handleInput);
}

// Event handler for input changes
function handleInput(event) {
  const input = event.target;
  const value = parseInt(input.value);

  // Validate the input
  if (isNaN(value) || value < 1 || value > 9) {
    input.value = '';
    return;
  }

  // Update the value in the table
  const cell = input.parentNode;
  const row = cell.parentNode;
  const rowIndex = row.rowIndex;
  const cellIndex = cell.cellIndex;
  sudokuBoard[rowIndex][cellIndex] = value;

  // Perform any necessary logic or checks here
  // ...

  // Example: Log the updated Sudoku board to the console
  console.log(sudokuBoard);
}

// Example Sudoku board for testing purposes
const sudokuBoard = [
  [5, 3, 0, 0, 7, 0, 0, 0, 0],
  [6, 0, 0, 1, 9, 5, 0, 0, 0],
  [0, 9, 8, 0, 0, 0, 0, 6, 0],
  [8, 0, 0, 0, 6, 0, 0, 0, 3],
  [4, 0, 0, 8, 0, 3, 0, 0, 1],
  [7, 0, 0, 0, 2, 0, 0, 0, 6],
  [0, 6, 0, 0, 0, 0, 2, 8, 0],
  [0, 0, 0, 4, 1, 9, 0, 0, 5],
  [0, 0, 0, 0, 8, 0, 0, 7, 9]
];
