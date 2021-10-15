# Codility Challenge: National Coding Week 2021

## LargestString

- Difficulty: Medium
- Find the alphabetically largest string that can be obtained by performing some substitutions.
- <https://app.codility.com/programmers/challenges/national_coding_week_2021/>
- <https://app.codility.com/programmers/task/largest_string/>

## Versions

- Result
  - `Good`: Correctness 100%, Performance 100%.
  - `OK`: Correctness 100%, Performance <100%.
  - `Fail`: Correctness <100%, Performance <100%.
- File naming convention
  - Code `A`: `NationalCodingWeek2021A.java`
  - etc

### Gold Award

| File | Complexity | Result | Report                                                                            |
| ---- | ---------- | ------ | --------------------------------------------------------------------------------- |
| `A`  | `O(N)`     | `Good` | [REXKN3](https://app.codility.com/cert/view/certREXKN3-6FXGRPMEJNBDHDDB/details/) |

### Java Implementation of Solution provided by Codility

| File | Description                                    | Complexity | Result | Report                                                              |
| ---- | ---------------------------------------------- | ---------- | ------ | ------------------------------------------------------------------- |
| `B`  | Using native String `indexOf` and `replaceAll` | `O(N**2)`  | `OK`   | [3SGBG9](https://app.codility.com/demo/results/training3SGBG9-ZZ3/) |
| `C1` | Using pointer                                  | `O(N**2)`  | `OK`   | [WSX8PG](https://app.codility.com/demo/results/trainingWSX8PG-V2F/) |
| `C2` | Using pointer, char array                      | `O(N)`     | `Good` | [9HS34G](https://app.codility.com/demo/results/training9HS34G-J9T/) |
| `D`  | Fibonacchi method with `BigInteger`            | `O(N**2)`  | `OK`   | [WWZ6SP](https://app.codility.com/demo/results/trainingWWZ6SP-AF7/) |
