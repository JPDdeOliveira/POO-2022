//Função principal 
void main() {
    print(aprovacao(12221, 6.7, 4.7, 2.3));
}


//Função responsável pela aprovação do aluno  
String aprovacao(int codigoAluno, double n1, double n2, double n3){
    int codigoAluno = 12332;
    double maiorNota;
    bool aprovado = true;
    double media = 0;    

    if(n1 >= n2 && n1 >= n3){
        maiorNota = n1;
        media = (4*maiorNota + 3*n2 + 3*n3)/(4+3+3);
    }else{
        if(n2 >= n1 && n2 >= n3){
            maiorNota = n2;
            media = (4*maiorNota + 3*n1 + 3*n3)/(4+3+3);
        }else{
            if(n3 >= n1 && n3 >= n2){
                maiorNota = n3;
                media = (4*maiorNota + 3*n2 + 3*n1)/(4+3+3);
            }
        }
    }
    if(media >= 5){
        aprovado = true; 
    }else{
        aprovado = false;
    }
    if(aprovado == true){
        print("Código do aluno: $codigoAluno");
        print("nota 1: $n1");
        print("nota 2: $n2");
        print("nota 3: $n3");
        print("media ponderada: $media");
        return "APROVADO";
    }else{
        print("Código do aluno: $codigoAluno");
        print("nota 1: $n1");
        print("nota 2: $n2");
        print("nota 3: $n3");
        print("media ponderada: $media");
        return "REPROVADO";   
    }
}