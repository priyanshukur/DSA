#include <iostream>
using namespace std;

bool isPalindrome(int x) {
    if (x < 0) return false;

    int original = x;
    int rev = 0;

    while (x != 0) {
        int digit = x % 10;
        rev = rev * 10 + digit;
        x = x / 10;
    }

    return original == rev;
}

int main() {
    cout << isPalindrome(121) << endl;   // 1 (true)
    cout << isPalindrome(-121) << endl;  // 0 (false)
    cout << isPalindrome(10) << endl;    // 0 (false)
}