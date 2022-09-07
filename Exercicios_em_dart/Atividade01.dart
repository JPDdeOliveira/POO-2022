void main() {
    int valorMaior = maiorValor(1,2,3);
    print(valorMaior);
}

int maiorValor(int x, int y, int z){
    int maior = 0;
    if(x >= y && x >= z){
        maior = x;
    }else{
        if(y >= x && y >= z){
            maior = y;
        }else{
            if(z >= x && z >= y){
                maior = z;
            }
        }
    }
    return maior;
}