#include <iostream>
using namespace std;

int main() {
    int a, b;
    cout << "Digite dois numeros: ";
    cin >> a >> b;

    int resto = a % b;

    cout << "Resto = " << resto << endl;
    return 0;
}