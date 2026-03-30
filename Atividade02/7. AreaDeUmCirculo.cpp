#include <iostream>
#include <cmath>
using namespace std;

int main() {
    float raio;
    cout << "Digite o raio: ";
    cin >> raio;

    float area = 3.1416 * pow(raio,2);

    cout << "Area = " << area << endl;
    return 0;
}
