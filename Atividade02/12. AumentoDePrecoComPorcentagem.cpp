#include <iostream>
using namespace std;

int main() {
    float preco, porcentagem;

    cin >> preco >> porcentagem;

    float aumento = preco * (porcentagem/100);
    float novoPreco = preco + aumento;

    cout << "Novo preco = " << novoPreco << endl;
}