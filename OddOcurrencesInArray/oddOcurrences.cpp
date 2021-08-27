#include<vector>
#include<iostream>
using namespace std;

int numbersOfOcurrences(vector<int> &A, int a,int index){
    int ocurrences = 0;
    for (size_t i = 0; i < A.size(); i++)
    {
        if(A[i] == a){
            ocurrences++;
        }
    }
    return ocurrences;
}

int oddOcurrences(vector<int> &A){
    for (size_t i = 0; i < A.size(); i++)
    {
        if(numbersOfOcurrences(A,A[i],i) % 2 == 1){
            return A[i];
        }
    }
    return 0;

}
int oddOcurrencesLinear(vector<int> &A){
    if(A.size() == 1){
        return A[0];
    }
    int max = 0;
    for (size_t i = 0; i < A.size(); i++)
    {
        if(A[i] > max){
            max = A[i];
        }
    }
    vector<int> tmp(max+1,0);
    for (size_t i = 0; i < A.size(); i++)
    {
        tmp[A[i]]++;
    }

    for (size_t i = 0; i < tmp.size(); i++)
    {
        if(tmp[i] % 2 == 1){
            return i;
        }
    }
    return 0;
}

/*
    run time trouble wiht the linear implementation
    the Big One set the max value and it taker too long
    to respond, so I have to fix that problem
*/

int main(int argc, char const *argv[])
{
    int n = 999999;
    vector<int> tmp(n,0);
    tmp[999] = 1000000000;
    vector<int> A = {2, 2, 3, 3, 4};
    cout<< oddOcurrencesLinear(tmp)<<endl;
    return 0;
}
