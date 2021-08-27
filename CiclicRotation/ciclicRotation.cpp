#include<vector>
#include<iostream>
using namespace std;



vector<int> solution(vector<int> &A, int K){
    int lon = A.size();
    if(lon == 0){
        vector<int> empty = {};
        return empty;
    }
    int shif= K % lon;
    int index = 0;
    vector<int> tmp(A.size(),0);
    while(index < lon){
        tmp[shif] = A[index];
        shif = (shif+1) % lon;
        index++;
    }
    return tmp;
}

int main(int argc, char const *argv[])
{

    // vector<int> A2 = {3, 8, 9, 7, 6};
    // vector<int> A2 = {1, 2, 3, 4};
    vector<int> A2 = {};
    A2 = solution(A2,4);
    for (size_t i = 0; i < A2.size(); i++)
    {
        cout<< A2[i];
    }
    
    return 0;
}
