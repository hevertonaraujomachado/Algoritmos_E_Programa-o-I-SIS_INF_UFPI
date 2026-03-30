#include <iostream>
using namespace std;

int main() {
    float base, altura;

    cout << "Digite base e altura: ";
    cin >> base >> altura;

    float area = (base * altura) / 2;

    cout << "Area = " << area << endl;
    return 0;
}