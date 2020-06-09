#include<iostream>
#include<conio.h>
using namespace std;
main(){
    int num, k, i=0, cont=1, cifras[cont];

    cout<<"Dato de entrada: ";
    cin>>num;

    k = num;

    while(k/10>0){
        k/=10;
        cont++;
    }

    while(num>0){
        cifras[i]=num%10;
        num/=10;
        i++;
    }

    cout<<"\nDatos de salida: "<<endl;
    for(i=cont-1; i>=0; i--){
        cout<<"\t"<<cifras[i]<<endl;
    }
}