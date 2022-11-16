struct Solution {}

impl Solution {
    pub fn fizz_buzz(n: i32) -> Vec<String> {
        let mut vec: Vec<String> = Vec::new();
        for i in 1..n + 1 {
            if i % 3 == 0 && i % 5 == 0 {
                vec.push(String::from("FizzBuzz"));
                continue;
            }

            if (i % 3 == 0) {
                vec.push(String::from("Fizz"));
                continue;
            }

            if (i % 5 == 0) {
                vec.push(String::from("Buzz"));
                continue;
            }

            vec.push(i.to_string());
        }
        return vec;
    }
}

fn main() {
    println!("{:?}", Solution::fizz_buzz(15));
}
