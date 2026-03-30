#include <iostream>
using namespace std;

int main() {
    float comprimento, largura;
    cin >> comprimento >> largura;

    float perimetro = 2 * (comprimento + largura);

    cout << "Perimetro = " << perimetro << endl;
}